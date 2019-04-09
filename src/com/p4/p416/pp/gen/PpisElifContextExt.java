package com.p4.p416.pp.gen;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

import  org.antlr.v4.runtime.ParserRuleContext;

import com.p4.p416.pp.MacroKey;
import com.p4.p416.pp.gen.P416PPParser.*;
import com.p4.pp.runner.PreprocessRunnerSession;

public class PpisElifContextExt extends AbstractBaseExt {

	@Getter private PpisElifContext ctx;

	public PpisElifContextExt(PpisElifContext ctx) {
		this.ctx = ctx;

	}

	@Override
	public  PpisElifContext getContext(){
		return (PpisElifContext)contexts.get(contexts.size()-1);
	}

	@Override
	public PpisElifContext getContext(String str){
		return (PpisElifContext)new PopulateExtendedContextVisitor().visit(getParser(str).ppisElif());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof PpisElifContext){
				addToContexts((PpisElifContext) ctx);
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be casted to "+ PpisElifContext.class.getName());
			}
		} else {
			addToContexts(null);
		}
	}
	//ppisElif :    PREPROCESS_BEGIN    WS*    PREPROCESS_ELIF        WS+    ppChars    WS*    NEWLINE   ppisStatement    ppisElifElseEndif    ;
	@Override
	public List<StatementContext> preprocessing(PreprocessRunnerSession prs){
		List<StatementContext> statementContexts = new ArrayList<StatementContext>();
		if(ctx != null && ctx.children != null && ctx.children.size()>0){
			String macroName = null;
			if(ctx.ppChars().ppCharsWithBegin().ppId()!=null && ctx.ppChars().ppCharsWithBegin().ppId().size()>0)  macroName = ctx.ppChars().ppCharsWithBegin().ppId().get(0).getText();
			else if(ctx.ppChars().ppCharsWithOutBegin().ppId()!=null && ctx.ppChars().ppCharsWithOutBegin().ppId().size()>0)  macroName = ctx.ppChars().ppCharsWithOutBegin().ppId().get(0).getText();
			else if(ctx.ppChars().ppCharsWithBegin().ppChar()!=null && ctx.ppChars().ppCharsWithBegin().ppChar().size()>0)  macroName = ctx.ppChars().ppCharsWithBegin().ppChar().get(0).getText();
			else if(ctx.ppChars().ppCharsWithOutBegin().ppChar()!=null && ctx.ppChars().ppCharsWithOutBegin().ppChar().size()>0)  macroName = ctx.ppChars().ppCharsWithOutBegin().ppChar().get(0).getText();
			if(macroName!=null){
				MacroKey macroKey = new MacroKey();
				macroKey.setMacroName(macroName);
				macroKey.setNoOfParameters(0);
				if(prs.getMacroMap().containsKey(macroKey)){
					statementContexts = getExtendedContext(ctx.ppisStatement()).preprocessing(prs);
				}
				else {
					statementContexts = getExtendedContextGetVisitor().visit(ctx.ppisElifElseEndif()).preprocessing(prs);
				}
			}
		}
		return statementContexts;
	}
}