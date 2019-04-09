package com.p4.p416.pp.gen;


import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

import  org.antlr.v4.runtime.ParserRuleContext;

import com.p4.p416.pp.MacroKey;
import com.p4.p416.pp.gen.*;
import com.p4.p416.pp.gen.P416PPParser.*;
import com.p4.pp.runner.PreprocessRunnerSession;

public class PpUndefContextExt extends AbstractBaseExt {

	@Getter private PpUndefContext ctx;

	public PpUndefContextExt(PpUndefContext ctx) {
		this.ctx = ctx;

	}

	@Override
	public  PpUndefContext getContext(){
		return (PpUndefContext)contexts.get(contexts.size()-1);
	}

	@Override
	public PpUndefContext getContext(String str){
		return (PpUndefContext)new PopulateExtendedContextVisitor().visit(getParser(str).ppUndef());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof PpUndefContext){
				addToContexts((PpUndefContext) ctx);
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be casted to "+ PpUndefContext.class.getName());
			}
		} else {
			addToContexts(null);
		}
	}
	
	//ppUndef  :    PREPROCESS_BEGIN    WS*    PREPROCESS_UNDEF    WS+    ID   WS*    ( NEWLINE | EOF )    ;
	@Override
	public List<StatementContext> preprocessing(PreprocessRunnerSession prs){
		List<StatementContext> statementContexts = new ArrayList<StatementContext>();
		if(ctx != null && ctx.children != null && ctx.children.size()>0){
			MacroKey macroKey = new MacroKey();
			macroKey.setMacroName(ctx.ID().getText());
			macroKey.setNoOfParameters(0);
			prs.getMacroMap().remove(macroKey);
		}
		return statementContexts;
	}
}