package com.p4.p416.pp.gen;


import lombok.Getter;
import  org.antlr.v4.runtime.ParserRuleContext;

import com.p4.p416.pp.gen.*;
import com.p4.p416.pp.gen.P416PPParser.*;

public class PpDefineFuncContextExt extends AbstractBaseExt {

	@Getter private PpDefineFuncContext ctx;

	public PpDefineFuncContextExt(PpDefineFuncContext ctx) {
		this.ctx = ctx;

	}

	@Override
	public  PpDefineFuncContext getContext(){
		return (PpDefineFuncContext)contexts.get(contexts.size()-1);
	}

	@Override
	public PpDefineFuncContext getContext(String str){
		return (PpDefineFuncContext)new PopulateExtendedContextVisitor().visit(getParser(str).ppDefineFunc());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof PpDefineFuncContext){
				addToContexts((PpDefineFuncContext) ctx);
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be casted to "+ PpDefineFuncContext.class.getName());
			}
		} else {
			addToContexts(null);
		}
	}
}