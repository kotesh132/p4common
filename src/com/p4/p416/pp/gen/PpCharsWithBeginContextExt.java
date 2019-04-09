package com.p4.p416.pp.gen;


import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

import  org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import com.p4.p416.pp.MacroKey;
import com.p4.p416.pp.gen.P416PPParser.*;
import com.p4.pp.runner.FileParser;
import com.p4.pp.runner.PreprocessRunnerSession;

public class PpCharsWithBeginContextExt extends AbstractBaseExt {

	@Getter private PpCharsWithBeginContext ctx;

	public PpCharsWithBeginContextExt(PpCharsWithBeginContext ctx) {
		this.ctx = ctx;

	}

	@Override
	public  PpCharsWithBeginContext getContext(){
		return (PpCharsWithBeginContext)contexts.get(contexts.size()-1);
	}

	@Override
	public PpCharsWithBeginContext getContext(String str){
		return (PpCharsWithBeginContext)new PopulateExtendedContextVisitor().visit(getParser(str).ppCharsWithBegin());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof PpCharsWithBeginContext){
				addToContexts((PpCharsWithBeginContext) ctx);
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be casted to "+ PpCharsWithBeginContext.class.getName());
			}
		} else {
			addToContexts(null);
		}
	}
	
	//ppChars  :    ( STRING | WS | PREPROCESS_BEGIN | DEFINED | ID | PREPROCESS_ERROR | PREPROCESS_IF | PREPROCESS_ELSE | COMMA | PAREN_OPEN | PAREN_CLOSE | CHAR )+    ;
	@Override
	public List<StatementContext> preprocessing(PreprocessRunnerSession prs){
		ParserRuleContext ctx = getContext();
		List<StatementContext> statementContexts = new ArrayList<StatementContext>();
		if(ctx != null && ctx.children != null && ctx.children.size()>0){
			for(ParseTree childCtx : ctx.children){
				if(childCtx instanceof PpIdContext){
					String macroName = childCtx.getText();
					MacroKey macroKey = new MacroKey();
					macroKey.setMacroName(macroName);
					macroKey.setNoOfParameters(0);
					if(prs.getMacroMap().containsKey(macroKey)){
						FileParser fp = new FileParser();
						ProgramContext pc = fp.getStartContext(prs.getMacroMap().get(macroKey).getMacroDef());
						List<StatementContext> scs = pc.extendedContext.preprocessing(prs);
						statementContexts.addAll(scs);
					}else{
						StatementContext statementContext =  (StatementContext) new PopulateExtendedContextVisitor().visit(getParser(childCtx.getText()).statement());
						statementContexts.add(statementContext);
					}
				}else{
					StatementContext statementContext =  (StatementContext) new PopulateExtendedContextVisitor().visit(getParser(childCtx.getText()).statement());
					statementContexts.add(statementContext);
				}
			}
		}
		return statementContexts;
	}
}
