package com.p4.p416.pp.gen;


import lombok.Getter;
import  org.antlr.v4.runtime.ParserRuleContext;

import com.p4.p416.pp.gen.*;
import com.p4.p416.pp.gen.P416PPParser.*;

public class PpdfIdContextExt extends AbstractBaseExt {

	@Getter private PpdfIdContext ctx;

	public PpdfIdContextExt(PpdfIdContext ctx) {
		this.ctx = ctx;

	}

	@Override
	public  PpdfIdContext getContext(){
		return (PpdfIdContext)contexts.get(contexts.size()-1);
	}

	@Override
	public PpdfIdContext getContext(String str){
		return (PpdfIdContext)new PopulateExtendedContextVisitor().visit(getParser(str).ppdfId());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof PpdfIdContext){
				addToContexts((PpdfIdContext) ctx);
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be casted to "+ PpdfIdContext.class.getName());
			}
		} else {
			addToContexts(null);
		}
	}
}