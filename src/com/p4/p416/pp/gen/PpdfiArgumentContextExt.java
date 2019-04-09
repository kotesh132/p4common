package com.p4.p416.pp.gen;


import lombok.Getter;
import  org.antlr.v4.runtime.ParserRuleContext;

import com.p4.p416.pp.gen.*;
import com.p4.p416.pp.gen.P416PPParser.*;

public class PpdfiArgumentContextExt extends AbstractBaseExt {

	@Getter private PpdfiArgumentContext ctx;

	public PpdfiArgumentContextExt(PpdfiArgumentContext ctx) {
		this.ctx = ctx;

	}

	@Override
	public  PpdfiArgumentContext getContext(){
		return (PpdfiArgumentContext)contexts.get(contexts.size()-1);
	}

	@Override
	public PpdfiArgumentContext getContext(String str){
		return (PpdfiArgumentContext)new PopulateExtendedContextVisitor().visit(getParser(str).ppdfiArgument());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof PpdfiArgumentContext){
				addToContexts((PpdfiArgumentContext) ctx);
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be casted to "+ PpdfiArgumentContext.class.getName());
			}
		} else {
			addToContexts(null);
		}
	}
}