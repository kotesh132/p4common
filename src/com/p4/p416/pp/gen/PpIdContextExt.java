package com.p4.p416.pp.gen;


import lombok.Getter;
import  org.antlr.v4.runtime.ParserRuleContext;

import com.p4.p416.pp.gen.*;
import com.p4.p416.pp.gen.P416PPParser.*;

public class PpIdContextExt extends AbstractBaseExt {

	@Getter private PpIdContext ctx;

	public PpIdContextExt(PpIdContext ctx) {
		this.ctx = ctx;

	}

	@Override
	public  PpIdContext getContext(){
		return (PpIdContext)contexts.get(contexts.size()-1);
	}

	@Override
	public PpIdContext getContext(String str){
		return (PpIdContext)new PopulateExtendedContextVisitor().visit(getParser(str).ppId());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof PpIdContext){
				addToContexts((PpIdContext) ctx);
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be casted to "+ PpIdContext.class.getName());
			}
		} else {
			addToContexts(null);
		}
	}
}