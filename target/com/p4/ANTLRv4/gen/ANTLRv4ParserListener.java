// Generated from ANTLRv4Parser.g4 by ANTLR 4.5
package com.p4.ANTLRv4.gen;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ANTLRv4Parser}.
 */
public interface ANTLRv4ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#grammarSpec}.
	 * @param ctx the parse tree
	 */
	void enterGrammarSpec(ANTLRv4Parser.GrammarSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#grammarSpec}.
	 * @param ctx the parse tree
	 */
	void exitGrammarSpec(ANTLRv4Parser.GrammarSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#grammarType}.
	 * @param ctx the parse tree
	 */
	void enterGrammarType(ANTLRv4Parser.GrammarTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#grammarType}.
	 * @param ctx the parse tree
	 */
	void exitGrammarType(ANTLRv4Parser.GrammarTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#prequelConstruct}.
	 * @param ctx the parse tree
	 */
	void enterPrequelConstruct(ANTLRv4Parser.PrequelConstructContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#prequelConstruct}.
	 * @param ctx the parse tree
	 */
	void exitPrequelConstruct(ANTLRv4Parser.PrequelConstructContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#optionsSpec}.
	 * @param ctx the parse tree
	 */
	void enterOptionsSpec(ANTLRv4Parser.OptionsSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#optionsSpec}.
	 * @param ctx the parse tree
	 */
	void exitOptionsSpec(ANTLRv4Parser.OptionsSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#option}.
	 * @param ctx the parse tree
	 */
	void enterOption(ANTLRv4Parser.OptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#option}.
	 * @param ctx the parse tree
	 */
	void exitOption(ANTLRv4Parser.OptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#optionValue}.
	 * @param ctx the parse tree
	 */
	void enterOptionValue(ANTLRv4Parser.OptionValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#optionValue}.
	 * @param ctx the parse tree
	 */
	void exitOptionValue(ANTLRv4Parser.OptionValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#delegateGrammars}.
	 * @param ctx the parse tree
	 */
	void enterDelegateGrammars(ANTLRv4Parser.DelegateGrammarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#delegateGrammars}.
	 * @param ctx the parse tree
	 */
	void exitDelegateGrammars(ANTLRv4Parser.DelegateGrammarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#delegateGrammar}.
	 * @param ctx the parse tree
	 */
	void enterDelegateGrammar(ANTLRv4Parser.DelegateGrammarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#delegateGrammar}.
	 * @param ctx the parse tree
	 */
	void exitDelegateGrammar(ANTLRv4Parser.DelegateGrammarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#tokensSpec}.
	 * @param ctx the parse tree
	 */
	void enterTokensSpec(ANTLRv4Parser.TokensSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#tokensSpec}.
	 * @param ctx the parse tree
	 */
	void exitTokensSpec(ANTLRv4Parser.TokensSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(ANTLRv4Parser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(ANTLRv4Parser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#actionScopeName}.
	 * @param ctx the parse tree
	 */
	void enterActionScopeName(ANTLRv4Parser.ActionScopeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#actionScopeName}.
	 * @param ctx the parse tree
	 */
	void exitActionScopeName(ANTLRv4Parser.ActionScopeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#modeSpec}.
	 * @param ctx the parse tree
	 */
	void enterModeSpec(ANTLRv4Parser.ModeSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#modeSpec}.
	 * @param ctx the parse tree
	 */
	void exitModeSpec(ANTLRv4Parser.ModeSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#rules}.
	 * @param ctx the parse tree
	 */
	void enterRules(ANTLRv4Parser.RulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#rules}.
	 * @param ctx the parse tree
	 */
	void exitRules(ANTLRv4Parser.RulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#ruleSpec}.
	 * @param ctx the parse tree
	 */
	void enterRuleSpec(ANTLRv4Parser.RuleSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#ruleSpec}.
	 * @param ctx the parse tree
	 */
	void exitRuleSpec(ANTLRv4Parser.RuleSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#parserRuleSpec}.
	 * @param ctx the parse tree
	 */
	void enterParserRuleSpec(ANTLRv4Parser.ParserRuleSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#parserRuleSpec}.
	 * @param ctx the parse tree
	 */
	void exitParserRuleSpec(ANTLRv4Parser.ParserRuleSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(ANTLRv4Parser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(ANTLRv4Parser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#annotationArgs}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationArgs(ANTLRv4Parser.AnnotationArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#annotationArgs}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationArgs(ANTLRv4Parser.AnnotationArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#annotationArg}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationArg(ANTLRv4Parser.AnnotationArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#annotationArg}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationArg(ANTLRv4Parser.AnnotationArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#exceptionGroup}.
	 * @param ctx the parse tree
	 */
	void enterExceptionGroup(ANTLRv4Parser.ExceptionGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#exceptionGroup}.
	 * @param ctx the parse tree
	 */
	void exitExceptionGroup(ANTLRv4Parser.ExceptionGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#exceptionHandler}.
	 * @param ctx the parse tree
	 */
	void enterExceptionHandler(ANTLRv4Parser.ExceptionHandlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#exceptionHandler}.
	 * @param ctx the parse tree
	 */
	void exitExceptionHandler(ANTLRv4Parser.ExceptionHandlerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#finallyClause}.
	 * @param ctx the parse tree
	 */
	void enterFinallyClause(ANTLRv4Parser.FinallyClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#finallyClause}.
	 * @param ctx the parse tree
	 */
	void exitFinallyClause(ANTLRv4Parser.FinallyClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#rulePrequel}.
	 * @param ctx the parse tree
	 */
	void enterRulePrequel(ANTLRv4Parser.RulePrequelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#rulePrequel}.
	 * @param ctx the parse tree
	 */
	void exitRulePrequel(ANTLRv4Parser.RulePrequelContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#ruleReturns}.
	 * @param ctx the parse tree
	 */
	void enterRuleReturns(ANTLRv4Parser.RuleReturnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#ruleReturns}.
	 * @param ctx the parse tree
	 */
	void exitRuleReturns(ANTLRv4Parser.RuleReturnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#throwsSpec}.
	 * @param ctx the parse tree
	 */
	void enterThrowsSpec(ANTLRv4Parser.ThrowsSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#throwsSpec}.
	 * @param ctx the parse tree
	 */
	void exitThrowsSpec(ANTLRv4Parser.ThrowsSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#localsSpec}.
	 * @param ctx the parse tree
	 */
	void enterLocalsSpec(ANTLRv4Parser.LocalsSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#localsSpec}.
	 * @param ctx the parse tree
	 */
	void exitLocalsSpec(ANTLRv4Parser.LocalsSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#ruleAction}.
	 * @param ctx the parse tree
	 */
	void enterRuleAction(ANTLRv4Parser.RuleActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#ruleAction}.
	 * @param ctx the parse tree
	 */
	void exitRuleAction(ANTLRv4Parser.RuleActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#ruleModifiers}.
	 * @param ctx the parse tree
	 */
	void enterRuleModifiers(ANTLRv4Parser.RuleModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#ruleModifiers}.
	 * @param ctx the parse tree
	 */
	void exitRuleModifiers(ANTLRv4Parser.RuleModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#ruleModifier}.
	 * @param ctx the parse tree
	 */
	void enterRuleModifier(ANTLRv4Parser.RuleModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#ruleModifier}.
	 * @param ctx the parse tree
	 */
	void exitRuleModifier(ANTLRv4Parser.RuleModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#ruleBlock}.
	 * @param ctx the parse tree
	 */
	void enterRuleBlock(ANTLRv4Parser.RuleBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#ruleBlock}.
	 * @param ctx the parse tree
	 */
	void exitRuleBlock(ANTLRv4Parser.RuleBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#ruleAltList}.
	 * @param ctx the parse tree
	 */
	void enterRuleAltList(ANTLRv4Parser.RuleAltListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#ruleAltList}.
	 * @param ctx the parse tree
	 */
	void exitRuleAltList(ANTLRv4Parser.RuleAltListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#labeledAlt}.
	 * @param ctx the parse tree
	 */
	void enterLabeledAlt(ANTLRv4Parser.LabeledAltContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#labeledAlt}.
	 * @param ctx the parse tree
	 */
	void exitLabeledAlt(ANTLRv4Parser.LabeledAltContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#lexerRule}.
	 * @param ctx the parse tree
	 */
	void enterLexerRule(ANTLRv4Parser.LexerRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#lexerRule}.
	 * @param ctx the parse tree
	 */
	void exitLexerRule(ANTLRv4Parser.LexerRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#lexerRuleBlock}.
	 * @param ctx the parse tree
	 */
	void enterLexerRuleBlock(ANTLRv4Parser.LexerRuleBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#lexerRuleBlock}.
	 * @param ctx the parse tree
	 */
	void exitLexerRuleBlock(ANTLRv4Parser.LexerRuleBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#lexerAltList}.
	 * @param ctx the parse tree
	 */
	void enterLexerAltList(ANTLRv4Parser.LexerAltListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#lexerAltList}.
	 * @param ctx the parse tree
	 */
	void exitLexerAltList(ANTLRv4Parser.LexerAltListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#lexerAlt}.
	 * @param ctx the parse tree
	 */
	void enterLexerAlt(ANTLRv4Parser.LexerAltContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#lexerAlt}.
	 * @param ctx the parse tree
	 */
	void exitLexerAlt(ANTLRv4Parser.LexerAltContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#lexerElements}.
	 * @param ctx the parse tree
	 */
	void enterLexerElements(ANTLRv4Parser.LexerElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#lexerElements}.
	 * @param ctx the parse tree
	 */
	void exitLexerElements(ANTLRv4Parser.LexerElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#lexerElement}.
	 * @param ctx the parse tree
	 */
	void enterLexerElement(ANTLRv4Parser.LexerElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#lexerElement}.
	 * @param ctx the parse tree
	 */
	void exitLexerElement(ANTLRv4Parser.LexerElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#labeledLexerElement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledLexerElement(ANTLRv4Parser.LabeledLexerElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#labeledLexerElement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledLexerElement(ANTLRv4Parser.LabeledLexerElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#lexerBlock}.
	 * @param ctx the parse tree
	 */
	void enterLexerBlock(ANTLRv4Parser.LexerBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#lexerBlock}.
	 * @param ctx the parse tree
	 */
	void exitLexerBlock(ANTLRv4Parser.LexerBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#lexerCommands}.
	 * @param ctx the parse tree
	 */
	void enterLexerCommands(ANTLRv4Parser.LexerCommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#lexerCommands}.
	 * @param ctx the parse tree
	 */
	void exitLexerCommands(ANTLRv4Parser.LexerCommandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#lexerCommand}.
	 * @param ctx the parse tree
	 */
	void enterLexerCommand(ANTLRv4Parser.LexerCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#lexerCommand}.
	 * @param ctx the parse tree
	 */
	void exitLexerCommand(ANTLRv4Parser.LexerCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#lexerCommandName}.
	 * @param ctx the parse tree
	 */
	void enterLexerCommandName(ANTLRv4Parser.LexerCommandNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#lexerCommandName}.
	 * @param ctx the parse tree
	 */
	void exitLexerCommandName(ANTLRv4Parser.LexerCommandNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#lexerCommandExpr}.
	 * @param ctx the parse tree
	 */
	void enterLexerCommandExpr(ANTLRv4Parser.LexerCommandExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#lexerCommandExpr}.
	 * @param ctx the parse tree
	 */
	void exitLexerCommandExpr(ANTLRv4Parser.LexerCommandExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#altList}.
	 * @param ctx the parse tree
	 */
	void enterAltList(ANTLRv4Parser.AltListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#altList}.
	 * @param ctx the parse tree
	 */
	void exitAltList(ANTLRv4Parser.AltListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#alternative}.
	 * @param ctx the parse tree
	 */
	void enterAlternative(ANTLRv4Parser.AlternativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#alternative}.
	 * @param ctx the parse tree
	 */
	void exitAlternative(ANTLRv4Parser.AlternativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(ANTLRv4Parser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(ANTLRv4Parser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#labeledElement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledElement(ANTLRv4Parser.LabeledElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#labeledElement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledElement(ANTLRv4Parser.LabeledElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#ebnf}.
	 * @param ctx the parse tree
	 */
	void enterEbnf(ANTLRv4Parser.EbnfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#ebnf}.
	 * @param ctx the parse tree
	 */
	void exitEbnf(ANTLRv4Parser.EbnfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#blockSuffix}.
	 * @param ctx the parse tree
	 */
	void enterBlockSuffix(ANTLRv4Parser.BlockSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#blockSuffix}.
	 * @param ctx the parse tree
	 */
	void exitBlockSuffix(ANTLRv4Parser.BlockSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#ebnfSuffix}.
	 * @param ctx the parse tree
	 */
	void enterEbnfSuffix(ANTLRv4Parser.EbnfSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#ebnfSuffix}.
	 * @param ctx the parse tree
	 */
	void exitEbnfSuffix(ANTLRv4Parser.EbnfSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#lexerAtom}.
	 * @param ctx the parse tree
	 */
	void enterLexerAtom(ANTLRv4Parser.LexerAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#lexerAtom}.
	 * @param ctx the parse tree
	 */
	void exitLexerAtom(ANTLRv4Parser.LexerAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(ANTLRv4Parser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(ANTLRv4Parser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#notSet}.
	 * @param ctx the parse tree
	 */
	void enterNotSet(ANTLRv4Parser.NotSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#notSet}.
	 * @param ctx the parse tree
	 */
	void exitNotSet(ANTLRv4Parser.NotSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#blockSet}.
	 * @param ctx the parse tree
	 */
	void enterBlockSet(ANTLRv4Parser.BlockSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#blockSet}.
	 * @param ctx the parse tree
	 */
	void exitBlockSet(ANTLRv4Parser.BlockSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#setElement}.
	 * @param ctx the parse tree
	 */
	void enterSetElement(ANTLRv4Parser.SetElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#setElement}.
	 * @param ctx the parse tree
	 */
	void exitSetElement(ANTLRv4Parser.SetElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ANTLRv4Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ANTLRv4Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#ruleref}.
	 * @param ctx the parse tree
	 */
	void enterRuleref(ANTLRv4Parser.RulerefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#ruleref}.
	 * @param ctx the parse tree
	 */
	void exitRuleref(ANTLRv4Parser.RulerefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(ANTLRv4Parser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(ANTLRv4Parser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#terminal}.
	 * @param ctx the parse tree
	 */
	void enterTerminal(ANTLRv4Parser.TerminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#terminal}.
	 * @param ctx the parse tree
	 */
	void exitTerminal(ANTLRv4Parser.TerminalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#elementOptions}.
	 * @param ctx the parse tree
	 */
	void enterElementOptions(ANTLRv4Parser.ElementOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#elementOptions}.
	 * @param ctx the parse tree
	 */
	void exitElementOptions(ANTLRv4Parser.ElementOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#elementOption}.
	 * @param ctx the parse tree
	 */
	void enterElementOption(ANTLRv4Parser.ElementOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#elementOption}.
	 * @param ctx the parse tree
	 */
	void exitElementOption(ANTLRv4Parser.ElementOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv4Parser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(ANTLRv4Parser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv4Parser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(ANTLRv4Parser.IdContext ctx);
}