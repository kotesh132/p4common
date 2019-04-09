package com.p4.p416.pp.gen;


import lombok.Getter;
import  org.antlr.v4.runtime.ParserRuleContext;

import com.p4.p416.pp.gen.*;
import com.p4.p416.pp.gen.P416PPParser.*;

public class ProgramContextExt extends AbstractBaseExt {

	@Getter private ProgramContext ctx;

	public ProgramContextExt(ProgramContext ctx) {
		this.ctx = ctx;

	}

	@Override
	public  ProgramContext getContext(){
		return (ProgramContext)contexts.get(contexts.size()-1);
	}

	@Override
	public ProgramContext getContext(String str){
		return (ProgramContext)new PopulateExtendedContextVisitor().visit(getParser(str).program());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof ProgramContext){
				addToContexts((ProgramContext) ctx);
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be casted to "+ ProgramContext.class.getName());
			}
		} else {
			addToContexts(null);
		}
	}
}