package com.p4.p416.pp.gen;


import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

import  org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import com.p4.p416.pp.gen.*;
import com.p4.p416.pp.gen.P416PPParser.*;
import com.p4.pp.runner.PreprocessRunnerSession;

public class StatementContextExt extends AbstractBaseExt {

	@Getter private StatementContext ctx;

	public StatementContextExt(StatementContext ctx) {
		this.ctx = ctx;

	}

	@Override
	public  StatementContext getContext(){
		return (StatementContext)contexts.get(contexts.size()-1);
	}

	@Override
	public StatementContext getContext(String str){
		return (StatementContext)new PopulateExtendedContextVisitor().visit(getParser(str).statement());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof StatementContext){
				addToContexts((StatementContext) ctx);
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be casted to "+ StatementContext.class.getName());
			}
		} else {
			addToContexts(null);
		}
	}
	
	public List<StatementContext> preprocessing(PreprocessRunnerSession proteusRunnerSession){
		ParserRuleContext ctx = getContext();
		List<StatementContext> statementContexts = new ArrayList<StatementContext>();
		if(ctx != null && ctx.children != null && ctx.children.size()>0){
			for(ParseTree childCtx : ctx.children){
				if (childCtx instanceof PreprocessContext){
					List<StatementContext> scs  = getExtendedContext(childCtx).preprocessing(proteusRunnerSession);
					if( scs.size()>0){
						statementContexts.addAll(scs);
					}

				}else if(childCtx  instanceof PpCharsContext){
					List<StatementContext> scs  = getExtendedContext(childCtx).preprocessing(proteusRunnerSession);
					if( scs.size()>0){
						statementContexts.addAll(scs);
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