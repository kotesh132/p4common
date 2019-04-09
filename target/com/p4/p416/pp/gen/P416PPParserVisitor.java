// Generated from P416PPParser.g4 by ANTLR 4.5
package com.p4.p416.pp.gen;

import com.p4.p416.pp.gen.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link P416PPParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface P416PPParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link P416PPParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(P416PPParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link P416PPParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(P416PPParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link P416PPParser#preprocess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreprocess(P416PPParser.PreprocessContext ctx);
	/**
	 * Visit a parse tree produced by {@link P416PPParser#ppId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPpId(P416PPParser.PpIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link P416PPParser#ppChar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPpChar(P416PPParser.PpCharContext ctx);
	/**
	 * Visit a parse tree produced by {@link P416PPParser#ppChars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPpChars(P416PPParser.PpCharsContext ctx);
	/**
	 * Visit a parse tree produced by {@link P416PPParser#ppCharsWithOutBegin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPpCharsWithOutBegin(P416PPParser.PpCharsWithOutBeginContext ctx);
	/**
	 * Visit a parse tree produced by {@link P416PPParser#ppCharsWithBegin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPpCharsWithBegin(P416PPParser.PpCharsWithBeginContext ctx);
	/**
	 * Visit a parse tree produced by {@link P416PPParser#ppInclude}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPpInclude(P416PPParser.PpIncludeContext ctx);
	/**
	 * Visit a parse tree produced by {@link P416PPParser#ppPragma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPpPragma(P416PPParser.PpPragmaContext ctx);
	/**
	 * Visit a parse tree produced by {@link P416PPParser#ppError}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPpError(P416PPParser.PpErrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link P416PPParser#ppUndef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPpUndef(P416PPParser.PpUndefContext ctx);
	/**
	 * Visit a parse tree produced by {@link P416PPParser#ppDefineVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPpDefineVar(P416PPParser.PpDefineVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link P416PPParser#ppDefineFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPpDefineFunc(P416PPParser.PpDefineFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link P416PPParser#ppdfId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPpdfId(P416PPParser.PpdfIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link P416PPParser#ppdfiArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPpdfiArguments(P416PPParser.PpdfiArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link P416PPParser#ppdfiArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPpdfiArgument(P416PPParser.PpdfiArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link P416PPParser#ppdfChars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPpdfChars(P416PPParser.PpdfCharsContext ctx);
	/**
	 * Visit a parse tree produced by {@link P416PPParser#ppdfcId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPpdfcId(P416PPParser.PpdfcIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link P416PPParser#ppdfcNotId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPpdfcNotId(P416PPParser.PpdfcNotIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link P416PPParser#ppIfStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPpIfStatement(P416PPParser.PpIfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link P416PPParser#ppisIF}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPpisIF(P416PPParser.PpisIFContext ctx);
	/**
	 * Visit a parse tree produced by {@link P416PPParser#ppisElif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPpisElif(P416PPParser.PpisElifContext ctx);
	/**
	 * Visit a parse tree produced by {@link P416PPParser#ppisElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPpisElse(P416PPParser.PpisElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link P416PPParser#ppisEndif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPpisEndif(P416PPParser.PpisEndifContext ctx);
	/**
	 * Visit a parse tree produced by {@link P416PPParser#ppisIfDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPpisIfDef(P416PPParser.PpisIfDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link P416PPParser#ppisIfNdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPpisIfNdef(P416PPParser.PpisIfNdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link P416PPParser#ppisStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPpisStatement(P416PPParser.PpisStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link P416PPParser#ppisElifElseEndif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPpisElifElseEndif(P416PPParser.PpisElifElseEndifContext ctx);
	/**
	 * Visit a parse tree produced by {@link P416PPParser#ppisElseEndif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPpisElseEndif(P416PPParser.PpisElseEndifContext ctx);
}