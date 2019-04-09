package com.p4.p416.pp.gen;


import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

import  org.antlr.v4.runtime.ParserRuleContext;

import com.p4.p416.pp.MacroKey;
import com.p4.p416.pp.gen.P416PPParser.*;
import com.p4.pp.runner.PreprocessRunnerSession;

public class PpisIFContextExt extends AbstractBaseExt {

	@Getter private PpisIFContext ctx;

	public PpisIFContextExt(PpisIFContext ctx) {
		this.ctx = ctx;

	}

	@Override
	public  PpisIFContext getContext(){
		return (PpisIFContext)contexts.get(contexts.size()-1);
	}

	@Override
	public PpisIFContext getContext(String str){
		return (PpisIFContext)new PopulateExtendedContextVisitor().visit(getParser(str).ppisIF());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof PpisIFContext){
				addToContexts((PpisIFContext) ctx);
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be casted to "+ PpisIFContext.class.getName());
			}
		} else {
			addToContexts(null);
		}
	}

	//ppChars  :    ( STRING | WS | PREPROCESS_BEGIN | DEFINED | ppId | PREPROCESS_IF | PREPROCESS_ELSE | COMMA | PAREN_OPEN | PAREN_CLOSE | CHAR )+    ;
	//ppisIF  : PREPROCESS_BEGIN WS* PREPROCESS_IF   WS+    ppChars    WS*    NEWLINE ppisStatement    ppisElifElseEndif    ;
	@Override
	public List<StatementContext> preprocessing(PreprocessRunnerSession prs){
		List<StatementContext> statementContexts = new ArrayList<StatementContext>();
		if(ctx != null && ctx.children != null && ctx.children.size()>0){
			String macroName = null;
			if (ctx.ppChars()!= null) {
				PpCharsWithBeginContext beginCtx = ctx.ppChars().ppCharsWithBegin();
				PpCharsWithOutBeginContext withOutBeginCtx = ctx.ppChars().ppCharsWithOutBegin();

				if(beginCtx != null) {
					if(beginCtx.ppId() != null && beginCtx.ppId().size() >0)
						macroName = beginCtx.ppId().get(0).getText();
					else if(beginCtx.ppChar() != null && beginCtx.ppChar().size()>0)
						macroName = beginCtx.ppChar().get(0).getText();
				} else if(withOutBeginCtx != null) {
					if(withOutBeginCtx.ppId() != null && withOutBeginCtx.ppId().size() >0)
						macroName = withOutBeginCtx.ppId().get(0).getText();
					else if(withOutBeginCtx.ppChar() != null && withOutBeginCtx.ppChar().size()>0)
						macroName = withOutBeginCtx.ppChar().get(0).getText();
				}
			}

			if(macroName!=null){
				MacroKey macroKey = new MacroKey();
				macroKey.setMacroName(macroName);
				macroKey.setNoOfParameters(0);
				if(prs.getMacroMap().containsKey(macroKey)){
					statementContexts = getExtendedContextGetVisitor().visit(ctx.ppisStatement()).preprocessing(prs);
				}
				else {
					statementContexts = getExtendedContextGetVisitor().visit(ctx.ppisElifElseEndif()).preprocessing(prs);
				}
			}
		}
		return statementContexts;
	}
}