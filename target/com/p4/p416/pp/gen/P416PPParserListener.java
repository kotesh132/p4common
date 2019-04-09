// Generated from P416PPParser.g4 by ANTLR 4.5
package com.p4.p416.pp.gen;

import com.p4.p416.pp.gen.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link P416PPParser}.
 */
public interface P416PPParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link P416PPParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(P416PPParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link P416PPParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(P416PPParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link P416PPParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(P416PPParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link P416PPParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(P416PPParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link P416PPParser#preprocess}.
	 * @param ctx the parse tree
	 */
	void enterPreprocess(P416PPParser.PreprocessContext ctx);
	/**
	 * Exit a parse tree produced by {@link P416PPParser#preprocess}.
	 * @param ctx the parse tree
	 */
	void exitPreprocess(P416PPParser.PreprocessContext ctx);
	/**
	 * Enter a parse tree produced by {@link P416PPParser#ppId}.
	 * @param ctx the parse tree
	 */
	void enterPpId(P416PPParser.PpIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link P416PPParser#ppId}.
	 * @param ctx the parse tree
	 */
	void exitPpId(P416PPParser.PpIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link P416PPParser#ppChar}.
	 * @param ctx the parse tree
	 */
	void enterPpChar(P416PPParser.PpCharContext ctx);
	/**
	 * Exit a parse tree produced by {@link P416PPParser#ppChar}.
	 * @param ctx the parse tree
	 */
	void exitPpChar(P416PPParser.PpCharContext ctx);
	/**
	 * Enter a parse tree produced by {@link P416PPParser#ppChars}.
	 * @param ctx the parse tree
	 */
	void enterPpChars(P416PPParser.PpCharsContext ctx);
	/**
	 * Exit a parse tree produced by {@link P416PPParser#ppChars}.
	 * @param ctx the parse tree
	 */
	void exitPpChars(P416PPParser.PpCharsContext ctx);
	/**
	 * Enter a parse tree produced by {@link P416PPParser#ppCharsWithOutBegin}.
	 * @param ctx the parse tree
	 */
	void enterPpCharsWithOutBegin(P416PPParser.PpCharsWithOutBeginContext ctx);
	/**
	 * Exit a parse tree produced by {@link P416PPParser#ppCharsWithOutBegin}.
	 * @param ctx the parse tree
	 */
	void exitPpCharsWithOutBegin(P416PPParser.PpCharsWithOutBeginContext ctx);
	/**
	 * Enter a parse tree produced by {@link P416PPParser#ppCharsWithBegin}.
	 * @param ctx the parse tree
	 */
	void enterPpCharsWithBegin(P416PPParser.PpCharsWithBeginContext ctx);
	/**
	 * Exit a parse tree produced by {@link P416PPParser#ppCharsWithBegin}.
	 * @param ctx the parse tree
	 */
	void exitPpCharsWithBegin(P416PPParser.PpCharsWithBeginContext ctx);
	/**
	 * Enter a parse tree produced by {@link P416PPParser#ppInclude}.
	 * @param ctx the parse tree
	 */
	void enterPpInclude(P416PPParser.PpIncludeContext ctx);
	/**
	 * Exit a parse tree produced by {@link P416PPParser#ppInclude}.
	 * @param ctx the parse tree
	 */
	void exitPpInclude(P416PPParser.PpIncludeContext ctx);
	/**
	 * Enter a parse tree produced by {@link P416PPParser#ppPragma}.
	 * @param ctx the parse tree
	 */
	void enterPpPragma(P416PPParser.PpPragmaContext ctx);
	/**
	 * Exit a parse tree produced by {@link P416PPParser#ppPragma}.
	 * @param ctx the parse tree
	 */
	void exitPpPragma(P416PPParser.PpPragmaContext ctx);
	/**
	 * Enter a parse tree produced by {@link P416PPParser#ppError}.
	 * @param ctx the parse tree
	 */
	void enterPpError(P416PPParser.PpErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link P416PPParser#ppError}.
	 * @param ctx the parse tree
	 */
	void exitPpError(P416PPParser.PpErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link P416PPParser#ppUndef}.
	 * @param ctx the parse tree
	 */
	void enterPpUndef(P416PPParser.PpUndefContext ctx);
	/**
	 * Exit a parse tree produced by {@link P416PPParser#ppUndef}.
	 * @param ctx the parse tree
	 */
	void exitPpUndef(P416PPParser.PpUndefContext ctx);
	/**
	 * Enter a parse tree produced by {@link P416PPParser#ppDefineVar}.
	 * @param ctx the parse tree
	 */
	void enterPpDefineVar(P416PPParser.PpDefineVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link P416PPParser#ppDefineVar}.
	 * @param ctx the parse tree
	 */
	void exitPpDefineVar(P416PPParser.PpDefineVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link P416PPParser#ppDefineFunc}.
	 * @param ctx the parse tree
	 */
	void enterPpDefineFunc(P416PPParser.PpDefineFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link P416PPParser#ppDefineFunc}.
	 * @param ctx the parse tree
	 */
	void exitPpDefineFunc(P416PPParser.PpDefineFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link P416PPParser#ppdfId}.
	 * @param ctx the parse tree
	 */
	void enterPpdfId(P416PPParser.PpdfIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link P416PPParser#ppdfId}.
	 * @param ctx the parse tree
	 */
	void exitPpdfId(P416PPParser.PpdfIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link P416PPParser#ppdfiArguments}.
	 * @param ctx the parse tree
	 */
	void enterPpdfiArguments(P416PPParser.PpdfiArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link P416PPParser#ppdfiArguments}.
	 * @param ctx the parse tree
	 */
	void exitPpdfiArguments(P416PPParser.PpdfiArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link P416PPParser#ppdfiArgument}.
	 * @param ctx the parse tree
	 */
	void enterPpdfiArgument(P416PPParser.PpdfiArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link P416PPParser#ppdfiArgument}.
	 * @param ctx the parse tree
	 */
	void exitPpdfiArgument(P416PPParser.PpdfiArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link P416PPParser#ppdfChars}.
	 * @param ctx the parse tree
	 */
	void enterPpdfChars(P416PPParser.PpdfCharsContext ctx);
	/**
	 * Exit a parse tree produced by {@link P416PPParser#ppdfChars}.
	 * @param ctx the parse tree
	 */
	void exitPpdfChars(P416PPParser.PpdfCharsContext ctx);
	/**
	 * Enter a parse tree produced by {@link P416PPParser#ppdfcId}.
	 * @param ctx the parse tree
	 */
	void enterPpdfcId(P416PPParser.PpdfcIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link P416PPParser#ppdfcId}.
	 * @param ctx the parse tree
	 */
	void exitPpdfcId(P416PPParser.PpdfcIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link P416PPParser#ppdfcNotId}.
	 * @param ctx the parse tree
	 */
	void enterPpdfcNotId(P416PPParser.PpdfcNotIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link P416PPParser#ppdfcNotId}.
	 * @param ctx the parse tree
	 */
	void exitPpdfcNotId(P416PPParser.PpdfcNotIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link P416PPParser#ppIfStatement}.
	 * @param ctx the parse tree
	 */
	void enterPpIfStatement(P416PPParser.PpIfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link P416PPParser#ppIfStatement}.
	 * @param ctx the parse tree
	 */
	void exitPpIfStatement(P416PPParser.PpIfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link P416PPParser#ppisIF}.
	 * @param ctx the parse tree
	 */
	void enterPpisIF(P416PPParser.PpisIFContext ctx);
	/**
	 * Exit a parse tree produced by {@link P416PPParser#ppisIF}.
	 * @param ctx the parse tree
	 */
	void exitPpisIF(P416PPParser.PpisIFContext ctx);
	/**
	 * Enter a parse tree produced by {@link P416PPParser#ppisElif}.
	 * @param ctx the parse tree
	 */
	void enterPpisElif(P416PPParser.PpisElifContext ctx);
	/**
	 * Exit a parse tree produced by {@link P416PPParser#ppisElif}.
	 * @param ctx the parse tree
	 */
	void exitPpisElif(P416PPParser.PpisElifContext ctx);
	/**
	 * Enter a parse tree produced by {@link P416PPParser#ppisElse}.
	 * @param ctx the parse tree
	 */
	void enterPpisElse(P416PPParser.PpisElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link P416PPParser#ppisElse}.
	 * @param ctx the parse tree
	 */
	void exitPpisElse(P416PPParser.PpisElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link P416PPParser#ppisEndif}.
	 * @param ctx the parse tree
	 */
	void enterPpisEndif(P416PPParser.PpisEndifContext ctx);
	/**
	 * Exit a parse tree produced by {@link P416PPParser#ppisEndif}.
	 * @param ctx the parse tree
	 */
	void exitPpisEndif(P416PPParser.PpisEndifContext ctx);
	/**
	 * Enter a parse tree produced by {@link P416PPParser#ppisIfDef}.
	 * @param ctx the parse tree
	 */
	void enterPpisIfDef(P416PPParser.PpisIfDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link P416PPParser#ppisIfDef}.
	 * @param ctx the parse tree
	 */
	void exitPpisIfDef(P416PPParser.PpisIfDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link P416PPParser#ppisIfNdef}.
	 * @param ctx the parse tree
	 */
	void enterPpisIfNdef(P416PPParser.PpisIfNdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link P416PPParser#ppisIfNdef}.
	 * @param ctx the parse tree
	 */
	void exitPpisIfNdef(P416PPParser.PpisIfNdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link P416PPParser#ppisStatement}.
	 * @param ctx the parse tree
	 */
	void enterPpisStatement(P416PPParser.PpisStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link P416PPParser#ppisStatement}.
	 * @param ctx the parse tree
	 */
	void exitPpisStatement(P416PPParser.PpisStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link P416PPParser#ppisElifElseEndif}.
	 * @param ctx the parse tree
	 */
	void enterPpisElifElseEndif(P416PPParser.PpisElifElseEndifContext ctx);
	/**
	 * Exit a parse tree produced by {@link P416PPParser#ppisElifElseEndif}.
	 * @param ctx the parse tree
	 */
	void exitPpisElifElseEndif(P416PPParser.PpisElifElseEndifContext ctx);
	/**
	 * Enter a parse tree produced by {@link P416PPParser#ppisElseEndif}.
	 * @param ctx the parse tree
	 */
	void enterPpisElseEndif(P416PPParser.PpisElseEndifContext ctx);
	/**
	 * Exit a parse tree produced by {@link P416PPParser#ppisElseEndif}.
	 * @param ctx the parse tree
	 */
	void exitPpisElseEndif(P416PPParser.PpisElseEndifContext ctx);
}