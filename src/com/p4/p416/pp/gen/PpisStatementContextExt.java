package com.p4.p416.pp.gen;


import lombok.Getter;
import  org.antlr.v4.runtime.ParserRuleContext;

import com.p4.p416.pp.gen.*;
import com.p4.p416.pp.gen.P416PPParser.*;

public class PpisStatementContextExt extends AbstractBaseExt {

	@Getter private PpisStatementContext ctx;

	public PpisStatementContextExt(PpisStatementContext ctx) {
		this.ctx = ctx;

	}

	@Override
	public  PpisStatementContext getContext(){
		return (PpisStatementContext)contexts.get(contexts.size()-1);
	}

	@Override
	public PpisStatementContext getContext(String str){
		return (PpisStatementContext)new PopulateExtendedContextVisitor().visit(getParser(str).ppisStatement());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof PpisStatementContext){
				addToContexts((PpisStatementContext) ctx);
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be casted to "+ PpisStatementContext.class.getName());
			}
		} else {
			addToContexts(null);
		}
	}
}