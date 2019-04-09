package com.p4.p416.pp.gen;


import lombok.Getter;
import  org.antlr.v4.runtime.ParserRuleContext;

import com.p4.p416.pp.gen.*;
import com.p4.p416.pp.gen.P416PPParser.*;

public class PpCharContextExt extends AbstractBaseExt {

	@Getter private PpCharContext ctx;

	public PpCharContextExt(PpCharContext ctx) {
		this.ctx = ctx;

	}

	@Override
	public  PpCharContext getContext(){
		return (PpCharContext)contexts.get(contexts.size()-1);
	}

	@Override
	public PpCharContext getContext(String str){
		return (PpCharContext)new PopulateExtendedContextVisitor().visit(getParser(str).ppChar());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof PpCharContext){
				addToContexts((PpCharContext) ctx);
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be casted to "+ PpCharContext.class.getName());
			}
		} else {
			addToContexts(null);
		}
	}
}