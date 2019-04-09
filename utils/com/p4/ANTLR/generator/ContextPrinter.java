package com.p4.ANTLR.generator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import com.p4.ANTLRv4.gen.ANTLRv4Lexer;
import com.p4.ANTLRv4.gen.ANTLRv4Parser;

import lombok.Data;


public class ContextPrinter {


	@Data
	private  class Params{
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
		private int beginingOfAlignemtText;

		@Override
		public String toString()
		{
			StringBuilder sb = new StringBuilder();

			sb.append("Context = " + context.getClass().getSimpleName() +"\n"+ context.getText()); sb.append("\n");
			sb.append("Text = "+ stringBuilder.toString()); sb.append("\n");
			sb.append("start ="+beginingOfAlignemtText); sb.append("\n");
			return sb.toString();
		}

	}



	private  void getFormattedText(Params params){
		ParserRuleContext ctx = params.getContext();
		if(ctx != null && ctx.children != null && ctx.children.size()>0){
			for(ParseTree childCtx : ctx.children){
				if(childCtx instanceof TerminalNode){
					printTerminalNode((TerminalNode)childCtx,params);
				}
				else if(childCtx.getText().length() >0){
					params.setContext((ParserRuleContext)childCtx);
					getFormattedText(params);
				}
			}
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

	public  String getFormattedText(ParserRuleContext ctx){
		StringBuilder sb = new StringBuilder();
		Params params = new Params(ctx, sb);
		params.setBeginingOfAlignemtText(ctx.start.getStartIndex());
		getFormattedText(params);
		return sb.toString();
	}
	
	public  String getFormattedText(TerminalNode node){
		return node.getText();
	}


	public static void main(String[] args)
	{
		ContextPrinter contextPrinter = new ContextPrinter();

		File inputFile = new File("grammar/p416_new.g4");
		InputStream inputStream;
		ANTLRInputStream antlrInputStream = null;

		try {
			inputStream = new FileInputStream(inputFile);
			antlrInputStream = new ANTLRInputStream(inputStream);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		ANTLRv4Lexer lexer = new ANTLRv4Lexer(antlrInputStream);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ANTLRv4Parser parser = new ANTLRv4Parser(tokens);
		ANTLRv4Parser.GrammarSpecContext grammarSpecContext = parser.grammarSpec();
		LocalsPopulatingVisitor localsPopulatingVisitor = new LocalsPopulatingVisitor();
		localsPopulatingVisitor.visit(grammarSpecContext);
		System.out.println(contextPrinter.getFormattedText(grammarSpecContext));

	}


}
