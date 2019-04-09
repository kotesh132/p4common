package com.p4.p416.pp.gen;


import lombok.Getter;
import  org.antlr.v4.runtime.ParserRuleContext;

import com.p4.p416.pp.gen.*;
import com.p4.p416.pp.gen.P416PPParser.*;

public class PpErrorContextExt extends AbstractBaseExt {

	@Getter private PpErrorContext ctx;

	public PpErrorContextExt(PpErrorContext ctx) {
		this.ctx = ctx;

	}

	@Override
	public  PpErrorContext getContext(){
		return (PpErrorContext)contexts.get(contexts.size()-1);
	}

	@Override
	public PpErrorContext getContext(String str){
		return (PpErrorContext)new PopulateExtendedContextVisitor().visit(getParser(str).ppError());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof PpErrorContext){
				addToContexts((PpErrorContext) ctx);
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be casted to "+ PpErrorContext.class.getName());
			}
		} else {
			addToContexts(null);
		}
	}
}