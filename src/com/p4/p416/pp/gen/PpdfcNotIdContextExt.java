package com.p4.p416.pp.gen;


import lombok.Getter;
import  org.antlr.v4.runtime.ParserRuleContext;

import com.p4.p416.pp.gen.*;
import com.p4.p416.pp.gen.P416PPParser.*;

public class PpdfcNotIdContextExt extends AbstractBaseExt {

	@Getter private PpdfcNotIdContext ctx;

	public PpdfcNotIdContextExt(PpdfcNotIdContext ctx) {
		this.ctx = ctx;

	}

	@Override
	public  PpdfcNotIdContext getContext(){
		return (PpdfcNotIdContext)contexts.get(contexts.size()-1);
	}

	@Override
	public PpdfcNotIdContext getContext(String str){
		return (PpdfcNotIdContext)new PopulateExtendedContextVisitor().visit(getParser(str).ppdfcNotId());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof PpdfcNotIdContext){
				addToContexts((PpdfcNotIdContext) ctx);
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be casted to "+ PpdfcNotIdContext.class.getName());
			}
		} else {
			addToContexts(null);
		}
	}
}