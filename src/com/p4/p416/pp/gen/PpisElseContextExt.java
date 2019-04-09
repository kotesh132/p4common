package com.p4.p416.pp.gen;


import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

import  org.antlr.v4.runtime.ParserRuleContext;

import com.p4.p416.pp.gen.*;
import com.p4.p416.pp.gen.P416PPParser.*;
import com.p4.pp.runner.PreprocessRunnerSession;

public class PpisElseContextExt extends AbstractBaseExt {

	@Getter private PpisElseContext ctx;

	public PpisElseContextExt(PpisElseContext ctx) {
		this.ctx = ctx;

	}

	@Override
	public  PpisElseContext getContext(){
		return (PpisElseContext)contexts.get(contexts.size()-1);
	}

	@Override
	public PpisElseContext getContext(String str){
		return (PpisElseContext)new PopulateExtendedContextVisitor().visit(getParser(str).ppisElse());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof PpisElseContext){
				addToContexts((PpisElseContext) ctx);
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be casted to "+ PpisElseContext.class.getName());
			}
		} else {
			addToContexts(null);
		}
	}
	
	//ppisElse  :    PREPROCESS_BEGIN    WS*    PREPROCESS_ELSE WS*    NEWLINE            ppisStatement    ppisEndif    ;
	
	@Override
	public List<StatementContext> preprocessing(PreprocessRunnerSession prs){
		List<StatementContext> statementContexts = new ArrayList<StatementContext>();
		if(ctx != null && ctx.children != null && ctx.children.size()>0){
			statementContexts = getExtendedContext(ctx.ppisStatement()).preprocessing(prs);
		}
		return statementContexts;
	}
}