package com.p4.p416.pp.gen;


import  com.p4.p416.pp.gen.*;
import  org.antlr.v4.runtime.*;


public class PopulateExtendedContextVisitor extends P416PPParserBaseVisitor<ParserRuleContext>{

		@Override 
		public ParserRuleContext visitProgram(P416PPParser.ProgramContext ctx){
			super.visitProgram(ctx);
			ctx.extendedContext = new ProgramContextExt(ctx);
			ctx.extendedContext.setContext(ctx);
			return ctx;
		}
		@Override 
		public ParserRuleContext visitStatement(P416PPParser.StatementContext ctx){
			super.visitStatement(ctx);
			ctx.extendedContext = new StatementContextExt(ctx);
			ctx.extendedContext.setContext(ctx);
			return ctx;
		}
		@Override 
		public ParserRuleContext visitPreprocess(P416PPParser.PreprocessContext ctx){
			super.visitPreprocess(ctx);
			ctx.extendedContext = new PreprocessContextExt(ctx);
			ctx.extendedContext.setContext(ctx);
			return ctx;
		}
		@Override 
		public ParserRuleContext visitPpId(P416PPParser.PpIdContext ctx){
			super.visitPpId(ctx);
			ctx.extendedContext = new PpIdContextExt(ctx);
			ctx.extendedContext.setContext(ctx);
			return ctx;
		}
		@Override 
		public ParserRuleContext visitPpChar(P416PPParser.PpCharContext ctx){
			super.visitPpChar(ctx);
			ctx.extendedContext = new PpCharContextExt(ctx);
			ctx.extendedContext.setContext(ctx);
			return ctx;
		}
		@Override 
		public ParserRuleContext visitPpChars(P416PPParser.PpCharsContext ctx){
			super.visitPpChars(ctx);
			ctx.extendedContext = new PpCharsContextExt(ctx);
			ctx.extendedContext.setContext(ctx);
			return ctx;
		}
		@Override 
		public ParserRuleContext visitPpCharsWithOutBegin(P416PPParser.PpCharsWithOutBeginContext ctx){
			super.visitPpCharsWithOutBegin(ctx);
			ctx.extendedContext = new PpCharsWithOutBeginContextExt(ctx);
			ctx.extendedContext.setContext(ctx);
			return ctx;
		}
		@Override 
		public ParserRuleContext visitPpCharsWithBegin(P416PPParser.PpCharsWithBeginContext ctx){
			super.visitPpCharsWithBegin(ctx);
			ctx.extendedContext = new PpCharsWithBeginContextExt(ctx);
			ctx.extendedContext.setContext(ctx);
			return ctx;
		}
		@Override 
		public ParserRuleContext visitPpInclude(P416PPParser.PpIncludeContext ctx){
			super.visitPpInclude(ctx);
			ctx.extendedContext = new PpIncludeContextExt(ctx);
			ctx.extendedContext.setContext(ctx);
			return ctx;
		}
		@Override 
		public ParserRuleContext visitPpPragma(P416PPParser.PpPragmaContext ctx){
			super.visitPpPragma(ctx);
			ctx.extendedContext = new PpPragmaContextExt(ctx);
			ctx.extendedContext.setContext(ctx);
			return ctx;
		}
		@Override 
		public ParserRuleContext visitPpError(P416PPParser.PpErrorContext ctx){
			super.visitPpError(ctx);
			ctx.extendedContext = new PpErrorContextExt(ctx);
			ctx.extendedContext.setContext(ctx);
			return ctx;
		}
		@Override 
		public ParserRuleContext visitPpUndef(P416PPParser.PpUndefContext ctx){
			super.visitPpUndef(ctx);
			ctx.extendedContext = new PpUndefContextExt(ctx);
			ctx.extendedContext.setContext(ctx);
			return ctx;
		}
		@Override 
		public ParserRuleContext visitPpDefineVar(P416PPParser.PpDefineVarContext ctx){
			super.visitPpDefineVar(ctx);
			ctx.extendedContext = new PpDefineVarContextExt(ctx);
			ctx.extendedContext.setContext(ctx);
			return ctx;
		}
		@Override 
		public ParserRuleContext visitPpDefineFunc(P416PPParser.PpDefineFuncContext ctx){
			super.visitPpDefineFunc(ctx);
			ctx.extendedContext = new PpDefineFuncContextExt(ctx);
			ctx.extendedContext.setContext(ctx);
			return ctx;
		}
		@Override 
		public ParserRuleContext visitPpdfId(P416PPParser.PpdfIdContext ctx){
			super.visitPpdfId(ctx);
			ctx.extendedContext = new PpdfIdContextExt(ctx);
			ctx.extendedContext.setContext(ctx);
			return ctx;
		}
		@Override 
		public ParserRuleContext visitPpdfiArguments(P416PPParser.PpdfiArgumentsContext ctx){
			super.visitPpdfiArguments(ctx);
			ctx.extendedContext = new PpdfiArgumentsContextExt(ctx);
			ctx.extendedContext.setContext(ctx);
			return ctx;
		}
		@Override 
		public ParserRuleContext visitPpdfiArgument(P416PPParser.PpdfiArgumentContext ctx){
			super.visitPpdfiArgument(ctx);
			ctx.extendedContext = new PpdfiArgumentContextExt(ctx);
			ctx.extendedContext.setContext(ctx);
			return ctx;
		}
		@Override 
		public ParserRuleContext visitPpdfChars(P416PPParser.PpdfCharsContext ctx){
			super.visitPpdfChars(ctx);
			ctx.extendedContext = new PpdfCharsContextExt(ctx);
			ctx.extendedContext.setContext(ctx);
			return ctx;
		}
		@Override 
		public ParserRuleContext visitPpdfcId(P416PPParser.PpdfcIdContext ctx){
			super.visitPpdfcId(ctx);
			ctx.extendedContext = new PpdfcIdContextExt(ctx);
			ctx.extendedContext.setContext(ctx);
			return ctx;
		}
		@Override 
		public ParserRuleContext visitPpdfcNotId(P416PPParser.PpdfcNotIdContext ctx){
			super.visitPpdfcNotId(ctx);
			ctx.extendedContext = new PpdfcNotIdContextExt(ctx);
			ctx.extendedContext.setContext(ctx);
			return ctx;
		}
		@Override 
		public ParserRuleContext visitPpIfStatement(P416PPParser.PpIfStatementContext ctx){
			super.visitPpIfStatement(ctx);
			ctx.extendedContext = new PpIfStatementContextExt(ctx);
			ctx.extendedContext.setContext(ctx);
			return ctx;
		}
		@Override 
		public ParserRuleContext visitPpisIF(P416PPParser.PpisIFContext ctx){
			super.visitPpisIF(ctx);
			ctx.extendedContext = new PpisIFContextExt(ctx);
			ctx.extendedContext.setContext(ctx);
			return ctx;
		}
		@Override 
		public ParserRuleContext visitPpisElif(P416PPParser.PpisElifContext ctx){
			super.visitPpisElif(ctx);
			ctx.extendedContext = new PpisElifContextExt(ctx);
			ctx.extendedContext.setContext(ctx);
			return ctx;
		}
		@Override 
		public ParserRuleContext visitPpisElse(P416PPParser.PpisElseContext ctx){
			super.visitPpisElse(ctx);
			ctx.extendedContext = new PpisElseContextExt(ctx);
			ctx.extendedContext.setContext(ctx);
			return ctx;
		}
		@Override 
		public ParserRuleContext visitPpisEndif(P416PPParser.PpisEndifContext ctx){
			super.visitPpisEndif(ctx);
			ctx.extendedContext = new PpisEndifContextExt(ctx);
			ctx.extendedContext.setContext(ctx);
			return ctx;
		}
		@Override 
		public ParserRuleContext visitPpisIfDef(P416PPParser.PpisIfDefContext ctx){
			super.visitPpisIfDef(ctx);
			ctx.extendedContext = new PpisIfDefContextExt(ctx);
			ctx.extendedContext.setContext(ctx);
			return ctx;
		}
		@Override 
		public ParserRuleContext visitPpisIfNdef(P416PPParser.PpisIfNdefContext ctx){
			super.visitPpisIfNdef(ctx);
			ctx.extendedContext = new PpisIfNdefContextExt(ctx);
			ctx.extendedContext.setContext(ctx);
			return ctx;
		}
		@Override 
		public ParserRuleContext visitPpisStatement(P416PPParser.PpisStatementContext ctx){
			super.visitPpisStatement(ctx);
			ctx.extendedContext = new PpisStatementContextExt(ctx);
			ctx.extendedContext.setContext(ctx);
			return ctx;
		}
		@Override 
		public ParserRuleContext visitPpisElifElseEndif(P416PPParser.PpisElifElseEndifContext ctx){
			super.visitPpisElifElseEndif(ctx);
			ctx.extendedContext = new PpisElifElseEndifContextExt(ctx);
			ctx.extendedContext.setContext(ctx);
			return ctx;
		}
		@Override 
		public ParserRuleContext visitPpisElseEndif(P416PPParser.PpisElseEndifContext ctx){
			super.visitPpisElseEndif(ctx);
			ctx.extendedContext = new PpisElseEndifContextExt(ctx);
			ctx.extendedContext.setContext(ctx);
			return ctx;
		}
;

}