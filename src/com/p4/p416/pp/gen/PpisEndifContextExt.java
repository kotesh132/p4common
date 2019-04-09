package com.p4.p416.pp.gen;


import lombok.Getter;
import  org.antlr.v4.runtime.ParserRuleContext;

import com.p4.p416.pp.gen.*;
import com.p4.p416.pp.gen.P416PPParser.*;

public class PpisEndifContextExt extends AbstractBaseExt {

	@Getter private PpisEndifContext ctx;

	public PpisEndifContextExt(PpisEndifContext ctx) {
		this.ctx = ctx;

	}

	@Override
	public  PpisEndifContext getContext(){
		return (PpisEndifContext)contexts.get(contexts.size()-1);
	}

	@Override
	public PpisEndifContext getContext(String str){
		return (PpisEndifContext)new PopulateExtendedContextVisitor().visit(getParser(str).ppisEndif());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof PpisEndifContext){
				addToContexts((PpisEndifContext) ctx);
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be casted to "+ PpisEndifContext.class.getName());
			}
		} else {
			addToContexts(null);
		}
	}
}