package com.p4.p416.pp.gen;

import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.p4.p416.pp.gen.*;
import com.p4.p416.pp.gen.P416PPParser.*;
import com.p4.pp.runner.PreprocessRunnerSession;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Data
public abstract class AbstractBaseExt {
	protected static final Logger L = LoggerFactory.getLogger(AbstractBaseExt.class);
	//variables
	private ExtendedContextGetVisitor extendedContextGetVisitor;


	@Setter(AccessLevel.NONE)
	protected List<ParserRuleContext> contexts;

	//abstract methods
	abstract public ParserRuleContext getContext();
	abstract public ParserRuleContext getContext(String str);
	abstract public void setContext(ParserRuleContext ctx);

	//constructor
	public AbstractBaseExt(){
		extendedContextGetVisitor = new ExtendedContextGetVisitor();
		contexts = new ArrayList<ParserRuleContext>();
	}

	//This method is not exposed outside.
	protected P416PPParser getParser(String str){
		P416PPLexer lexer = new P416PPLexer(new ANTLRInputStream(str));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		return new P416PPParser(tokens);
	}

	protected void addToContexts(ParserRuleContext context)
	{
		AbstractBaseExt extCtx = getExtendedContext(context);
		if(extCtx != null){
			extCtx.contexts = contexts;
		}
		contexts.add(context);
	}


	public AbstractBaseExt getExtendedContext(ParseTree context)
	{
		if(context != null){
			return extendedContextGetVisitor.visit(context);
		} else{
			L.warn("Returning Null for extendedContext");
			return null;
		}
	}

	@Data
	public class Params{
		public Params( ParserRuleContext ctx, StringBuilder sb)
		{
			this.context = ctx;
			beginingOfAlignemtText = 0;
			input = ctx.start.getInputStream();
			this.stringBuilder = sb;
		}
		private ParserRuleContext context;
		private CharStream input;
		private StringBuilder stringBuilder;
		//private int endOfAlignmentText;
		private int beginingOfAlignemtText;

		@Override
		public String toString()
		{
			StringBuilder sb = new StringBuilder();

			sb.append("Context = " + context.getClass().getSimpleName() +"\n"+ context.getText()); sb.append("\n");
			sb.append("Text = "+ stringBuilder.toString()); sb.append("\n");
			sb.append("start ="+beginingOfAlignemtText); sb.append("\n");
			//sb.append("end = "+endOfAlignmentText);sb.append("\n");
			return sb.toString();
		}

	}

	//getFormattedText() app
	public String getFormattedText(){
		StringBuilder sb = new StringBuilder();
		Params params = new Params(getContext(), sb);
		params.setBeginingOfAlignemtText(getContext().start.getStartIndex());
		getFormattedText(params);
		//logger.debug("output =\n" + sb.toString());
		return sb.toString();
	}

	protected void getFormattedText(Params params){
		ParserRuleContext ctx = getContext();
		if(ctx != null && ctx.children != null && ctx.children.size()>0){
			for(ParseTree childCtx : ctx.children){
				if(childCtx instanceof TerminalNode){
					printTerminalNode((TerminalNode)childCtx,params);
				}
				else if(childCtx.getText().length() >0){
					params.setContext((ParserRuleContext)childCtx);
					Params thisCtxParams = getExtendedContext(childCtx).getUpdatedParams(params);
					getExtendedContext(childCtx).getFormattedText(thisCtxParams);
				}
			}
			getUpdatedParams(params);
		}
	}

	/*
	 * check if they are pointing to the same char stream, else it resets the 
	 * params with the new char stream params.
	 */

	private Params getUpdatedParams(Params params) {

		if ( getContext() == null)
		{
			//The item is removed during the transformation, hence skip its contents.
			String alignmentText = params.getInput().getText(new Interval(params.beginingOfAlignemtText, params.getContext().start.getStartIndex()-1));
			params.getStringBuilder().append(alignmentText);
			params.setBeginingOfAlignemtText(params.getContext().stop.getStopIndex() + 1); 
			return null;
		}
		if (getContext().start.getInputStream() != params.getContext().start.getInputStream())
		{
			/*
			 * advance the  begining of  alignment text, as we are going to consider 'mostRecentContext' in its place.
			 */
			if ( params.beginingOfAlignemtText  <  params.getContext().start.getStartIndex())
			{
				String alignmentText = params.getInput().getText(new Interval(params.beginingOfAlignemtText, params.getContext().start.getStartIndex()-1));
				params.getStringBuilder().append(alignmentText);
			}
			params.setBeginingOfAlignemtText(params.getContext().stop.getStopIndex() + 1); 
			return new Params(getContext(),params.getStringBuilder());
		}
		else
		{
			if (getContext().parent == null)
			{
				String alignmentText = params.getInput().getText(new Interval(params.beginingOfAlignemtText, params.getContext().start.getInputStream().size()));
				params.getStringBuilder().append(alignmentText);
			}
			params.setContext(getContext());
			return params;
		}
	}


	private void printTerminalNode(TerminalNode node,Params params){
		CharStream input = params.getContext().start.getInputStream();
		if(node.getText().equals("<EOF>")){
			String end = input.getText(new Interval(params.getBeginingOfAlignemtText(),input.size()));
			params.getStringBuilder().append(end);
		} else {
			if(params.getBeginingOfAlignemtText() < node.getSymbol().getStartIndex()){
				Interval alignmentTextInterval = new Interval(params.getBeginingOfAlignemtText(),node.getSymbol().getStartIndex()-1);
				String alignmentText = input.getText(alignmentTextInterval);
				params.getStringBuilder().append(alignmentText);
			}
			params.getStringBuilder().append(node.getText());
			params.setBeginingOfAlignemtText(node.getSymbol().getStopIndex()+1);
		}
	}

	
	public List<StatementContext> preprocessing(PreprocessRunnerSession proteusRunnerSession){
		ParserRuleContext ctx = getContext();
		List<StatementContext> statementContexts = new ArrayList<StatementContext>();
		if(ctx != null && ctx.children != null && ctx.children.size()>0){
			for(ParseTree childCtx : ctx.children){
				if(!(childCtx instanceof TerminalNode) && childCtx.getText().length() >0){
					List<StatementContext>  scs = getExtendedContext(childCtx).preprocessing(proteusRunnerSession);
					if( scs.size()>0){
						statementContexts.addAll(scs);
					}
				}
			}
		}
		return statementContexts;
	}
}