package com.p4.ANTLR.generator;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.p4.ANTLRv4.gen.ANTLRv4Lexer;
import com.p4.ANTLRv4.gen.ANTLRv4Parser;
import com.p4.ANTLRv4.gen.ANTLRv4Parser.*;
import com.p4.ANTLRv4.gen.ANTLRv4ParserBaseVisitor;



public class LocalsPopulatingVisitor extends ANTLRv4ParserBaseVisitor<String>{

	private StringBuilder sb;
	private ContextPrinter contextPrinter;
	protected static final Logger L = LoggerFactory.getLogger(LocalsPopulatingVisitor.class);

	public LocalsPopulatingVisitor(){
		sb = new StringBuilder();
		contextPrinter = new ContextPrinter();
	}

	/*
	grammarSpec
	:	DOC_COMMENT?
		grammarType id SEMI
		prequelConstruct*
		rules
		modeSpec*
		EOF
	;
	*/


	@Override 
	public String visitGrammarSpec(@NotNull ANTLRv4Parser.GrammarSpecContext ctx) {
		if( ctx.DOC_COMMENT() != null){
			sb.append(contextPrinter.getFormattedText(ctx.DOC_COMMENT()));
			sb.append("\n");
		}
		sb.append(contextPrinter.getFormattedText(ctx.grammarType()));
		sb.append(" ");
		sb.append(contextPrinter.getFormattedText(ctx.id()));
		sb.append(ctx.SEMI());
		sb.append("\n");
		if ( ctx.prequelConstruct() != null && ctx.prequelConstruct().size() > 0)
		{
			for(PrequelConstructContext prequelConstructContext : ctx.prequelConstruct())
			{
				sb.append(contextPrinter.getFormattedText(prequelConstructContext));
			}
		}
		sb.append("\n");
		visit(ctx.rules());
		sb.append("\n");
		if ( ctx.modeSpec() != null && ctx.modeSpec().size() > 0)
		{
			for(ModeSpecContext modeSpecContext : ctx.modeSpec())
			{
				sb.append(contextPrinter.getFormattedText(modeSpecContext));
			}
		}
		return null;
	}

	/*
	parserRuleSpec
	:	DOC_COMMENT?
        ruleModifiers? RULE_REF ARG_ACTION?
        ruleReturns? throwsSpec? localsSpec? annotation*
		rulePrequel*
		COLON
            ruleBlock
		SEMI
		exceptionGroup
	;
	 */

	@Override 
	public String visitParserRuleSpec(@NotNull ANTLRv4Parser.ParserRuleSpecContext ctx) {
		sb.append("\n");
		if( ctx.DOC_COMMENT() != null)
			sb.append(contextPrinter.getFormattedText(ctx.DOC_COMMENT()));
		if (ctx.ruleModifiers() != null)
		{
			sb.append(contextPrinter.getFormattedText(ctx.ruleModifiers()));
			sb.append("\n");
		}
		sb.append(ctx.RULE_REF().getText());
		sb.append("\n");
		if (ctx.ARG_ACTION() != null)
		{
			sb.append(ctx.ARG_ACTION().getText());
			sb.append("\n");
		}
		if ( ctx.ruleReturns() != null)
		{
			sb.append(contextPrinter.getFormattedText(ctx.ruleReturns()));
			sb.append("\n");
		}
		if ( ctx.throwsSpec() != null)
		{
			sb.append(contextPrinter.getFormattedText(ctx.throwsSpec()));
			sb.append("\n");
		}
		if ( ctx.localsSpec() != null)
		{
			String arg_action = ctx.localsSpec().ARG_ACTION().getText();
			arg_action = arg_action.substring(1, arg_action.length()-1);

			String name = ctx.RULE_REF().getText();
			String camelCase = name.substring(0, 1).toUpperCase() + name.substring(1);
			String extendedContext = camelCase+"ContextExt extendedContext";
			arg_action = arg_action + ", "+extendedContext;
			sb.append("locals ["+ arg_action + "]\n");
		}
		else{
			String name = ctx.RULE_REF().getText();
			String camelCase = name.substring(0, 1).toUpperCase() + name.substring(1);
			String extendedContext = camelCase+"ContextExt extendedContext";
			sb.append("locals ["+ extendedContext + "]\n");

		}
		if ( ctx.annotation() != null && ctx.annotation().size() > 0)
		{
			for(AnnotationContext annotationContext:ctx.annotation())
			{
				sb.append(contextPrinter.getFormattedText(annotationContext));
				sb.append("\n");
			}
		}
		if ( ctx.rulePrequel() != null && ctx.rulePrequel().size() > 0)
		{
			for(RulePrequelContext rulePrequelContext:ctx.rulePrequel())
			{
				sb.append(contextPrinter.getFormattedText(rulePrequelContext));
				sb.append("\n");
			}
		}
		sb.append(":\t");
		sb.append(contextPrinter.getFormattedText(ctx.ruleBlock()));
		sb.append(";");
		if (ctx.exceptionGroup() != null)
			sb.append(contextPrinter.getFormattedText(ctx.exceptionGroup()));
		sb.append("\n");
		return null;
	}



	@Override public String visitLexerRule(@NotNull ANTLRv4Parser.LexerRuleContext ctx){
		sb.append("\n");
		sb.append(contextPrinter.getFormattedText(ctx));
		return null;
	}




	public static String process(String grammarFile) throws IOException
	{
		File inputFile = new File(grammarFile);
		InputStream inputStream = LocalsPopulatingVisitor.class.getClassLoader().getResourceAsStream(grammarFile);
		if ( inputStream == null)
		{
			L.error("File Not Found" + grammarFile);
			return null;
		}
		ANTLRv4Lexer lexer = new ANTLRv4Lexer(new ANTLRInputStream(inputStream));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ANTLRv4Parser parser = new ANTLRv4Parser(tokens);
		ANTLRv4Parser.GrammarSpecContext grammarSpecContext = parser.grammarSpec();
		LocalsPopulatingVisitor localsPopulatingVisitor = new LocalsPopulatingVisitor();
		localsPopulatingVisitor.visit(grammarSpecContext);
		return localsPopulatingVisitor.sb.toString();
	}

	
	public static void main(String args[]){
		try{
			process("grammar/p416_new.g4");
		}
		catch( IOException ex)
		{
			ex.printStackTrace();
		}
	}
}
