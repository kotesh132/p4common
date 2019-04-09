package com.p4.p416.pp.gen;


import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

import  org.antlr.v4.runtime.ParserRuleContext;

import com.p4.p416.pp.Macro;
import com.p4.p416.pp.MacroKey;
import com.p4.p416.pp.gen.*;
import com.p4.p416.pp.gen.P416PPParser.*;
import com.p4.pp.runner.PreprocessRunnerSession;

public class PpDefineVarContextExt extends AbstractBaseExt {

	@Getter private PpDefineVarContext ctx;

	public PpDefineVarContextExt(PpDefineVarContext ctx) {
		this.ctx = ctx;

	}

	@Override
	public  PpDefineVarContext getContext(){
		return (PpDefineVarContext)contexts.get(contexts.size()-1);
	}

	@Override
	public PpDefineVarContext getContext(String str){
		return (PpDefineVarContext)new PopulateExtendedContextVisitor().visit(getParser(str).ppDefineVar());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof PpDefineVarContext){
				addToContexts((PpDefineVarContext) ctx);
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be casted to "+ PpDefineVarContext.class.getName());
			}
		} else {
			addToContexts(null);
		}
	}
	
	//ppDefineVar :   PREPROCESS_BEGIN    WS*    PREPROCESS_DEFINE    WS+    ID        ( WS+    ppChars )?    WS*    ( NEWLINE | EOF )    ;
	@Override
	public List<StatementContext> preprocessing(PreprocessRunnerSession prs){
		List<StatementContext> statementContext = new ArrayList<StatementContext>();
		if(ctx != null && ctx.children != null && ctx.children.size()>0){
			Macro macro = new Macro();
			MacroKey macroKey = new MacroKey();
			List<String> listOfParameters = new ArrayList<String>();
			String macroName = ctx.ID().getText();
			macro.setMacroName(macroName);
			if(ctx.ppChars()!=null){
				macro.setMacroDef(" "+ctx.ppChars().extendedContext.getFormattedText()+" ");
			}
			macroKey.setMacroName(macroName);
			macroKey.setNoOfParameters(listOfParameters.size());
			macro.setMacroKey(macroKey);
			if(prs.getMacroMap().containsKey(macroKey)){
				L.info("macro already exist "+macroKey.getMacroName());
			}
			prs.getMacroMap().put(macroKey, macro);
		}
		return statementContext;
	}
}