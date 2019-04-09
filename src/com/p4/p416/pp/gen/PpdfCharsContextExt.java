package com.p4.p416.pp.gen;


import lombok.Getter;
import  org.antlr.v4.runtime.ParserRuleContext;

import com.p4.p416.pp.gen.*;
import com.p4.p416.pp.gen.P416PPParser.*;

public class PpdfCharsContextExt extends AbstractBaseExt {

	@Getter private PpdfCharsContext ctx;

	public PpdfCharsContextExt(PpdfCharsContext ctx) {
		this.ctx = ctx;

	}

	@Override
	public  PpdfCharsContext getContext(){
		return (PpdfCharsContext)contexts.get(contexts.size()-1);
	}

	@Override
	public PpdfCharsContext getContext(String str){
		return (PpdfCharsContext)new PopulateExtendedContextVisitor().visit(getParser(str).ppdfChars());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof PpdfCharsContext){
				addToContexts((PpdfCharsContext) ctx);
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be casted to "+ PpdfCharsContext.class.getName());
			}
		} else {
			addToContexts(null);
		}
	}
}