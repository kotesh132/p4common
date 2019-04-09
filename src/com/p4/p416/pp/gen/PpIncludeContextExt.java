package com.p4.p416.pp.gen;


import lombok.Getter;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import  org.antlr.v4.runtime.ParserRuleContext;

import com.p4.p416.pp.gen.*;
import com.p4.p416.pp.gen.P416PPParser.*;
import com.p4.pp.runner.FileParser;
import com.p4.pp.runner.PreprocessRunnerSession;

public class PpIncludeContextExt extends AbstractBaseExt {

	@Getter private PpIncludeContext ctx;

	public PpIncludeContextExt(PpIncludeContext ctx) {
		this.ctx = ctx;

	}

	@Override
	public  PpIncludeContext getContext(){
		return (PpIncludeContext)contexts.get(contexts.size()-1);
	}

	@Override
	public PpIncludeContext getContext(String str){
		return (PpIncludeContext)new PopulateExtendedContextVisitor().visit(getParser(str).ppInclude());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof PpIncludeContext){
				addToContexts((PpIncludeContext) ctx);
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be casted to "+ PpIncludeContext.class.getName());
			}
		} else {
			addToContexts(null);
		}
	}

	//ppInclude locals [ PpIncludeContextExt extendedContext ] :    PREPROCESS_BEGIN    WS*    PREPROCESS_INCLUDE    WS*    ppChars    WS*    ( NEWLINE | EOF )    ;

	@Override
	public List<StatementContext> preprocessing(PreprocessRunnerSession prs){
		List<StatementContext> statementContexts = new ArrayList<StatementContext>();
		if(ctx != null && ctx.children != null && ctx.children.size()>0){
			if(ctx.ppChars()!=null && ctx.ppChars().getText().length()>0){
				File f= new File(prs.getProcessingFile().getParent(), ctx.ppChars().getText().substring(1, ctx.ppChars().getText().length()-1));
				if(f.exists()){
					FileParser fp = new FileParser();
					ProgramContext pc = fp.getFileContent(f);
					statementContexts = pc.extendedContext.preprocessing(prs);
				}else{
					L.error("inlucded file is not found "+ ctx.getText());
				}
			}
		}
		return statementContexts;
	}

}