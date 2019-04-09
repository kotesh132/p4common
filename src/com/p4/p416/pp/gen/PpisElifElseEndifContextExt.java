package com.p4.p416.pp.gen;


import lombok.Getter;
import  org.antlr.v4.runtime.ParserRuleContext;

import com.p4.p416.pp.gen.*;
import com.p4.p416.pp.gen.P416PPParser.*;

public class PpisElifElseEndifContextExt extends AbstractBaseExt {

	@Getter private PpisElifElseEndifContext ctx;

	public PpisElifElseEndifContextExt(PpisElifElseEndifContext ctx) {
		this.ctx = ctx;

	}

	@Override
	public  PpisElifElseEndifContext getContext(){
		return (PpisElifElseEndifContext)contexts.get(contexts.size()-1);
	}

	@Override
	public PpisElifElseEndifContext getContext(String str){
		return (PpisElifElseEndifContext)new PopulateExtendedContextVisitor().visit(getParser(str).ppisElifElseEndif());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof PpisElifElseEndifContext){
				addToContexts((PpisElifElseEndifContext) ctx);
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be casted to "+ PpisElifElseEndifContext.class.getName());
			}
		} else {
			addToContexts(null);
		}
	}
}