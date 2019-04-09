package com.p4.p416.pp.gen;


import lombok.Getter;
import  org.antlr.v4.runtime.ParserRuleContext;

import com.p4.p416.pp.gen.*;
import com.p4.p416.pp.gen.P416PPParser.*;

public class PpdfiArgumentsContextExt extends AbstractBaseExt {

	@Getter private PpdfiArgumentsContext ctx;

	public PpdfiArgumentsContextExt(PpdfiArgumentsContext ctx) {
		this.ctx = ctx;

	}

	@Override
	public  PpdfiArgumentsContext getContext(){
		return (PpdfiArgumentsContext)contexts.get(contexts.size()-1);
	}

	@Override
	public PpdfiArgumentsContext getContext(String str){
		return (PpdfiArgumentsContext)new PopulateExtendedContextVisitor().visit(getParser(str).ppdfiArguments());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof PpdfiArgumentsContext){
				addToContexts((PpdfiArgumentsContext) ctx);
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be casted to "+ PpdfiArgumentsContext.class.getName());
			}
		} else {
			addToContexts(null);
		}
	}
}