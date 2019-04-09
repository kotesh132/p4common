package com.p4.p416.pp.gen;


import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

import  org.antlr.v4.runtime.ParserRuleContext;

import com.p4.p416.pp.MacroKey;
import com.p4.p416.pp.gen.*;
import com.p4.p416.pp.gen.P416PPParser.*;
import com.p4.pp.runner.PreprocessRunnerSession;

public class PpisIfNdefContextExt extends AbstractBaseExt {

	@Getter private PpisIfNdefContext ctx;

	public PpisIfNdefContextExt(PpisIfNdefContext ctx) {
		this.ctx = ctx;

	}

	@Override
	public  PpisIfNdefContext getContext(){
		return (PpisIfNdefContext)contexts.get(contexts.size()-1);
	}

	@Override
	public PpisIfNdefContext getContext(String str){
		return (PpisIfNdefContext)new PopulateExtendedContextVisitor().visit(getParser(str).ppisIfNdef());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof PpisIfNdefContext){
				addToContexts((PpisIfNdefContext) ctx);
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be casted to "+ PpisIfNdefContext.class.getName());
			}
		} else {
			addToContexts(null);
		}
	}
	
	//ppisIfNdef  :    PREPROCESS_BEGIN    WS*    PREPROCESS_IFNDEF    WS+    ID        WS*    NEWLINE            ppisStatement    ppisElseEndif    ;
	@Override
	public List<StatementContext> preprocessing(PreprocessRunnerSession prs){
		List<StatementContext> statementContexts = new ArrayList<StatementContext>();
		if(ctx != null && ctx.children != null && ctx.children.size()>0){
			if(ctx.ID().getText()!=null){
				String macroName = ctx.ID().getText();
				MacroKey macroKey = new MacroKey();
				macroKey.setMacroName(macroName);
				macroKey.setNoOfParameters(0);
				if(!prs.getMacroMap().containsKey(macroKey)){
					statementContexts = getExtendedContext(ctx.ppisStatement()).preprocessing(prs);
				}
				else {
					statementContexts = getExtendedContext(ctx.ppisElseEndif()).preprocessing(prs);

				}
			}
		}
		return statementContexts;
	}
}