package com.p4.p416.pp.gen;


import lombok.Getter;
import  org.antlr.v4.runtime.ParserRuleContext;

import com.p4.p416.pp.gen.*;
import com.p4.p416.pp.gen.P416PPParser.*;

public class PpisElseEndifContextExt extends AbstractBaseExt {

	@Getter private PpisElseEndifContext ctx;

	public PpisElseEndifContextExt(PpisElseEndifContext ctx) {
		this.ctx = ctx;

	}

	@Override
	public  PpisElseEndifContext getContext(){
		return (PpisElseEndifContext)contexts.get(contexts.size()-1);
	}

	@Override
	public PpisElseEndifContext getContext(String str){
		return (PpisElseEndifContext)new PopulateExtendedContextVisitor().visit(getParser(str).ppisElseEndif());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof PpisElseEndifContext){
				addToContexts((PpisElseEndifContext) ctx);
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be casted to "+ PpisElseEndifContext.class.getName());
			}
		} else {
			addToContexts(null);
		}
	}
}