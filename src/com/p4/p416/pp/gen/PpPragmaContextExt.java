package com.p4.p416.pp.gen;


import lombok.Getter;
import  org.antlr.v4.runtime.ParserRuleContext;

import com.p4.p416.pp.gen.*;
import com.p4.p416.pp.gen.P416PPParser.*;

public class PpPragmaContextExt extends AbstractBaseExt {

	@Getter private PpPragmaContext ctx;

	public PpPragmaContextExt(PpPragmaContext ctx) {
		this.ctx = ctx;

	}

	@Override
	public  PpPragmaContext getContext(){
		return (PpPragmaContext)contexts.get(contexts.size()-1);
	}

	@Override
	public PpPragmaContext getContext(String str){
		return (PpPragmaContext)new PopulateExtendedContextVisitor().visit(getParser(str).ppPragma());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof PpPragmaContext){
				addToContexts((PpPragmaContext) ctx);
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be casted to "+ PpPragmaContext.class.getName());
			}
		} else {
			addToContexts(null);
		}
	}
}