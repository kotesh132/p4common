package com.p4.p416.pp.gen;


import lombok.Getter;

import  org.antlr.v4.runtime.ParserRuleContext;

import com.p4.p416.pp.gen.P416PPParser.*;

public class PpCharsContextExt extends AbstractBaseExt {

	@Getter private PpCharsContext ctx;

	public PpCharsContextExt(PpCharsContext ctx) {
		this.ctx = ctx;

	}

	@Override
	public  PpCharsContext getContext(){
		return (PpCharsContext)contexts.get(contexts.size()-1);
	}

	@Override
	public PpCharsContext getContext(String str){
		return (PpCharsContext)new PopulateExtendedContextVisitor().visit(getParser(str).ppChars());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof PpCharsContext){
				addToContexts((PpCharsContext) ctx);
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be casted to "+ PpCharsContext.class.getName());
			}
		} else {
			addToContexts(null);
		}
	}
	
}