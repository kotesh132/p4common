// Generated from ANTLRv4Parser.g4 by ANTLR 4.5
package com.p4.ANTLRv4.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ANTLRv4Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TOKEN_REF=1, RULE_REF=2, LEXER_CHAR_SET=3, DOC_COMMENT=4, BLOCK_COMMENT=5, 
		LINE_COMMENT=6, BEGIN_ARG_ACTION=7, OPTIONS=8, TOKENS=9, IMPORT=10, FRAGMENT=11, 
		LEXER=12, PARSER=13, GRAMMAR=14, PROTECTED=15, PUBLIC=16, PRIVATE=17, 
		RETURNS=18, LOCALS=19, THROWS=20, CATCH=21, FINALLY=22, MODE=23, COLON=24, 
		COLONCOLON=25, COMMA=26, SEMI=27, LPAREN=28, RPAREN=29, RARROW=30, LT=31, 
		GT=32, ASSIGN=33, QUESTION=34, STAR=35, PLUS=36, PLUS_ASSIGN=37, OR=38, 
		DOLLAR=39, DOT=40, RANGE=41, AT=42, POUND=43, NOT=44, RBRACE=45, ID=46, 
		INT=47, STRING_LITERAL=48, UNTERMINATED_STRING_LITERAL=49, WS=50, ACTION=51, 
		ERRCHAR=52, ARG_ACTION=53, UNTERMINATED_ARG_ACTION=54, UNTERMINATED_CHAR_SET=55;
	public static final int
		RULE_grammarSpec = 0, RULE_grammarType = 1, RULE_prequelConstruct = 2, 
		RULE_optionsSpec = 3, RULE_option = 4, RULE_optionValue = 5, RULE_delegateGrammars = 6, 
		RULE_delegateGrammar = 7, RULE_tokensSpec = 8, RULE_action = 9, RULE_actionScopeName = 10, 
		RULE_modeSpec = 11, RULE_rules = 12, RULE_ruleSpec = 13, RULE_parserRuleSpec = 14, 
		RULE_annotation = 15, RULE_annotationArgs = 16, RULE_annotationArg = 17, 
		RULE_exceptionGroup = 18, RULE_exceptionHandler = 19, RULE_finallyClause = 20, 
		RULE_rulePrequel = 21, RULE_ruleReturns = 22, RULE_throwsSpec = 23, RULE_localsSpec = 24, 
		RULE_ruleAction = 25, RULE_ruleModifiers = 26, RULE_ruleModifier = 27, 
		RULE_ruleBlock = 28, RULE_ruleAltList = 29, RULE_labeledAlt = 30, RULE_lexerRule = 31, 
		RULE_lexerRuleBlock = 32, RULE_lexerAltList = 33, RULE_lexerAlt = 34, 
		RULE_lexerElements = 35, RULE_lexerElement = 36, RULE_labeledLexerElement = 37, 
		RULE_lexerBlock = 38, RULE_lexerCommands = 39, RULE_lexerCommand = 40, 
		RULE_lexerCommandName = 41, RULE_lexerCommandExpr = 42, RULE_altList = 43, 
		RULE_alternative = 44, RULE_element = 45, RULE_labeledElement = 46, RULE_ebnf = 47, 
		RULE_blockSuffix = 48, RULE_ebnfSuffix = 49, RULE_lexerAtom = 50, RULE_atom = 51, 
		RULE_notSet = 52, RULE_blockSet = 53, RULE_setElement = 54, RULE_block = 55, 
		RULE_ruleref = 56, RULE_range = 57, RULE_terminal = 58, RULE_elementOptions = 59, 
		RULE_elementOption = 60, RULE_id = 61;
	public static final String[] ruleNames = {
		"grammarSpec", "grammarType", "prequelConstruct", "optionsSpec", "option", 
		"optionValue", "delegateGrammars", "delegateGrammar", "tokensSpec", "action", 
		"actionScopeName", "modeSpec", "rules", "ruleSpec", "parserRuleSpec", 
		"annotation", "annotationArgs", "annotationArg", "exceptionGroup", "exceptionHandler", 
		"finallyClause", "rulePrequel", "ruleReturns", "throwsSpec", "localsSpec", 
		"ruleAction", "ruleModifiers", "ruleModifier", "ruleBlock", "ruleAltList", 
		"labeledAlt", "lexerRule", "lexerRuleBlock", "lexerAltList", "lexerAlt", 
		"lexerElements", "lexerElement", "labeledLexerElement", "lexerBlock", 
		"lexerCommands", "lexerCommand", "lexerCommandName", "lexerCommandExpr", 
		"altList", "alternative", "element", "labeledElement", "ebnf", "blockSuffix", 
		"ebnfSuffix", "lexerAtom", "atom", "notSet", "blockSet", "setElement", 
		"block", "ruleref", "range", "terminal", "elementOptions", "elementOption", 
		"id"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "'import'", 
		"'fragment'", "'lexer'", "'parser'", "'grammar'", "'protected'", "'public'", 
		"'private'", "'returns'", "'locals'", "'throws'", "'catch'", "'finally'", 
		"'mode'", "':'", "'::'", "','", "';'", "'('", "')'", "'->'", "'<'", "'>'", 
		"'='", "'?'", "'*'", "'+'", "'+='", "'|'", "'$'", "'.'", "'..'", "'@'", 
		"'#'", "'~'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TOKEN_REF", "RULE_REF", "LEXER_CHAR_SET", "DOC_COMMENT", "BLOCK_COMMENT", 
		"LINE_COMMENT", "BEGIN_ARG_ACTION", "OPTIONS", "TOKENS", "IMPORT", "FRAGMENT", 
		"LEXER", "PARSER", "GRAMMAR", "PROTECTED", "PUBLIC", "PRIVATE", "RETURNS", 
		"LOCALS", "THROWS", "CATCH", "FINALLY", "MODE", "COLON", "COLONCOLON", 
		"COMMA", "SEMI", "LPAREN", "RPAREN", "RARROW", "LT", "GT", "ASSIGN", "QUESTION", 
		"STAR", "PLUS", "PLUS_ASSIGN", "OR", "DOLLAR", "DOT", "RANGE", "AT", "POUND", 
		"NOT", "RBRACE", "ID", "INT", "STRING_LITERAL", "UNTERMINATED_STRING_LITERAL", 
		"WS", "ACTION", "ERRCHAR", "ARG_ACTION", "UNTERMINATED_ARG_ACTION", "UNTERMINATED_CHAR_SET"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ANTLRv4Parser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ANTLRv4Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GrammarSpecContext extends ParserRuleContext {
		public GrammarTypeContext grammarType() {
			return getRuleContext(GrammarTypeContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ANTLRv4Parser.SEMI, 0); }
		public RulesContext rules() {
			return getRuleContext(RulesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ANTLRv4Parser.EOF, 0); }
		public TerminalNode DOC_COMMENT() { return getToken(ANTLRv4Parser.DOC_COMMENT, 0); }
		public List<PrequelConstructContext> prequelConstruct() {
			return getRuleContexts(PrequelConstructContext.class);
		}
		public PrequelConstructContext prequelConstruct(int i) {
			return getRuleContext(PrequelConstructContext.class,i);
		}
		public List<ModeSpecContext> modeSpec() {
			return getRuleContexts(ModeSpecContext.class);
		}
		public ModeSpecContext modeSpec(int i) {
			return getRuleContext(ModeSpecContext.class,i);
		}
		public GrammarSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterGrammarSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitGrammarSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitGrammarSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrammarSpecContext grammarSpec() throws RecognitionException {
		GrammarSpecContext _localctx = new GrammarSpecContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_grammarSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_la = _input.LA(1);
			if (_la==DOC_COMMENT) {
				{
				setState(124);
				match(DOC_COMMENT);
				}
			}

			setState(127);
			grammarType();
			setState(128);
			id();
			setState(129);
			match(SEMI);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPTIONS) | (1L << TOKENS) | (1L << IMPORT) | (1L << AT))) != 0)) {
				{
				{
				setState(130);
				prequelConstruct();
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136);
			rules();
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODE) {
				{
				{
				setState(137);
				modeSpec();
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GrammarTypeContext extends ParserRuleContext {
		public TerminalNode LEXER() { return getToken(ANTLRv4Parser.LEXER, 0); }
		public TerminalNode GRAMMAR() { return getToken(ANTLRv4Parser.GRAMMAR, 0); }
		public TerminalNode PARSER() { return getToken(ANTLRv4Parser.PARSER, 0); }
		public GrammarTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterGrammarType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitGrammarType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitGrammarType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrammarTypeContext grammarType() throws RecognitionException {
		GrammarTypeContext _localctx = new GrammarTypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_grammarType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			switch (_input.LA(1)) {
			case LEXER:
				{
				setState(145);
				match(LEXER);
				setState(146);
				match(GRAMMAR);
				}
				break;
			case PARSER:
				{
				setState(147);
				match(PARSER);
				setState(148);
				match(GRAMMAR);
				}
				break;
			case GRAMMAR:
				{
				setState(149);
				match(GRAMMAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrequelConstructContext extends ParserRuleContext {
		public OptionsSpecContext optionsSpec() {
			return getRuleContext(OptionsSpecContext.class,0);
		}
		public DelegateGrammarsContext delegateGrammars() {
			return getRuleContext(DelegateGrammarsContext.class,0);
		}
		public TokensSpecContext tokensSpec() {
			return getRuleContext(TokensSpecContext.class,0);
		}
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public PrequelConstructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prequelConstruct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterPrequelConstruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitPrequelConstruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitPrequelConstruct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrequelConstructContext prequelConstruct() throws RecognitionException {
		PrequelConstructContext _localctx = new PrequelConstructContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_prequelConstruct);
		try {
			setState(156);
			switch (_input.LA(1)) {
			case OPTIONS:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				optionsSpec();
				}
				break;
			case IMPORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				delegateGrammars();
				}
				break;
			case TOKENS:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				tokensSpec();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 4);
				{
				setState(155);
				action();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionsSpecContext extends ParserRuleContext {
		public TerminalNode OPTIONS() { return getToken(ANTLRv4Parser.OPTIONS, 0); }
		public TerminalNode RBRACE() { return getToken(ANTLRv4Parser.RBRACE, 0); }
		public List<OptionContext> option() {
			return getRuleContexts(OptionContext.class);
		}
		public OptionContext option(int i) {
			return getRuleContext(OptionContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(ANTLRv4Parser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ANTLRv4Parser.SEMI, i);
		}
		public OptionsSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionsSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterOptionsSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitOptionsSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitOptionsSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionsSpecContext optionsSpec() throws RecognitionException {
		OptionsSpecContext _localctx = new OptionsSpecContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_optionsSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(OPTIONS);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_REF || _la==RULE_REF) {
				{
				{
				setState(159);
				option();
				setState(160);
				match(SEMI);
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(167);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ANTLRv4Parser.ASSIGN, 0); }
		public OptionValueContext optionValue() {
			return getRuleContext(OptionValueContext.class,0);
		}
		public OptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionContext option() throws RecognitionException {
		OptionContext _localctx = new OptionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_option);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			id();
			setState(170);
			match(ASSIGN);
			setState(171);
			optionValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionValueContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(ANTLRv4Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ANTLRv4Parser.DOT, i);
		}
		public TerminalNode STRING_LITERAL() { return getToken(ANTLRv4Parser.STRING_LITERAL, 0); }
		public TerminalNode ACTION() { return getToken(ANTLRv4Parser.ACTION, 0); }
		public TerminalNode INT() { return getToken(ANTLRv4Parser.INT, 0); }
		public OptionValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterOptionValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitOptionValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitOptionValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionValueContext optionValue() throws RecognitionException {
		OptionValueContext _localctx = new OptionValueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_optionValue);
		int _la;
		try {
			setState(184);
			switch (_input.LA(1)) {
			case TOKEN_REF:
			case RULE_REF:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				id();
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(174);
					match(DOT);
					setState(175);
					id();
					}
					}
					setState(180);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				match(STRING_LITERAL);
				}
				break;
			case ACTION:
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
				match(ACTION);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 4);
				{
				setState(183);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DelegateGrammarsContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(ANTLRv4Parser.IMPORT, 0); }
		public List<DelegateGrammarContext> delegateGrammar() {
			return getRuleContexts(DelegateGrammarContext.class);
		}
		public DelegateGrammarContext delegateGrammar(int i) {
			return getRuleContext(DelegateGrammarContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(ANTLRv4Parser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ANTLRv4Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ANTLRv4Parser.COMMA, i);
		}
		public DelegateGrammarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delegateGrammars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterDelegateGrammars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitDelegateGrammars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitDelegateGrammars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DelegateGrammarsContext delegateGrammars() throws RecognitionException {
		DelegateGrammarsContext _localctx = new DelegateGrammarsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_delegateGrammars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(IMPORT);
			setState(187);
			delegateGrammar();
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(188);
				match(COMMA);
				setState(189);
				delegateGrammar();
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(195);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DelegateGrammarContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(ANTLRv4Parser.ASSIGN, 0); }
		public DelegateGrammarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delegateGrammar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterDelegateGrammar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitDelegateGrammar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitDelegateGrammar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DelegateGrammarContext delegateGrammar() throws RecognitionException {
		DelegateGrammarContext _localctx = new DelegateGrammarContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_delegateGrammar);
		try {
			setState(202);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				id();
				setState(198);
				match(ASSIGN);
				setState(199);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				id();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TokensSpecContext extends ParserRuleContext {
		public TerminalNode TOKENS() { return getToken(ANTLRv4Parser.TOKENS, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(ANTLRv4Parser.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ANTLRv4Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ANTLRv4Parser.COMMA, i);
		}
		public TokensSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokensSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterTokensSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitTokensSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitTokensSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokensSpecContext tokensSpec() throws RecognitionException {
		TokensSpecContext _localctx = new TokensSpecContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tokensSpec);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(TOKENS);
			setState(205);
			id();
			setState(210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(206);
					match(COMMA);
					setState(207);
					id();
					}
					} 
				}
				setState(212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(214);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(213);
				match(COMMA);
				}
			}

			setState(216);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActionContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(ANTLRv4Parser.AT, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode ACTION() { return getToken(ANTLRv4Parser.ACTION, 0); }
		public ActionScopeNameContext actionScopeName() {
			return getRuleContext(ActionScopeNameContext.class,0);
		}
		public TerminalNode COLONCOLON() { return getToken(ANTLRv4Parser.COLONCOLON, 0); }
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(AT);
			setState(222);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(219);
				actionScopeName();
				setState(220);
				match(COLONCOLON);
				}
				break;
			}
			setState(224);
			id();
			setState(225);
			match(ACTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActionScopeNameContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode LEXER() { return getToken(ANTLRv4Parser.LEXER, 0); }
		public TerminalNode PARSER() { return getToken(ANTLRv4Parser.PARSER, 0); }
		public ActionScopeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionScopeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterActionScopeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitActionScopeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitActionScopeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionScopeNameContext actionScopeName() throws RecognitionException {
		ActionScopeNameContext _localctx = new ActionScopeNameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_actionScopeName);
		try {
			setState(230);
			switch (_input.LA(1)) {
			case TOKEN_REF:
			case RULE_REF:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				id();
				}
				break;
			case LEXER:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				match(LEXER);
				}
				break;
			case PARSER:
				enterOuterAlt(_localctx, 3);
				{
				setState(229);
				match(PARSER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModeSpecContext extends ParserRuleContext {
		public TerminalNode MODE() { return getToken(ANTLRv4Parser.MODE, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ANTLRv4Parser.SEMI, 0); }
		public List<LexerRuleContext> lexerRule() {
			return getRuleContexts(LexerRuleContext.class);
		}
		public LexerRuleContext lexerRule(int i) {
			return getRuleContext(LexerRuleContext.class,i);
		}
		public ModeSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modeSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterModeSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitModeSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitModeSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModeSpecContext modeSpec() throws RecognitionException {
		ModeSpecContext _localctx = new ModeSpecContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_modeSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(MODE);
			setState(233);
			id();
			setState(234);
			match(SEMI);
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOKEN_REF) | (1L << DOC_COMMENT) | (1L << FRAGMENT))) != 0)) {
				{
				{
				setState(235);
				lexerRule();
				}
				}
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RulesContext extends ParserRuleContext {
		public List<RuleSpecContext> ruleSpec() {
			return getRuleContexts(RuleSpecContext.class);
		}
		public RuleSpecContext ruleSpec(int i) {
			return getRuleContext(RuleSpecContext.class,i);
		}
		public RulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitRules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitRules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulesContext rules() throws RecognitionException {
		RulesContext _localctx = new RulesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_rules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOKEN_REF) | (1L << RULE_REF) | (1L << DOC_COMMENT) | (1L << FRAGMENT) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << PRIVATE))) != 0)) {
				{
				{
				setState(241);
				ruleSpec();
				}
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleSpecContext extends ParserRuleContext {
		public ParserRuleSpecContext parserRuleSpec() {
			return getRuleContext(ParserRuleSpecContext.class,0);
		}
		public LexerRuleContext lexerRule() {
			return getRuleContext(LexerRuleContext.class,0);
		}
		public RuleSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterRuleSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitRuleSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitRuleSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleSpecContext ruleSpec() throws RecognitionException {
		RuleSpecContext _localctx = new RuleSpecContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ruleSpec);
		try {
			setState(249);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				parserRuleSpec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				lexerRule();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParserRuleSpecContext extends ParserRuleContext {
		public TerminalNode RULE_REF() { return getToken(ANTLRv4Parser.RULE_REF, 0); }
		public TerminalNode COLON() { return getToken(ANTLRv4Parser.COLON, 0); }
		public RuleBlockContext ruleBlock() {
			return getRuleContext(RuleBlockContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ANTLRv4Parser.SEMI, 0); }
		public ExceptionGroupContext exceptionGroup() {
			return getRuleContext(ExceptionGroupContext.class,0);
		}
		public TerminalNode DOC_COMMENT() { return getToken(ANTLRv4Parser.DOC_COMMENT, 0); }
		public RuleModifiersContext ruleModifiers() {
			return getRuleContext(RuleModifiersContext.class,0);
		}
		public TerminalNode ARG_ACTION() { return getToken(ANTLRv4Parser.ARG_ACTION, 0); }
		public RuleReturnsContext ruleReturns() {
			return getRuleContext(RuleReturnsContext.class,0);
		}
		public ThrowsSpecContext throwsSpec() {
			return getRuleContext(ThrowsSpecContext.class,0);
		}
		public LocalsSpecContext localsSpec() {
			return getRuleContext(LocalsSpecContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<RulePrequelContext> rulePrequel() {
			return getRuleContexts(RulePrequelContext.class);
		}
		public RulePrequelContext rulePrequel(int i) {
			return getRuleContext(RulePrequelContext.class,i);
		}
		public ParserRuleSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parserRuleSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterParserRuleSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitParserRuleSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitParserRuleSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParserRuleSpecContext parserRuleSpec() throws RecognitionException {
		ParserRuleSpecContext _localctx = new ParserRuleSpecContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parserRuleSpec);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			_la = _input.LA(1);
			if (_la==DOC_COMMENT) {
				{
				setState(251);
				match(DOC_COMMENT);
				}
			}

			setState(255);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FRAGMENT) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << PRIVATE))) != 0)) {
				{
				setState(254);
				ruleModifiers();
				}
			}

			setState(257);
			match(RULE_REF);
			setState(259);
			_la = _input.LA(1);
			if (_la==ARG_ACTION) {
				{
				setState(258);
				match(ARG_ACTION);
				}
			}

			setState(262);
			_la = _input.LA(1);
			if (_la==RETURNS) {
				{
				setState(261);
				ruleReturns();
				}
			}

			setState(265);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(264);
				throwsSpec();
				}
			}

			setState(268);
			_la = _input.LA(1);
			if (_la==LOCALS) {
				{
				setState(267);
				localsSpec();
				}
			}

			setState(273);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(270);
					annotation();
					}
					} 
				}
				setState(275);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPTIONS || _la==AT) {
				{
				{
				setState(276);
				rulePrequel();
				}
				}
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(282);
			match(COLON);
			setState(283);
			ruleBlock();
			setState(284);
			match(SEMI);
			setState(285);
			exceptionGroup();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(ANTLRv4Parser.AT, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public AnnotationArgsContext annotationArgs() {
			return getRuleContext(AnnotationArgsContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(AT);
			setState(288);
			id();
			setState(290);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(289);
				annotationArgs();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationArgsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ANTLRv4Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ANTLRv4Parser.RPAREN, 0); }
		public List<AnnotationArgContext> annotationArg() {
			return getRuleContexts(AnnotationArgContext.class);
		}
		public AnnotationArgContext annotationArg(int i) {
			return getRuleContext(AnnotationArgContext.class,i);
		}
		public AnnotationArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterAnnotationArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitAnnotationArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitAnnotationArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationArgsContext annotationArgs() throws RecognitionException {
		AnnotationArgsContext _localctx = new AnnotationArgsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_annotationArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(LPAREN);
			setState(294); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(293);
				annotationArg();
				}
				}
				setState(296); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TOKEN_REF || _la==RULE_REF );
			setState(298);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationArgContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ANTLRv4Parser.COLON, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ANTLRv4Parser.STRING_LITERAL, 0); }
		public AnnotationArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterAnnotationArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitAnnotationArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitAnnotationArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationArgContext annotationArg() throws RecognitionException {
		AnnotationArgContext _localctx = new AnnotationArgContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_annotationArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			id();
			setState(301);
			match(COLON);
			setState(302);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionGroupContext extends ParserRuleContext {
		public List<ExceptionHandlerContext> exceptionHandler() {
			return getRuleContexts(ExceptionHandlerContext.class);
		}
		public ExceptionHandlerContext exceptionHandler(int i) {
			return getRuleContext(ExceptionHandlerContext.class,i);
		}
		public FinallyClauseContext finallyClause() {
			return getRuleContext(FinallyClauseContext.class,0);
		}
		public ExceptionGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterExceptionGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitExceptionGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitExceptionGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionGroupContext exceptionGroup() throws RecognitionException {
		ExceptionGroupContext _localctx = new ExceptionGroupContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_exceptionGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CATCH) {
				{
				{
				setState(304);
				exceptionHandler();
				}
				}
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(311);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(310);
				finallyClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionHandlerContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(ANTLRv4Parser.CATCH, 0); }
		public TerminalNode ARG_ACTION() { return getToken(ANTLRv4Parser.ARG_ACTION, 0); }
		public TerminalNode ACTION() { return getToken(ANTLRv4Parser.ACTION, 0); }
		public ExceptionHandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionHandler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterExceptionHandler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitExceptionHandler(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitExceptionHandler(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionHandlerContext exceptionHandler() throws RecognitionException {
		ExceptionHandlerContext _localctx = new ExceptionHandlerContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_exceptionHandler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(CATCH);
			setState(314);
			match(ARG_ACTION);
			setState(315);
			match(ACTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinallyClauseContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(ANTLRv4Parser.FINALLY, 0); }
		public TerminalNode ACTION() { return getToken(ANTLRv4Parser.ACTION, 0); }
		public FinallyClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterFinallyClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitFinallyClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitFinallyClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinallyClauseContext finallyClause() throws RecognitionException {
		FinallyClauseContext _localctx = new FinallyClauseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_finallyClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(FINALLY);
			setState(318);
			match(ACTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RulePrequelContext extends ParserRuleContext {
		public OptionsSpecContext optionsSpec() {
			return getRuleContext(OptionsSpecContext.class,0);
		}
		public RuleActionContext ruleAction() {
			return getRuleContext(RuleActionContext.class,0);
		}
		public RulePrequelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rulePrequel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterRulePrequel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitRulePrequel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitRulePrequel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulePrequelContext rulePrequel() throws RecognitionException {
		RulePrequelContext _localctx = new RulePrequelContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_rulePrequel);
		try {
			setState(322);
			switch (_input.LA(1)) {
			case OPTIONS:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				optionsSpec();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				ruleAction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleReturnsContext extends ParserRuleContext {
		public TerminalNode RETURNS() { return getToken(ANTLRv4Parser.RETURNS, 0); }
		public TerminalNode ARG_ACTION() { return getToken(ANTLRv4Parser.ARG_ACTION, 0); }
		public RuleReturnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleReturns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterRuleReturns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitRuleReturns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitRuleReturns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleReturnsContext ruleReturns() throws RecognitionException {
		RuleReturnsContext _localctx = new RuleReturnsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_ruleReturns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(RETURNS);
			setState(325);
			match(ARG_ACTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThrowsSpecContext extends ParserRuleContext {
		public TerminalNode THROWS() { return getToken(ANTLRv4Parser.THROWS, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ANTLRv4Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ANTLRv4Parser.COMMA, i);
		}
		public ThrowsSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwsSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterThrowsSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitThrowsSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitThrowsSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowsSpecContext throwsSpec() throws RecognitionException {
		ThrowsSpecContext _localctx = new ThrowsSpecContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_throwsSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(THROWS);
			setState(328);
			id();
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(329);
				match(COMMA);
				setState(330);
				id();
				}
				}
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalsSpecContext extends ParserRuleContext {
		public TerminalNode LOCALS() { return getToken(ANTLRv4Parser.LOCALS, 0); }
		public TerminalNode ARG_ACTION() { return getToken(ANTLRv4Parser.ARG_ACTION, 0); }
		public LocalsSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localsSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterLocalsSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitLocalsSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitLocalsSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalsSpecContext localsSpec() throws RecognitionException {
		LocalsSpecContext _localctx = new LocalsSpecContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_localsSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(LOCALS);
			setState(337);
			match(ARG_ACTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleActionContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(ANTLRv4Parser.AT, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode ACTION() { return getToken(ANTLRv4Parser.ACTION, 0); }
		public RuleActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterRuleAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitRuleAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitRuleAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleActionContext ruleAction() throws RecognitionException {
		RuleActionContext _localctx = new RuleActionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ruleAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(AT);
			setState(340);
			id();
			setState(341);
			match(ACTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleModifiersContext extends ParserRuleContext {
		public List<RuleModifierContext> ruleModifier() {
			return getRuleContexts(RuleModifierContext.class);
		}
		public RuleModifierContext ruleModifier(int i) {
			return getRuleContext(RuleModifierContext.class,i);
		}
		public RuleModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterRuleModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitRuleModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitRuleModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleModifiersContext ruleModifiers() throws RecognitionException {
		RuleModifiersContext _localctx = new RuleModifiersContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_ruleModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(343);
				ruleModifier();
				}
				}
				setState(346); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FRAGMENT) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << PRIVATE))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleModifierContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(ANTLRv4Parser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(ANTLRv4Parser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(ANTLRv4Parser.PROTECTED, 0); }
		public TerminalNode FRAGMENT() { return getToken(ANTLRv4Parser.FRAGMENT, 0); }
		public RuleModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterRuleModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitRuleModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitRuleModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleModifierContext ruleModifier() throws RecognitionException {
		RuleModifierContext _localctx = new RuleModifierContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_ruleModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FRAGMENT) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << PRIVATE))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleBlockContext extends ParserRuleContext {
		public RuleAltListContext ruleAltList() {
			return getRuleContext(RuleAltListContext.class,0);
		}
		public RuleBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterRuleBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitRuleBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitRuleBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleBlockContext ruleBlock() throws RecognitionException {
		RuleBlockContext _localctx = new RuleBlockContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_ruleBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			ruleAltList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleAltListContext extends ParserRuleContext {
		public List<LabeledAltContext> labeledAlt() {
			return getRuleContexts(LabeledAltContext.class);
		}
		public LabeledAltContext labeledAlt(int i) {
			return getRuleContext(LabeledAltContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(ANTLRv4Parser.OR); }
		public TerminalNode OR(int i) {
			return getToken(ANTLRv4Parser.OR, i);
		}
		public RuleAltListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleAltList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterRuleAltList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitRuleAltList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitRuleAltList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleAltListContext ruleAltList() throws RecognitionException {
		RuleAltListContext _localctx = new RuleAltListContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_ruleAltList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			labeledAlt();
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(353);
				match(OR);
				setState(354);
				labeledAlt();
				}
				}
				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledAltContext extends ParserRuleContext {
		public AlternativeContext alternative() {
			return getRuleContext(AlternativeContext.class,0);
		}
		public TerminalNode POUND() { return getToken(ANTLRv4Parser.POUND, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public LabeledAltContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledAlt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterLabeledAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitLabeledAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitLabeledAlt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledAltContext labeledAlt() throws RecognitionException {
		LabeledAltContext _localctx = new LabeledAltContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_labeledAlt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			alternative();
			setState(363);
			_la = _input.LA(1);
			if (_la==POUND) {
				{
				setState(361);
				match(POUND);
				setState(362);
				id();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LexerRuleContext extends ParserRuleContext {
		public TerminalNode TOKEN_REF() { return getToken(ANTLRv4Parser.TOKEN_REF, 0); }
		public TerminalNode COLON() { return getToken(ANTLRv4Parser.COLON, 0); }
		public LexerRuleBlockContext lexerRuleBlock() {
			return getRuleContext(LexerRuleBlockContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ANTLRv4Parser.SEMI, 0); }
		public TerminalNode DOC_COMMENT() { return getToken(ANTLRv4Parser.DOC_COMMENT, 0); }
		public TerminalNode FRAGMENT() { return getToken(ANTLRv4Parser.FRAGMENT, 0); }
		public LexerRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterLexerRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitLexerRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitLexerRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LexerRuleContext lexerRule() throws RecognitionException {
		LexerRuleContext _localctx = new LexerRuleContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_lexerRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			_la = _input.LA(1);
			if (_la==DOC_COMMENT) {
				{
				setState(365);
				match(DOC_COMMENT);
				}
			}

			setState(369);
			_la = _input.LA(1);
			if (_la==FRAGMENT) {
				{
				setState(368);
				match(FRAGMENT);
				}
			}

			setState(371);
			match(TOKEN_REF);
			setState(372);
			match(COLON);
			setState(373);
			lexerRuleBlock();
			setState(374);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LexerRuleBlockContext extends ParserRuleContext {
		public LexerAltListContext lexerAltList() {
			return getRuleContext(LexerAltListContext.class,0);
		}
		public LexerRuleBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerRuleBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterLexerRuleBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitLexerRuleBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitLexerRuleBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LexerRuleBlockContext lexerRuleBlock() throws RecognitionException {
		LexerRuleBlockContext _localctx = new LexerRuleBlockContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_lexerRuleBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			lexerAltList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LexerAltListContext extends ParserRuleContext {
		public List<LexerAltContext> lexerAlt() {
			return getRuleContexts(LexerAltContext.class);
		}
		public LexerAltContext lexerAlt(int i) {
			return getRuleContext(LexerAltContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(ANTLRv4Parser.OR); }
		public TerminalNode OR(int i) {
			return getToken(ANTLRv4Parser.OR, i);
		}
		public LexerAltListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerAltList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterLexerAltList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitLexerAltList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitLexerAltList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LexerAltListContext lexerAltList() throws RecognitionException {
		LexerAltListContext _localctx = new LexerAltListContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_lexerAltList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			lexerAlt();
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(379);
				match(OR);
				setState(380);
				lexerAlt();
				}
				}
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LexerAltContext extends ParserRuleContext {
		public LexerElementsContext lexerElements() {
			return getRuleContext(LexerElementsContext.class,0);
		}
		public LexerCommandsContext lexerCommands() {
			return getRuleContext(LexerCommandsContext.class,0);
		}
		public LexerAltContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerAlt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterLexerAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitLexerAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitLexerAlt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LexerAltContext lexerAlt() throws RecognitionException {
		LexerAltContext _localctx = new LexerAltContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_lexerAlt);
		int _la;
		try {
			setState(391);
			switch (_input.LA(1)) {
			case TOKEN_REF:
			case RULE_REF:
			case LEXER_CHAR_SET:
			case LPAREN:
			case DOT:
			case NOT:
			case STRING_LITERAL:
			case ACTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				lexerElements();
				setState(388);
				_la = _input.LA(1);
				if (_la==RARROW) {
					{
					setState(387);
					lexerCommands();
					}
				}

				}
				break;
			case SEMI:
			case RPAREN:
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LexerElementsContext extends ParserRuleContext {
		public List<LexerElementContext> lexerElement() {
			return getRuleContexts(LexerElementContext.class);
		}
		public LexerElementContext lexerElement(int i) {
			return getRuleContext(LexerElementContext.class,i);
		}
		public LexerElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterLexerElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitLexerElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitLexerElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LexerElementsContext lexerElements() throws RecognitionException {
		LexerElementsContext _localctx = new LexerElementsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_lexerElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(393);
				lexerElement();
				}
				}
				setState(396); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOKEN_REF) | (1L << RULE_REF) | (1L << LEXER_CHAR_SET) | (1L << LPAREN) | (1L << DOT) | (1L << NOT) | (1L << STRING_LITERAL) | (1L << ACTION))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LexerElementContext extends ParserRuleContext {
		public LabeledLexerElementContext labeledLexerElement() {
			return getRuleContext(LabeledLexerElementContext.class,0);
		}
		public EbnfSuffixContext ebnfSuffix() {
			return getRuleContext(EbnfSuffixContext.class,0);
		}
		public LexerAtomContext lexerAtom() {
			return getRuleContext(LexerAtomContext.class,0);
		}
		public LexerBlockContext lexerBlock() {
			return getRuleContext(LexerBlockContext.class,0);
		}
		public TerminalNode ACTION() { return getToken(ANTLRv4Parser.ACTION, 0); }
		public TerminalNode QUESTION() { return getToken(ANTLRv4Parser.QUESTION, 0); }
		public LexerElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterLexerElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitLexerElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitLexerElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LexerElementContext lexerElement() throws RecognitionException {
		LexerElementContext _localctx = new LexerElementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_lexerElement);
		int _la;
		try {
			setState(414);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				labeledLexerElement();
				setState(400);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QUESTION) | (1L << STAR) | (1L << PLUS))) != 0)) {
					{
					setState(399);
					ebnfSuffix();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(402);
				lexerAtom();
				setState(404);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QUESTION) | (1L << STAR) | (1L << PLUS))) != 0)) {
					{
					setState(403);
					ebnfSuffix();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(406);
				lexerBlock();
				setState(408);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QUESTION) | (1L << STAR) | (1L << PLUS))) != 0)) {
					{
					setState(407);
					ebnfSuffix();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(410);
				match(ACTION);
				setState(412);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(411);
					match(QUESTION);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledLexerElementContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ANTLRv4Parser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(ANTLRv4Parser.PLUS_ASSIGN, 0); }
		public LexerAtomContext lexerAtom() {
			return getRuleContext(LexerAtomContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LabeledLexerElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledLexerElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterLabeledLexerElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitLabeledLexerElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitLabeledLexerElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledLexerElementContext labeledLexerElement() throws RecognitionException {
		LabeledLexerElementContext _localctx = new LabeledLexerElementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_labeledLexerElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			id();
			setState(417);
			_la = _input.LA(1);
			if ( !(_la==ASSIGN || _la==PLUS_ASSIGN) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(420);
			switch (_input.LA(1)) {
			case TOKEN_REF:
			case RULE_REF:
			case LEXER_CHAR_SET:
			case DOT:
			case NOT:
			case STRING_LITERAL:
				{
				setState(418);
				lexerAtom();
				}
				break;
			case LPAREN:
				{
				setState(419);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LexerBlockContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ANTLRv4Parser.LPAREN, 0); }
		public LexerAltListContext lexerAltList() {
			return getRuleContext(LexerAltListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ANTLRv4Parser.RPAREN, 0); }
		public LexerBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterLexerBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitLexerBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitLexerBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LexerBlockContext lexerBlock() throws RecognitionException {
		LexerBlockContext _localctx = new LexerBlockContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_lexerBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(LPAREN);
			setState(423);
			lexerAltList();
			setState(424);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LexerCommandsContext extends ParserRuleContext {
		public TerminalNode RARROW() { return getToken(ANTLRv4Parser.RARROW, 0); }
		public List<LexerCommandContext> lexerCommand() {
			return getRuleContexts(LexerCommandContext.class);
		}
		public LexerCommandContext lexerCommand(int i) {
			return getRuleContext(LexerCommandContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ANTLRv4Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ANTLRv4Parser.COMMA, i);
		}
		public LexerCommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerCommands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterLexerCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitLexerCommands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitLexerCommands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LexerCommandsContext lexerCommands() throws RecognitionException {
		LexerCommandsContext _localctx = new LexerCommandsContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_lexerCommands);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			match(RARROW);
			setState(427);
			lexerCommand();
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(428);
				match(COMMA);
				setState(429);
				lexerCommand();
				}
				}
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LexerCommandContext extends ParserRuleContext {
		public LexerCommandNameContext lexerCommandName() {
			return getRuleContext(LexerCommandNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ANTLRv4Parser.LPAREN, 0); }
		public LexerCommandExprContext lexerCommandExpr() {
			return getRuleContext(LexerCommandExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ANTLRv4Parser.RPAREN, 0); }
		public LexerCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterLexerCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitLexerCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitLexerCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LexerCommandContext lexerCommand() throws RecognitionException {
		LexerCommandContext _localctx = new LexerCommandContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_lexerCommand);
		try {
			setState(441);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(435);
				lexerCommandName();
				setState(436);
				match(LPAREN);
				setState(437);
				lexerCommandExpr();
				setState(438);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(440);
				lexerCommandName();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LexerCommandNameContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode MODE() { return getToken(ANTLRv4Parser.MODE, 0); }
		public LexerCommandNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerCommandName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterLexerCommandName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitLexerCommandName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitLexerCommandName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LexerCommandNameContext lexerCommandName() throws RecognitionException {
		LexerCommandNameContext _localctx = new LexerCommandNameContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_lexerCommandName);
		try {
			setState(445);
			switch (_input.LA(1)) {
			case TOKEN_REF:
			case RULE_REF:
				enterOuterAlt(_localctx, 1);
				{
				setState(443);
				id();
				}
				break;
			case MODE:
				enterOuterAlt(_localctx, 2);
				{
				setState(444);
				match(MODE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LexerCommandExprContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode INT() { return getToken(ANTLRv4Parser.INT, 0); }
		public LexerCommandExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerCommandExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterLexerCommandExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitLexerCommandExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitLexerCommandExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LexerCommandExprContext lexerCommandExpr() throws RecognitionException {
		LexerCommandExprContext _localctx = new LexerCommandExprContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_lexerCommandExpr);
		try {
			setState(449);
			switch (_input.LA(1)) {
			case TOKEN_REF:
			case RULE_REF:
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				id();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(448);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AltListContext extends ParserRuleContext {
		public List<AlternativeContext> alternative() {
			return getRuleContexts(AlternativeContext.class);
		}
		public AlternativeContext alternative(int i) {
			return getRuleContext(AlternativeContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(ANTLRv4Parser.OR); }
		public TerminalNode OR(int i) {
			return getToken(ANTLRv4Parser.OR, i);
		}
		public AltListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_altList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterAltList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitAltList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitAltList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AltListContext altList() throws RecognitionException {
		AltListContext _localctx = new AltListContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_altList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			alternative();
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(452);
				match(OR);
				setState(453);
				alternative();
				}
				}
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlternativeContext extends ParserRuleContext {
		public ElementOptionsContext elementOptions() {
			return getRuleContext(ElementOptionsContext.class,0);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public AlternativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alternative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitAlternative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitAlternative(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlternativeContext alternative() throws RecognitionException {
		AlternativeContext _localctx = new AlternativeContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_alternative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(459);
				elementOptions();
				}
			}

			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOKEN_REF) | (1L << RULE_REF) | (1L << LPAREN) | (1L << DOT) | (1L << NOT) | (1L << STRING_LITERAL) | (1L << ACTION))) != 0)) {
				{
				{
				setState(462);
				element();
				}
				}
				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementContext extends ParserRuleContext {
		public LabeledElementContext labeledElement() {
			return getRuleContext(LabeledElementContext.class,0);
		}
		public EbnfSuffixContext ebnfSuffix() {
			return getRuleContext(EbnfSuffixContext.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public EbnfContext ebnf() {
			return getRuleContext(EbnfContext.class,0);
		}
		public TerminalNode ACTION() { return getToken(ANTLRv4Parser.ACTION, 0); }
		public TerminalNode QUESTION() { return getToken(ANTLRv4Parser.QUESTION, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_element);
		int _la;
		try {
			setState(483);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(468);
				labeledElement();
				setState(471);
				switch (_input.LA(1)) {
				case QUESTION:
				case STAR:
				case PLUS:
					{
					setState(469);
					ebnfSuffix();
					}
					break;
				case TOKEN_REF:
				case RULE_REF:
				case SEMI:
				case LPAREN:
				case RPAREN:
				case OR:
				case DOT:
				case POUND:
				case NOT:
				case STRING_LITERAL:
				case ACTION:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(473);
				atom();
				setState(476);
				switch (_input.LA(1)) {
				case QUESTION:
				case STAR:
				case PLUS:
					{
					setState(474);
					ebnfSuffix();
					}
					break;
				case TOKEN_REF:
				case RULE_REF:
				case SEMI:
				case LPAREN:
				case RPAREN:
				case OR:
				case DOT:
				case POUND:
				case NOT:
				case STRING_LITERAL:
				case ACTION:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(478);
				ebnf();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(479);
				match(ACTION);
				setState(481);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(480);
					match(QUESTION);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledElementContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ANTLRv4Parser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(ANTLRv4Parser.PLUS_ASSIGN, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LabeledElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterLabeledElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitLabeledElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitLabeledElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledElementContext labeledElement() throws RecognitionException {
		LabeledElementContext _localctx = new LabeledElementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_labeledElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			id();
			setState(486);
			_la = _input.LA(1);
			if ( !(_la==ASSIGN || _la==PLUS_ASSIGN) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(489);
			switch (_input.LA(1)) {
			case TOKEN_REF:
			case RULE_REF:
			case DOT:
			case NOT:
			case STRING_LITERAL:
				{
				setState(487);
				atom();
				}
				break;
			case LPAREN:
				{
				setState(488);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EbnfContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockSuffixContext blockSuffix() {
			return getRuleContext(BlockSuffixContext.class,0);
		}
		public EbnfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ebnf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterEbnf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitEbnf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitEbnf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EbnfContext ebnf() throws RecognitionException {
		EbnfContext _localctx = new EbnfContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_ebnf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			block();
			setState(493);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QUESTION) | (1L << STAR) | (1L << PLUS))) != 0)) {
				{
				setState(492);
				blockSuffix();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockSuffixContext extends ParserRuleContext {
		public EbnfSuffixContext ebnfSuffix() {
			return getRuleContext(EbnfSuffixContext.class,0);
		}
		public BlockSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterBlockSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitBlockSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitBlockSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockSuffixContext blockSuffix() throws RecognitionException {
		BlockSuffixContext _localctx = new BlockSuffixContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_blockSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			ebnfSuffix();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EbnfSuffixContext extends ParserRuleContext {
		public List<TerminalNode> QUESTION() { return getTokens(ANTLRv4Parser.QUESTION); }
		public TerminalNode QUESTION(int i) {
			return getToken(ANTLRv4Parser.QUESTION, i);
		}
		public TerminalNode STAR() { return getToken(ANTLRv4Parser.STAR, 0); }
		public TerminalNode PLUS() { return getToken(ANTLRv4Parser.PLUS, 0); }
		public EbnfSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ebnfSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterEbnfSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitEbnfSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitEbnfSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EbnfSuffixContext ebnfSuffix() throws RecognitionException {
		EbnfSuffixContext _localctx = new EbnfSuffixContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_ebnfSuffix);
		int _la;
		try {
			setState(509);
			switch (_input.LA(1)) {
			case QUESTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(497);
				match(QUESTION);
				setState(499);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(498);
					match(QUESTION);
					}
				}

				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(501);
				match(STAR);
				setState(503);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(502);
					match(QUESTION);
					}
				}

				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(505);
				match(PLUS);
				setState(507);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(506);
					match(QUESTION);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LexerAtomContext extends ParserRuleContext {
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public TerminalNode RULE_REF() { return getToken(ANTLRv4Parser.RULE_REF, 0); }
		public NotSetContext notSet() {
			return getRuleContext(NotSetContext.class,0);
		}
		public TerminalNode LEXER_CHAR_SET() { return getToken(ANTLRv4Parser.LEXER_CHAR_SET, 0); }
		public TerminalNode DOT() { return getToken(ANTLRv4Parser.DOT, 0); }
		public ElementOptionsContext elementOptions() {
			return getRuleContext(ElementOptionsContext.class,0);
		}
		public LexerAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerAtom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterLexerAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitLexerAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitLexerAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LexerAtomContext lexerAtom() throws RecognitionException {
		LexerAtomContext _localctx = new LexerAtomContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_lexerAtom);
		int _la;
		try {
			setState(520);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(511);
				range();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(512);
				terminal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(513);
				match(RULE_REF);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(514);
				notSet();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(515);
				match(LEXER_CHAR_SET);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(516);
				match(DOT);
				setState(518);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(517);
					elementOptions();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public RulerefContext ruleref() {
			return getRuleContext(RulerefContext.class,0);
		}
		public NotSetContext notSet() {
			return getRuleContext(NotSetContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ANTLRv4Parser.DOT, 0); }
		public ElementOptionsContext elementOptions() {
			return getRuleContext(ElementOptionsContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_atom);
		int _la;
		try {
			setState(530);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(522);
				range();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(523);
				terminal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(524);
				ruleref();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(525);
				notSet();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(526);
				match(DOT);
				setState(528);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(527);
					elementOptions();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotSetContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(ANTLRv4Parser.NOT, 0); }
		public SetElementContext setElement() {
			return getRuleContext(SetElementContext.class,0);
		}
		public BlockSetContext blockSet() {
			return getRuleContext(BlockSetContext.class,0);
		}
		public NotSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterNotSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitNotSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitNotSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotSetContext notSet() throws RecognitionException {
		NotSetContext _localctx = new NotSetContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_notSet);
		try {
			setState(536);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(532);
				match(NOT);
				setState(533);
				setElement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(534);
				match(NOT);
				setState(535);
				blockSet();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockSetContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ANTLRv4Parser.LPAREN, 0); }
		public List<SetElementContext> setElement() {
			return getRuleContexts(SetElementContext.class);
		}
		public SetElementContext setElement(int i) {
			return getRuleContext(SetElementContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ANTLRv4Parser.RPAREN, 0); }
		public List<TerminalNode> OR() { return getTokens(ANTLRv4Parser.OR); }
		public TerminalNode OR(int i) {
			return getToken(ANTLRv4Parser.OR, i);
		}
		public BlockSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterBlockSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitBlockSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitBlockSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockSetContext blockSet() throws RecognitionException {
		BlockSetContext _localctx = new BlockSetContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_blockSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			match(LPAREN);
			setState(539);
			setElement();
			setState(544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(540);
				match(OR);
				setState(541);
				setElement();
				}
				}
				setState(546);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(547);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetElementContext extends ParserRuleContext {
		public TerminalNode TOKEN_REF() { return getToken(ANTLRv4Parser.TOKEN_REF, 0); }
		public ElementOptionsContext elementOptions() {
			return getRuleContext(ElementOptionsContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(ANTLRv4Parser.STRING_LITERAL, 0); }
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public TerminalNode LEXER_CHAR_SET() { return getToken(ANTLRv4Parser.LEXER_CHAR_SET, 0); }
		public SetElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterSetElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitSetElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitSetElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetElementContext setElement() throws RecognitionException {
		SetElementContext _localctx = new SetElementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_setElement);
		int _la;
		try {
			setState(559);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(549);
				match(TOKEN_REF);
				setState(551);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(550);
					elementOptions();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(553);
				match(STRING_LITERAL);
				setState(555);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(554);
					elementOptions();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(557);
				range();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(558);
				match(LEXER_CHAR_SET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ANTLRv4Parser.LPAREN, 0); }
		public AltListContext altList() {
			return getRuleContext(AltListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ANTLRv4Parser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(ANTLRv4Parser.COLON, 0); }
		public OptionsSpecContext optionsSpec() {
			return getRuleContext(OptionsSpecContext.class,0);
		}
		public List<RuleActionContext> ruleAction() {
			return getRuleContexts(RuleActionContext.class);
		}
		public RuleActionContext ruleAction(int i) {
			return getRuleContext(RuleActionContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			match(LPAREN);
			setState(572);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPTIONS) | (1L << COLON) | (1L << AT))) != 0)) {
				{
				setState(563);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(562);
					optionsSpec();
					}
				}

				setState(568);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(565);
					ruleAction();
					}
					}
					setState(570);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(571);
				match(COLON);
				}
			}

			setState(574);
			altList();
			setState(575);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RulerefContext extends ParserRuleContext {
		public TerminalNode RULE_REF() { return getToken(ANTLRv4Parser.RULE_REF, 0); }
		public TerminalNode ARG_ACTION() { return getToken(ANTLRv4Parser.ARG_ACTION, 0); }
		public ElementOptionsContext elementOptions() {
			return getRuleContext(ElementOptionsContext.class,0);
		}
		public RulerefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleref; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterRuleref(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitRuleref(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitRuleref(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulerefContext ruleref() throws RecognitionException {
		RulerefContext _localctx = new RulerefContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_ruleref);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			match(RULE_REF);
			setState(579);
			_la = _input.LA(1);
			if (_la==ARG_ACTION) {
				{
				setState(578);
				match(ARG_ACTION);
				}
			}

			setState(582);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(581);
				elementOptions();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeContext extends ParserRuleContext {
		public List<TerminalNode> STRING_LITERAL() { return getTokens(ANTLRv4Parser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(ANTLRv4Parser.STRING_LITERAL, i);
		}
		public TerminalNode RANGE() { return getToken(ANTLRv4Parser.RANGE, 0); }
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			match(STRING_LITERAL);
			setState(585);
			match(RANGE);
			setState(586);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TerminalContext extends ParserRuleContext {
		public TerminalNode TOKEN_REF() { return getToken(ANTLRv4Parser.TOKEN_REF, 0); }
		public ElementOptionsContext elementOptions() {
			return getRuleContext(ElementOptionsContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(ANTLRv4Parser.STRING_LITERAL, 0); }
		public TerminalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterTerminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitTerminal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitTerminal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminalContext terminal() throws RecognitionException {
		TerminalContext _localctx = new TerminalContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_terminal);
		int _la;
		try {
			setState(596);
			switch (_input.LA(1)) {
			case TOKEN_REF:
				enterOuterAlt(_localctx, 1);
				{
				setState(588);
				match(TOKEN_REF);
				setState(590);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(589);
					elementOptions();
					}
				}

				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(592);
				match(STRING_LITERAL);
				setState(594);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(593);
					elementOptions();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementOptionsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(ANTLRv4Parser.LT, 0); }
		public List<ElementOptionContext> elementOption() {
			return getRuleContexts(ElementOptionContext.class);
		}
		public ElementOptionContext elementOption(int i) {
			return getRuleContext(ElementOptionContext.class,i);
		}
		public TerminalNode GT() { return getToken(ANTLRv4Parser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ANTLRv4Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ANTLRv4Parser.COMMA, i);
		}
		public ElementOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementOptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterElementOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitElementOptions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitElementOptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementOptionsContext elementOptions() throws RecognitionException {
		ElementOptionsContext _localctx = new ElementOptionsContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_elementOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			match(LT);
			setState(599);
			elementOption();
			setState(604);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(600);
				match(COMMA);
				setState(601);
				elementOption();
				}
				}
				setState(606);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(607);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementOptionContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(ANTLRv4Parser.ASSIGN, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ANTLRv4Parser.STRING_LITERAL, 0); }
		public ElementOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterElementOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitElementOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitElementOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementOptionContext elementOption() throws RecognitionException {
		ElementOptionContext _localctx = new ElementOptionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_elementOption);
		try {
			setState(616);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(609);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(610);
				id();
				setState(611);
				match(ASSIGN);
				setState(614);
				switch (_input.LA(1)) {
				case TOKEN_REF:
				case RULE_REF:
					{
					setState(612);
					id();
					}
					break;
				case STRING_LITERAL:
					{
					setState(613);
					match(STRING_LITERAL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public TerminalNode RULE_REF() { return getToken(ANTLRv4Parser.RULE_REF, 0); }
		public TerminalNode TOKEN_REF() { return getToken(ANTLRv4Parser.TOKEN_REF, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4ParserListener ) ((ANTLRv4ParserListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANTLRv4ParserVisitor ) return ((ANTLRv4ParserVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			_la = _input.LA(1);
			if ( !(_la==TOKEN_REF || _la==RULE_REF) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\39\u026f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\3\2\5\2\u0080\n\2\3\2\3\2\3\2\3\2\7\2\u0086\n\2\f\2\16\2"+
		"\u0089\13\2\3\2\3\2\7\2\u008d\n\2\f\2\16\2\u0090\13\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\5\3\u0099\n\3\3\4\3\4\3\4\3\4\5\4\u009f\n\4\3\5\3\5\3\5\3"+
		"\5\7\5\u00a5\n\5\f\5\16\5\u00a8\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\7\7\u00b3\n\7\f\7\16\7\u00b6\13\7\3\7\3\7\3\7\5\7\u00bb\n\7\3\b\3\b"+
		"\3\b\3\b\7\b\u00c1\n\b\f\b\16\b\u00c4\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\5\t\u00cd\n\t\3\n\3\n\3\n\3\n\7\n\u00d3\n\n\f\n\16\n\u00d6\13\n\3\n\5"+
		"\n\u00d9\n\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u00e1\n\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\5\f\u00e9\n\f\3\r\3\r\3\r\3\r\7\r\u00ef\n\r\f\r\16\r\u00f2"+
		"\13\r\3\16\7\16\u00f5\n\16\f\16\16\16\u00f8\13\16\3\17\3\17\5\17\u00fc"+
		"\n\17\3\20\5\20\u00ff\n\20\3\20\5\20\u0102\n\20\3\20\3\20\5\20\u0106\n"+
		"\20\3\20\5\20\u0109\n\20\3\20\5\20\u010c\n\20\3\20\5\20\u010f\n\20\3\20"+
		"\7\20\u0112\n\20\f\20\16\20\u0115\13\20\3\20\7\20\u0118\n\20\f\20\16\20"+
		"\u011b\13\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\5\21\u0125\n\21\3"+
		"\22\3\22\6\22\u0129\n\22\r\22\16\22\u012a\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\24\7\24\u0134\n\24\f\24\16\24\u0137\13\24\3\24\5\24\u013a\n\24\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\5\27\u0145\n\27\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\7\31\u014e\n\31\f\31\16\31\u0151\13\31\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\34\6\34\u015b\n\34\r\34\16\34\u015c\3\35\3"+
		"\35\3\36\3\36\3\37\3\37\3\37\7\37\u0166\n\37\f\37\16\37\u0169\13\37\3"+
		" \3 \3 \5 \u016e\n \3!\5!\u0171\n!\3!\5!\u0174\n!\3!\3!\3!\3!\3!\3\"\3"+
		"\"\3#\3#\3#\7#\u0180\n#\f#\16#\u0183\13#\3$\3$\5$\u0187\n$\3$\5$\u018a"+
		"\n$\3%\6%\u018d\n%\r%\16%\u018e\3&\3&\5&\u0193\n&\3&\3&\5&\u0197\n&\3"+
		"&\3&\5&\u019b\n&\3&\3&\5&\u019f\n&\5&\u01a1\n&\3\'\3\'\3\'\3\'\5\'\u01a7"+
		"\n\'\3(\3(\3(\3(\3)\3)\3)\3)\7)\u01b1\n)\f)\16)\u01b4\13)\3*\3*\3*\3*"+
		"\3*\3*\5*\u01bc\n*\3+\3+\5+\u01c0\n+\3,\3,\5,\u01c4\n,\3-\3-\3-\7-\u01c9"+
		"\n-\f-\16-\u01cc\13-\3.\5.\u01cf\n.\3.\7.\u01d2\n.\f.\16.\u01d5\13.\3"+
		"/\3/\3/\5/\u01da\n/\3/\3/\3/\5/\u01df\n/\3/\3/\3/\5/\u01e4\n/\5/\u01e6"+
		"\n/\3\60\3\60\3\60\3\60\5\60\u01ec\n\60\3\61\3\61\5\61\u01f0\n\61\3\62"+
		"\3\62\3\63\3\63\5\63\u01f6\n\63\3\63\3\63\5\63\u01fa\n\63\3\63\3\63\5"+
		"\63\u01fe\n\63\5\63\u0200\n\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64"+
		"\u0209\n\64\5\64\u020b\n\64\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u0213\n"+
		"\65\5\65\u0215\n\65\3\66\3\66\3\66\3\66\5\66\u021b\n\66\3\67\3\67\3\67"+
		"\3\67\7\67\u0221\n\67\f\67\16\67\u0224\13\67\3\67\3\67\38\38\58\u022a"+
		"\n8\38\38\58\u022e\n8\38\38\58\u0232\n8\39\39\59\u0236\n9\39\79\u0239"+
		"\n9\f9\169\u023c\139\39\59\u023f\n9\39\39\39\3:\3:\5:\u0246\n:\3:\5:\u0249"+
		"\n:\3;\3;\3;\3;\3<\3<\5<\u0251\n<\3<\3<\5<\u0255\n<\5<\u0257\n<\3=\3="+
		"\3=\3=\7=\u025d\n=\f=\16=\u0260\13=\3=\3=\3>\3>\3>\3>\3>\5>\u0269\n>\5"+
		">\u026b\n>\3?\3?\3?\2\2@\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|\2\5\4\2\r\r\21\23"+
		"\4\2##\'\'\3\2\3\4\u0297\2\177\3\2\2\2\4\u0098\3\2\2\2\6\u009e\3\2\2\2"+
		"\b\u00a0\3\2\2\2\n\u00ab\3\2\2\2\f\u00ba\3\2\2\2\16\u00bc\3\2\2\2\20\u00cc"+
		"\3\2\2\2\22\u00ce\3\2\2\2\24\u00dc\3\2\2\2\26\u00e8\3\2\2\2\30\u00ea\3"+
		"\2\2\2\32\u00f6\3\2\2\2\34\u00fb\3\2\2\2\36\u00fe\3\2\2\2 \u0121\3\2\2"+
		"\2\"\u0126\3\2\2\2$\u012e\3\2\2\2&\u0135\3\2\2\2(\u013b\3\2\2\2*\u013f"+
		"\3\2\2\2,\u0144\3\2\2\2.\u0146\3\2\2\2\60\u0149\3\2\2\2\62\u0152\3\2\2"+
		"\2\64\u0155\3\2\2\2\66\u015a\3\2\2\28\u015e\3\2\2\2:\u0160\3\2\2\2<\u0162"+
		"\3\2\2\2>\u016a\3\2\2\2@\u0170\3\2\2\2B\u017a\3\2\2\2D\u017c\3\2\2\2F"+
		"\u0189\3\2\2\2H\u018c\3\2\2\2J\u01a0\3\2\2\2L\u01a2\3\2\2\2N\u01a8\3\2"+
		"\2\2P\u01ac\3\2\2\2R\u01bb\3\2\2\2T\u01bf\3\2\2\2V\u01c3\3\2\2\2X\u01c5"+
		"\3\2\2\2Z\u01ce\3\2\2\2\\\u01e5\3\2\2\2^\u01e7\3\2\2\2`\u01ed\3\2\2\2"+
		"b\u01f1\3\2\2\2d\u01ff\3\2\2\2f\u020a\3\2\2\2h\u0214\3\2\2\2j\u021a\3"+
		"\2\2\2l\u021c\3\2\2\2n\u0231\3\2\2\2p\u0233\3\2\2\2r\u0243\3\2\2\2t\u024a"+
		"\3\2\2\2v\u0256\3\2\2\2x\u0258\3\2\2\2z\u026a\3\2\2\2|\u026c\3\2\2\2~"+
		"\u0080\7\6\2\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\u0082\5\4\3\2\u0082\u0083\5|?\2\u0083\u0087\7\35\2\2\u0084\u0086\5\6"+
		"\4\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008e\5\32"+
		"\16\2\u008b\u008d\5\30\r\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u008e\3\2"+
		"\2\2\u0091\u0092\7\2\2\3\u0092\3\3\2\2\2\u0093\u0094\7\16\2\2\u0094\u0099"+
		"\7\20\2\2\u0095\u0096\7\17\2\2\u0096\u0099\7\20\2\2\u0097\u0099\7\20\2"+
		"\2\u0098\u0093\3\2\2\2\u0098\u0095\3\2\2\2\u0098\u0097\3\2\2\2\u0099\5"+
		"\3\2\2\2\u009a\u009f\5\b\5\2\u009b\u009f\5\16\b\2\u009c\u009f\5\22\n\2"+
		"\u009d\u009f\5\24\13\2\u009e\u009a\3\2\2\2\u009e\u009b\3\2\2\2\u009e\u009c"+
		"\3\2\2\2\u009e\u009d\3\2\2\2\u009f\7\3\2\2\2\u00a0\u00a6\7\n\2\2\u00a1"+
		"\u00a2\5\n\6\2\u00a2\u00a3\7\35\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a1\3"+
		"\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\7/\2\2\u00aa\t\3\2\2\2"+
		"\u00ab\u00ac\5|?\2\u00ac\u00ad\7#\2\2\u00ad\u00ae\5\f\7\2\u00ae\13\3\2"+
		"\2\2\u00af\u00b4\5|?\2\u00b0\u00b1\7*\2\2\u00b1\u00b3\5|?\2\u00b2\u00b0"+
		"\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\u00bb\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00bb\7\62\2\2\u00b8\u00bb\7"+
		"\65\2\2\u00b9\u00bb\7\61\2\2\u00ba\u00af\3\2\2\2\u00ba\u00b7\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\r\3\2\2\2\u00bc\u00bd\7\f\2\2"+
		"\u00bd\u00c2\5\20\t\2\u00be\u00bf\7\34\2\2\u00bf\u00c1\5\20\t\2\u00c0"+
		"\u00be\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2"+
		"\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6\7\35\2\2\u00c6"+
		"\17\3\2\2\2\u00c7\u00c8\5|?\2\u00c8\u00c9\7#\2\2\u00c9\u00ca\5|?\2\u00ca"+
		"\u00cd\3\2\2\2\u00cb\u00cd\5|?\2\u00cc\u00c7\3\2\2\2\u00cc\u00cb\3\2\2"+
		"\2\u00cd\21\3\2\2\2\u00ce\u00cf\7\13\2\2\u00cf\u00d4\5|?\2\u00d0\u00d1"+
		"\7\34\2\2\u00d1\u00d3\5|?\2\u00d2\u00d0\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2"+
		"\2\2\u00d7\u00d9\7\34\2\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\u00da\3\2\2\2\u00da\u00db\7/\2\2\u00db\23\3\2\2\2\u00dc\u00e0\7,\2\2"+
		"\u00dd\u00de\5\26\f\2\u00de\u00df\7\33\2\2\u00df\u00e1\3\2\2\2\u00e0\u00dd"+
		"\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\5|?\2\u00e3"+
		"\u00e4\7\65\2\2\u00e4\25\3\2\2\2\u00e5\u00e9\5|?\2\u00e6\u00e9\7\16\2"+
		"\2\u00e7\u00e9\7\17\2\2\u00e8\u00e5\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8"+
		"\u00e7\3\2\2\2\u00e9\27\3\2\2\2\u00ea\u00eb\7\31\2\2\u00eb\u00ec\5|?\2"+
		"\u00ec\u00f0\7\35\2\2\u00ed\u00ef\5@!\2\u00ee\u00ed\3\2\2\2\u00ef\u00f2"+
		"\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\31\3\2\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f3\u00f5\5\34\17\2\u00f4\u00f3\3\2\2\2\u00f5\u00f8\3"+
		"\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\33\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f9\u00fc\5\36\20\2\u00fa\u00fc\5@!\2\u00fb\u00f9\3\2"+
		"\2\2\u00fb\u00fa\3\2\2\2\u00fc\35\3\2\2\2\u00fd\u00ff\7\6\2\2\u00fe\u00fd"+
		"\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0101\3\2\2\2\u0100\u0102\5\66\34\2"+
		"\u0101\u0100\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0105"+
		"\7\4\2\2\u0104\u0106\7\67\2\2\u0105\u0104\3\2\2\2\u0105\u0106\3\2\2\2"+
		"\u0106\u0108\3\2\2\2\u0107\u0109\5.\30\2\u0108\u0107\3\2\2\2\u0108\u0109"+
		"\3\2\2\2\u0109\u010b\3\2\2\2\u010a\u010c\5\60\31\2\u010b\u010a\3\2\2\2"+
		"\u010b\u010c\3\2\2\2\u010c\u010e\3\2\2\2\u010d\u010f\5\62\32\2\u010e\u010d"+
		"\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0113\3\2\2\2\u0110\u0112\5 \21\2\u0111"+
		"\u0110\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2"+
		"\2\2\u0114\u0119\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0118\5,\27\2\u0117"+
		"\u0116\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2"+
		"\2\2\u011a\u011c\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u011d\7\32\2\2\u011d"+
		"\u011e\5:\36\2\u011e\u011f\7\35\2\2\u011f\u0120\5&\24\2\u0120\37\3\2\2"+
		"\2\u0121\u0122\7,\2\2\u0122\u0124\5|?\2\u0123\u0125\5\"\22\2\u0124\u0123"+
		"\3\2\2\2\u0124\u0125\3\2\2\2\u0125!\3\2\2\2\u0126\u0128\7\36\2\2\u0127"+
		"\u0129\5$\23\2\u0128\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u0128\3\2"+
		"\2\2\u012a\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\7\37\2\2\u012d"+
		"#\3\2\2\2\u012e\u012f\5|?\2\u012f\u0130\7\32\2\2\u0130\u0131\7\62\2\2"+
		"\u0131%\3\2\2\2\u0132\u0134\5(\25\2\u0133\u0132\3\2\2\2\u0134\u0137\3"+
		"\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0139\3\2\2\2\u0137"+
		"\u0135\3\2\2\2\u0138\u013a\5*\26\2\u0139\u0138\3\2\2\2\u0139\u013a\3\2"+
		"\2\2\u013a\'\3\2\2\2\u013b\u013c\7\27\2\2\u013c\u013d\7\67\2\2\u013d\u013e"+
		"\7\65\2\2\u013e)\3\2\2\2\u013f\u0140\7\30\2\2\u0140\u0141\7\65\2\2\u0141"+
		"+\3\2\2\2\u0142\u0145\5\b\5\2\u0143\u0145\5\64\33\2\u0144\u0142\3\2\2"+
		"\2\u0144\u0143\3\2\2\2\u0145-\3\2\2\2\u0146\u0147\7\24\2\2\u0147\u0148"+
		"\7\67\2\2\u0148/\3\2\2\2\u0149\u014a\7\26\2\2\u014a\u014f\5|?\2\u014b"+
		"\u014c\7\34\2\2\u014c\u014e\5|?\2\u014d\u014b\3\2\2\2\u014e\u0151\3\2"+
		"\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\61\3\2\2\2\u0151\u014f"+
		"\3\2\2\2\u0152\u0153\7\25\2\2\u0153\u0154\7\67\2\2\u0154\63\3\2\2\2\u0155"+
		"\u0156\7,\2\2\u0156\u0157\5|?\2\u0157\u0158\7\65\2\2\u0158\65\3\2\2\2"+
		"\u0159\u015b\58\35\2\u015a\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015a"+
		"\3\2\2\2\u015c\u015d\3\2\2\2\u015d\67\3\2\2\2\u015e\u015f\t\2\2\2\u015f"+
		"9\3\2\2\2\u0160\u0161\5<\37\2\u0161;\3\2\2\2\u0162\u0167\5> \2\u0163\u0164"+
		"\7(\2\2\u0164\u0166\5> \2\u0165\u0163\3\2\2\2\u0166\u0169\3\2\2\2\u0167"+
		"\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168=\3\2\2\2\u0169\u0167\3\2\2\2"+
		"\u016a\u016d\5Z.\2\u016b\u016c\7-\2\2\u016c\u016e\5|?\2\u016d\u016b\3"+
		"\2\2\2\u016d\u016e\3\2\2\2\u016e?\3\2\2\2\u016f\u0171\7\6\2\2\u0170\u016f"+
		"\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0173\3\2\2\2\u0172\u0174\7\r\2\2\u0173"+
		"\u0172\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0176\7\3"+
		"\2\2\u0176\u0177\7\32\2\2\u0177\u0178\5B\"\2\u0178\u0179\7\35\2\2\u0179"+
		"A\3\2\2\2\u017a\u017b\5D#\2\u017bC\3\2\2\2\u017c\u0181\5F$\2\u017d\u017e"+
		"\7(\2\2\u017e\u0180\5F$\2\u017f\u017d\3\2\2\2\u0180\u0183\3\2\2\2\u0181"+
		"\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182E\3\2\2\2\u0183\u0181\3\2\2\2"+
		"\u0184\u0186\5H%\2\u0185\u0187\5P)\2\u0186\u0185\3\2\2\2\u0186\u0187\3"+
		"\2\2\2\u0187\u018a\3\2\2\2\u0188\u018a\3\2\2\2\u0189\u0184\3\2\2\2\u0189"+
		"\u0188\3\2\2\2\u018aG\3\2\2\2\u018b\u018d\5J&\2\u018c\u018b\3\2\2\2\u018d"+
		"\u018e\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018fI\3\2\2\2"+
		"\u0190\u0192\5L\'\2\u0191\u0193\5d\63\2\u0192\u0191\3\2\2\2\u0192\u0193"+
		"\3\2\2\2\u0193\u01a1\3\2\2\2\u0194\u0196\5f\64\2\u0195\u0197\5d\63\2\u0196"+
		"\u0195\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u01a1\3\2\2\2\u0198\u019a\5N"+
		"(\2\u0199\u019b\5d\63\2\u019a\u0199\3\2\2\2\u019a\u019b\3\2\2\2\u019b"+
		"\u01a1\3\2\2\2\u019c\u019e\7\65\2\2\u019d\u019f\7$\2\2\u019e\u019d\3\2"+
		"\2\2\u019e\u019f\3\2\2\2\u019f\u01a1\3\2\2\2\u01a0\u0190\3\2\2\2\u01a0"+
		"\u0194\3\2\2\2\u01a0\u0198\3\2\2\2\u01a0\u019c\3\2\2\2\u01a1K\3\2\2\2"+
		"\u01a2\u01a3\5|?\2\u01a3\u01a6\t\3\2\2\u01a4\u01a7\5f\64\2\u01a5\u01a7"+
		"\5p9\2\u01a6\u01a4\3\2\2\2\u01a6\u01a5\3\2\2\2\u01a7M\3\2\2\2\u01a8\u01a9"+
		"\7\36\2\2\u01a9\u01aa\5D#\2\u01aa\u01ab\7\37\2\2\u01abO\3\2\2\2\u01ac"+
		"\u01ad\7 \2\2\u01ad\u01b2\5R*\2\u01ae\u01af\7\34\2\2\u01af\u01b1\5R*\2"+
		"\u01b0\u01ae\3\2\2\2\u01b1\u01b4\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3"+
		"\3\2\2\2\u01b3Q\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b5\u01b6\5T+\2\u01b6\u01b7"+
		"\7\36\2\2\u01b7\u01b8\5V,\2\u01b8\u01b9\7\37\2\2\u01b9\u01bc\3\2\2\2\u01ba"+
		"\u01bc\5T+\2\u01bb\u01b5\3\2\2\2\u01bb\u01ba\3\2\2\2\u01bcS\3\2\2\2\u01bd"+
		"\u01c0\5|?\2\u01be\u01c0\7\31\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01be\3\2"+
		"\2\2\u01c0U\3\2\2\2\u01c1\u01c4\5|?\2\u01c2\u01c4\7\61\2\2\u01c3\u01c1"+
		"\3\2\2\2\u01c3\u01c2\3\2\2\2\u01c4W\3\2\2\2\u01c5\u01ca\5Z.\2\u01c6\u01c7"+
		"\7(\2\2\u01c7\u01c9\5Z.\2\u01c8\u01c6\3\2\2\2\u01c9\u01cc\3\2\2\2\u01ca"+
		"\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cbY\3\2\2\2\u01cc\u01ca\3\2\2\2"+
		"\u01cd\u01cf\5x=\2\u01ce\u01cd\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d3"+
		"\3\2\2\2\u01d0\u01d2\5\\/\2\u01d1\u01d0\3\2\2\2\u01d2\u01d5\3\2\2\2\u01d3"+
		"\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4[\3\2\2\2\u01d5\u01d3\3\2\2\2"+
		"\u01d6\u01d9\5^\60\2\u01d7\u01da\5d\63\2\u01d8\u01da\3\2\2\2\u01d9\u01d7"+
		"\3\2\2\2\u01d9\u01d8\3\2\2\2\u01da\u01e6\3\2\2\2\u01db\u01de\5h\65\2\u01dc"+
		"\u01df\5d\63\2\u01dd\u01df\3\2\2\2\u01de\u01dc\3\2\2\2\u01de\u01dd\3\2"+
		"\2\2\u01df\u01e6\3\2\2\2\u01e0\u01e6\5`\61\2\u01e1\u01e3\7\65\2\2\u01e2"+
		"\u01e4\7$\2\2\u01e3\u01e2\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e6\3\2"+
		"\2\2\u01e5\u01d6\3\2\2\2\u01e5\u01db\3\2\2\2\u01e5\u01e0\3\2\2\2\u01e5"+
		"\u01e1\3\2\2\2\u01e6]\3\2\2\2\u01e7\u01e8\5|?\2\u01e8\u01eb\t\3\2\2\u01e9"+
		"\u01ec\5h\65\2\u01ea\u01ec\5p9\2\u01eb\u01e9\3\2\2\2\u01eb\u01ea\3\2\2"+
		"\2\u01ec_\3\2\2\2\u01ed\u01ef\5p9\2\u01ee\u01f0\5b\62\2\u01ef\u01ee\3"+
		"\2\2\2\u01ef\u01f0\3\2\2\2\u01f0a\3\2\2\2\u01f1\u01f2\5d\63\2\u01f2c\3"+
		"\2\2\2\u01f3\u01f5\7$\2\2\u01f4\u01f6\7$\2\2\u01f5\u01f4\3\2\2\2\u01f5"+
		"\u01f6\3\2\2\2\u01f6\u0200\3\2\2\2\u01f7\u01f9\7%\2\2\u01f8\u01fa\7$\2"+
		"\2\u01f9\u01f8\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u0200\3\2\2\2\u01fb\u01fd"+
		"\7&\2\2\u01fc\u01fe\7$\2\2\u01fd\u01fc\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe"+
		"\u0200\3\2\2\2\u01ff\u01f3\3\2\2\2\u01ff\u01f7\3\2\2\2\u01ff\u01fb\3\2"+
		"\2\2\u0200e\3\2\2\2\u0201\u020b\5t;\2\u0202\u020b\5v<\2\u0203\u020b\7"+
		"\4\2\2\u0204\u020b\5j\66\2\u0205\u020b\7\5\2\2\u0206\u0208\7*\2\2\u0207"+
		"\u0209\5x=\2\u0208\u0207\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020b\3\2\2"+
		"\2\u020a\u0201\3\2\2\2\u020a\u0202\3\2\2\2\u020a\u0203\3\2\2\2\u020a\u0204"+
		"\3\2\2\2\u020a\u0205\3\2\2\2\u020a\u0206\3\2\2\2\u020bg\3\2\2\2\u020c"+
		"\u0215\5t;\2\u020d\u0215\5v<\2\u020e\u0215\5r:\2\u020f\u0215\5j\66\2\u0210"+
		"\u0212\7*\2\2\u0211\u0213\5x=\2\u0212\u0211\3\2\2\2\u0212\u0213\3\2\2"+
		"\2\u0213\u0215\3\2\2\2\u0214\u020c\3\2\2\2\u0214\u020d\3\2\2\2\u0214\u020e"+
		"\3\2\2\2\u0214\u020f\3\2\2\2\u0214\u0210\3\2\2\2\u0215i\3\2\2\2\u0216"+
		"\u0217\7.\2\2\u0217\u021b\5n8\2\u0218\u0219\7.\2\2\u0219\u021b\5l\67\2"+
		"\u021a\u0216\3\2\2\2\u021a\u0218\3\2\2\2\u021bk\3\2\2\2\u021c\u021d\7"+
		"\36\2\2\u021d\u0222\5n8\2\u021e\u021f\7(\2\2\u021f\u0221\5n8\2\u0220\u021e"+
		"\3\2\2\2\u0221\u0224\3\2\2\2\u0222\u0220\3\2\2\2\u0222\u0223\3\2\2\2\u0223"+
		"\u0225\3\2\2\2\u0224\u0222\3\2\2\2\u0225\u0226\7\37\2\2\u0226m\3\2\2\2"+
		"\u0227\u0229\7\3\2\2\u0228\u022a\5x=\2\u0229\u0228\3\2\2\2\u0229\u022a"+
		"\3\2\2\2\u022a\u0232\3\2\2\2\u022b\u022d\7\62\2\2\u022c\u022e\5x=\2\u022d"+
		"\u022c\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u0232\3\2\2\2\u022f\u0232\5t"+
		";\2\u0230\u0232\7\5\2\2\u0231\u0227\3\2\2\2\u0231\u022b\3\2\2\2\u0231"+
		"\u022f\3\2\2\2\u0231\u0230\3\2\2\2\u0232o\3\2\2\2\u0233\u023e\7\36\2\2"+
		"\u0234\u0236\5\b\5\2\u0235\u0234\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u023a"+
		"\3\2\2\2\u0237\u0239\5\64\33\2\u0238\u0237\3\2\2\2\u0239\u023c\3\2\2\2"+
		"\u023a\u0238\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u023d\3\2\2\2\u023c\u023a"+
		"\3\2\2\2\u023d\u023f\7\32\2\2\u023e\u0235\3\2\2\2\u023e\u023f\3\2\2\2"+
		"\u023f\u0240\3\2\2\2\u0240\u0241\5X-\2\u0241\u0242\7\37\2\2\u0242q\3\2"+
		"\2\2\u0243\u0245\7\4\2\2\u0244\u0246\7\67\2\2\u0245\u0244\3\2\2\2\u0245"+
		"\u0246\3\2\2\2\u0246\u0248\3\2\2\2\u0247\u0249\5x=\2\u0248\u0247\3\2\2"+
		"\2\u0248\u0249\3\2\2\2\u0249s\3\2\2\2\u024a\u024b\7\62\2\2\u024b\u024c"+
		"\7+\2\2\u024c\u024d\7\62\2\2\u024du\3\2\2\2\u024e\u0250\7\3\2\2\u024f"+
		"\u0251\5x=\2\u0250\u024f\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0257\3\2\2"+
		"\2\u0252\u0254\7\62\2\2\u0253\u0255\5x=\2\u0254\u0253\3\2\2\2\u0254\u0255"+
		"\3\2\2\2\u0255\u0257\3\2\2\2\u0256\u024e\3\2\2\2\u0256\u0252\3\2\2\2\u0257"+
		"w\3\2\2\2\u0258\u0259\7!\2\2\u0259\u025e\5z>\2\u025a\u025b\7\34\2\2\u025b"+
		"\u025d\5z>\2\u025c\u025a\3\2\2\2\u025d\u0260\3\2\2\2\u025e\u025c\3\2\2"+
		"\2\u025e\u025f\3\2\2\2\u025f\u0261\3\2\2\2\u0260\u025e\3\2\2\2\u0261\u0262"+
		"\7\"\2\2\u0262y\3\2\2\2\u0263\u026b\5|?\2\u0264\u0265\5|?\2\u0265\u0268"+
		"\7#\2\2\u0266\u0269\5|?\2\u0267\u0269\7\62\2\2\u0268\u0266\3\2\2\2\u0268"+
		"\u0267\3\2\2\2\u0269\u026b\3\2\2\2\u026a\u0263\3\2\2\2\u026a\u0264\3\2"+
		"\2\2\u026b{\3\2\2\2\u026c\u026d\t\4\2\2\u026d}\3\2\2\2U\177\u0087\u008e"+
		"\u0098\u009e\u00a6\u00b4\u00ba\u00c2\u00cc\u00d4\u00d8\u00e0\u00e8\u00f0"+
		"\u00f6\u00fb\u00fe\u0101\u0105\u0108\u010b\u010e\u0113\u0119\u0124\u012a"+
		"\u0135\u0139\u0144\u014f\u015c\u0167\u016d\u0170\u0173\u0181\u0186\u0189"+
		"\u018e\u0192\u0196\u019a\u019e\u01a0\u01a6\u01b2\u01bb\u01bf\u01c3\u01ca"+
		"\u01ce\u01d3\u01d9\u01de\u01e3\u01e5\u01eb\u01ef\u01f5\u01f9\u01fd\u01ff"+
		"\u0208\u020a\u0212\u0214\u021a\u0222\u0229\u022d\u0231\u0235\u023a\u023e"+
		"\u0245\u0248\u0250\u0254\u0256\u025e\u0268\u026a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}