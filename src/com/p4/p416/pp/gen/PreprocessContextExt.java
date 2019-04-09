package com.p4.p416.pp.gen;


import lombok.Getter;
import  org.antlr.v4.runtime.ParserRuleContext;

import com.p4.p416.pp.gen.*;
import com.p4.p416.pp.gen.P416PPParser.*;

public class PreprocessContextExt extends AbstractBaseExt {

	@Getter private PreprocessContext ctx;

	public PreprocessContextExt(PreprocessContext ctx) {
		this.ctx = ctx;

	}

	@Override
	public  PreprocessContext getContext(){
		return (PreprocessContext)contexts.get(contexts.size()-1);
	}

	@Override
	public PreprocessContext getContext(String str){
		return (PreprocessContext)new PopulateExtendedContextVisitor().visit(getParser(str).preprocess());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof PreprocessContext){
				addToContexts((PreprocessContext) ctx);
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be casted to "+ PreprocessContext.class.getName());
			}
		} else {
			addToContexts(null);
		}
	}
}