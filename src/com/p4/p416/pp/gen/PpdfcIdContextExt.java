package com.p4.p416.pp.gen;


import lombok.Getter;
import  org.antlr.v4.runtime.ParserRuleContext;

import com.p4.p416.pp.gen.*;
import com.p4.p416.pp.gen.P416PPParser.*;

public class PpdfcIdContextExt extends AbstractBaseExt {

	@Getter private PpdfcIdContext ctx;

	public PpdfcIdContextExt(PpdfcIdContext ctx) {
		this.ctx = ctx;

	}

	@Override
	public  PpdfcIdContext getContext(){
		return (PpdfcIdContext)contexts.get(contexts.size()-1);
	}

	@Override
	public PpdfcIdContext getContext(String str){
		return (PpdfcIdContext)new PopulateExtendedContextVisitor().visit(getParser(str).ppdfcId());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof PpdfcIdContext){
				addToContexts((PpdfcIdContext) ctx);
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be casted to "+ PpdfcIdContext.class.getName());
			}
		} else {
			addToContexts(null);
		}
	}
}