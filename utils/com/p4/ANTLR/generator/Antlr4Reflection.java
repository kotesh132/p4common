package com.p4.ANTLR.generator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import lombok.Data;
import lombok.EqualsAndHashCode;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import com.p4.ANTLRv4.gen.ANTLRv4Lexer;
import com.p4.ANTLRv4.gen.ANTLRv4Parser;
import com.p4.ANTLRv4.gen.ANTLRv4Parser.*;
import com.p4.ANTLRv4.gen.ANTLRv4ParserBaseListener;

@Data
@EqualsAndHashCode(callSuper=true)
public class Antlr4Reflection extends ANTLRv4ParserBaseListener{
	private static CharStream cs;

	private static Map<String,ParserRuleSpecContext> rules = new LinkedHashMap<String,ParserRuleSpecContext>();
	private static List<String> altRules = new ArrayList<String>();
	private static boolean islabelled = false;

	@Override 
	public void exitParserRuleSpec(@NotNull ANTLRv4Parser.ParserRuleSpecContext ctx) { 

		if ( !islabelled){
			String parserRuleName = ctx.RULE_REF().getText();
			rules.put(parserRuleName,ctx);
		}
		else{
			for(String altRule : altRules)
			{
				rules.put(altRule,ctx);
			}
		}
		islabelled = false;
		altRules = new ArrayList<String>(); 
		

	}

	@Override
	public void enterLabeledAlt(@NotNull ANTLRv4Parser.LabeledAltContext ctx) {
		
		if ( ctx.POUND() != null)
		{
			islabelled = true;
			altRules.add(ctx.id().getText());
		}
	}

	public static String getInterfaces(ParserRuleSpecContext ctx) {
		if( ctx.annotation() != null && ctx.annotation().size() > 0)
		{
			for(AnnotationContext annotationCtx :ctx.annotation())
			{
				String annotationName = annotationCtx.id().getText().trim();
				if ( annotationName.equals("type")){
					AnnotationArgsContext annotationArgsContext = annotationCtx.annotationArgs();
					if( annotationArgsContext != null && !annotationArgsContext.getText().equals("")){
						for(AnnotationArgContext annotationArgContext: annotationArgsContext.annotationArg()){
							String key = annotationArgContext.id().getText().trim();
							if(key.equals("implements"))
								return annotationArgContext.STRING_LITERAL().getText().trim();
						}
					}
				}

			}
		}
		return null;
	}


	public static  Map<String,ParserRuleSpecContext> getParserRules(String filename) throws IOException {

		InputStream ip = Antlr4Reflection.class.getClassLoader().getResourceAsStream(filename);
		cs = new ANTLRInputStream(ip);
		ANTLRv4Lexer lexer = new ANTLRv4Lexer(cs);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ANTLRv4Parser parser = new ANTLRv4Parser(tokens);
		ParserRuleContext tree = parser.grammarSpec();
		ParseTreeWalker walker  = new ParseTreeWalker();
		Antlr4Reflection sr = new Antlr4Reflection();
		walker.walk(sr, tree);
		return rules;
	}


	public static String getRuleName(ParserRuleSpecContext parseRule) {
		return parseRule.RULE_REF().getText().trim();
	}

	public static void main(String[] args) throws IOException {
		getParserRules("grammar/ANTLRv4Parser.g4");
	}

}
