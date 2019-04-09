package com.p4.p416.pp.gen;


import lombok.Getter;
import  org.antlr.v4.runtime.ParserRuleContext;

import com.p4.p416.pp.gen.*;
import com.p4.p416.pp.gen.P416PPParser.*;

public class PpIfStatementContextExt extends AbstractBaseExt {

	@Getter private PpIfStatementContext ctx;

	public PpIfStatementContextExt(PpIfStatementContext ctx) {
		this.ctx = ctx;

	}

	@Override
	public  PpIfStatementContext getContext(){
		return (PpIfStatementContext)contexts.get(contexts.size()-1);
	}

	@Override
	public PpIfStatementContext getContext(String str){
		return (PpIfStatementContext)new PopulateExtendedContextVisitor().visit(getParser(str).ppIfStatement());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof PpIfStatementContext){
				addToContexts((PpIfStatementContext) ctx);
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be casted to "+ PpIfStatementContext.class.getName());
			}
		} else {
			addToContexts(null);
		}
	}
}