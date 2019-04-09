package com.p4.ANTLR.generator;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Map.Entry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroupFile;

import com.p4.ANTLRv4.gen.ANTLRv4Parser.ParserRuleSpecContext;
import com.p4.utils.FileUtils;

public class Generator{

	protected static final Logger L = LoggerFactory.getLogger(Generator.class);

	private static String toContextCase(String input){
		StringBuilder sb = new StringBuilder();
		sb.append(input.substring(0, 1).toUpperCase());
		sb.append(input.substring(1));
		return sb.toString();
	}

	public static void generateExtendedContextClasses(Properties props)
	{
		Map<String,ParserRuleSpecContext> rulesMap = null;
		String templateFile = props.getProperty("ExtCtx.templateFile");
		String grammarFile = props.getProperty("grammarFile");
		String extClassDir = props.getProperty("ExtCtx.destDir");
		String packageName = props.getProperty("ExtCtx.packageName");
		String importsStr = props.getProperty("ExtCtx.imports");
		String override = props.getProperty("ExtCtx.override");

		String[] importsArray = importsStr.split(",");
		for(int i=0; i < importsArray.length; i++)
			importsArray[i] = importsArray[i].trim();

		List<String> imports = Arrays.asList(importsStr.split(","));

		Path extClassDirPath = Paths.get(extClassDir);
		try {
			Files.createDirectories(extClassDirPath);
		} catch (IOException e1) {
			L.error("Unable to create the directory path" + extClassDirPath);
			e1.printStackTrace();
		}

		try {
			rulesMap  = Antlr4Reflection.getParserRules(grammarFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		STGroupFile stgf = new STGroupFile(templateFile);

		for(Entry<String, ParserRuleSpecContext> entry:rulesMap.entrySet()){
			ParserRuleSpecContext parseRule = entry.getValue();
			String ruleName = Antlr4Reflection.getRuleName(parseRule);
			String classname = toContextCase(entry.getKey());
			String extendedClassname = "AbstractBaseExt";
			
			ST st = null;
			if( !classname.equals(ruleName))
			{
				templateFile = "Abstract"+templateFile;
				st = stgf.getInstanceOf("AbsractExtendedContextClassSkel");
				String interfaces = Antlr4Reflection.getInterfaces(parseRule);
				st.add("className", classname);
				st.add("extendedClassname", extendedClassname);
				st.add("packageName", packageName);
				st.add("imports", imports);
				st.add("interfaceNames", interfaces);
			}
			else{
				st = stgf.getInstanceOf("ExtendedContextClassSkel");
				extendedClassname = toContextCase(ruleName);
				String interfaces = Antlr4Reflection.getInterfaces(parseRule);
				st.add("className", classname);
				st.add("extendedClassname", extendedClassname);
				st.add("ruleName",ruleName);
				st.add("packageName", packageName);
				st.add("imports", imports);
				st.add("interfaceNames", interfaces);
			}
			File classFile = new File(extClassDir+"/"+classname+"ContextExt.java");
			if(!classFile.exists() || override.equals("true"))
				FileUtils.WriteFile(classFile, st.render());
			else{
				L.info(st.render());
			}
			L.info("Generated "+ extClassDir+classname+"ContextExt.java");
		}
	}

	private static void generatePopulateExtendedContextVisitorClass(Properties props) {

		Map<String,ParserRuleSpecContext> rulesMap = null;
		String grammarName = props.getProperty("grammarName");
		String grammarFile = props.getProperty("grammarFile");
		String templateFile = props.getProperty("ExtCtxPopulateVisitor.templateFile");
		String packageName = props.getProperty("ExtCtxPopulateVisitor.packageName");
		String importsStr = props.getProperty("ExtCtxPopulateVisitor.imports");
		String dstDir = props.getProperty("ExtCtxPopulateVisitor.destDir");
		String override = props.getProperty("ExtCtxPopulateVisitor.override");

		List<String> imports = Arrays.asList(importsStr.split(","));

		try {
			rulesMap  = Antlr4Reflection.getParserRules(grammarFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		assert(rulesMap != null);

		Path dstDirPath = Paths.get(dstDir);
		try {
			Files.createDirectories(dstDirPath);
		} catch (IOException e1) {
			L.error("Unable to create the directory path" + dstDirPath);
			e1.printStackTrace();
		}
		Map<String,String> ruleNamesMap = new LinkedHashMap<String,String>();
		for (Entry<String,ParserRuleSpecContext> entry : rulesMap.entrySet())
		{
			String ruleName = Antlr4Reflection.getRuleName(entry.getValue());
			ruleNamesMap.put(toContextCase(entry.getKey()), toContextCase(ruleName));
		}
		STGroupFile stgf = new STGroupFile(templateFile);
		ST st = stgf.getInstanceOf("ExtendedContextPopulatingVisitorSkel");
		st.add("grammarName", grammarName);
		st.add("packageName", packageName);
		st.add("imports", imports);
		st.add("ruleNamesMap", ruleNamesMap);

		File classFile = new File(dstDir+"/PopulateExtendedContextVisitor.java");
		if(!classFile.exists() || override.equals("true"))
			FileUtils.WriteFile(classFile, st.render());
		else{
			L.info(st.render());
		}
		L.info("Generated "+ dstDir+"/PopulateExtendedContextVisitor.java");

	}
	private static void generateExtendedContextGetVisitorClass(Properties props) {
		Map<String,ParserRuleSpecContext> rulesMap = null;
		String grammarName = props.getProperty("grammarName");
		String grammarFile = props.getProperty("grammarFile");
		String templateFile = props.getProperty("ExtCtxGetVisitor.templateFile");
		String packageName = props.getProperty("ExtCtxGetVisitor.packageName");
		String importsStr = props.getProperty("ExtCtxGetVisitor.imports");
		String dstDir = props.getProperty("ExtCtxGetVisitor.destDir");
		String override = props.getProperty("ExtCtxGetVisitor.override");


		List<String> imports = Arrays.asList(importsStr.split(","));

		try {
			rulesMap  = Antlr4Reflection.getParserRules(grammarFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		assert(rulesMap != null);

		Path dstDirPath = Paths.get(dstDir);
		try {
			Files.createDirectories(dstDirPath);
		} catch (IOException e1) {
			L.error("Unable to create the directory path" + dstDirPath);
			e1.printStackTrace();
		}
		List<String> parseRuleNames = new ArrayList<String>();
		for (Entry<String,ParserRuleSpecContext> entry : rulesMap.entrySet())
		{
			parseRuleNames.add(toContextCase(entry.getKey()));
		}
		STGroupFile stgf = new STGroupFile(templateFile);
		ST st = stgf.getInstanceOf("ExtendedContextGetVisitorSkel");
		st.add("grammarName", grammarName);
		st.add("packageName", packageName);
		st.add("imports", imports);
		st.add("parseRuleNames", parseRuleNames);

		File classFile = new File(dstDir+"/ExtendedContextGetVisitor.java");
		if(!classFile.exists() || override.equals("true"))
			FileUtils.WriteFile(classFile, st.render());
		else{
			L.info(st.render());
		}

		L.info("Generated "+ dstDir+"/ExtendedContextGetVisitor.java");

	}
	private static void generateContextGetVisitorClass(Properties props) {
		Map<String,ParserRuleSpecContext> rulesMap = null;
		String grammarName = props.getProperty("grammarName");
		String grammarFile = props.getProperty("grammarFile");
		String templateFile = props.getProperty("ExtCtxGetVisitor.templateFile");
		String packageName = props.getProperty("ExtCtxGetVisitor.packageName");
		String importsStr = props.getProperty("ExtCtxGetVisitor.imports");
		String dstDir = props.getProperty("ExtCtxGetVisitor.destDir");
		String override = props.getProperty("ExtCtxGetVisitor.override");


		List<String> imports = Arrays.asList(importsStr.split(","));

		try {
			rulesMap  = Antlr4Reflection.getParserRules(grammarFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		assert(rulesMap != null);

		Path dstDirPath = Paths.get(dstDir);
		try {
			Files.createDirectories(dstDirPath);
		} catch (IOException e1) {
			L.error("Unable to create the directory path" + dstDirPath);
			e1.printStackTrace();
		}
		List<String> parseRuleNames = new ArrayList<String>();
		for (Entry<String,ParserRuleSpecContext> entry : rulesMap.entrySet())
		{
			parseRuleNames.add(toContextCase(entry.getKey()));
		}
		STGroupFile stgf = new STGroupFile(templateFile);
		ST st = stgf.getInstanceOf("ContextGetVisitorSkel");
		st.add("grammarName", grammarName);
		st.add("packageName", packageName);
		st.add("imports", imports);
		st.add("parseRuleNames", parseRuleNames);

		File classFile = new File(dstDir+"/ExtendedContextGetVisitor.java");
		if(!classFile.exists() || override.equals("true"))
			FileUtils.WriteFile(classFile, st.render());
		else{
			L.info(st.render());
		}

		L.info("Generated "+ dstDir+"/ExtendedContextGetVisitor.java");

	}

	private static void generateAbstractBaseExtClass(Properties props) {
		String grammarName = props.getProperty("grammarName");
		String templateFile = props.getProperty("AbstractBaseExt.templateFile");
		String packageName = props.getProperty("AbstractBaseExt.packageName");
		String importsStr = props.getProperty("AbstractBaseExt.imports");
		String dstDir = props.getProperty("AbstractBaseExt.destDir");
		String interfaces = props.getProperty("AbstractBaseExt.interfaces");
		String override = props.getProperty("AbstractBaseExt.override");

		String[] importsArray = importsStr.split(",");
		for(int i=0; i < importsArray.length; i++)
			importsArray[i] = importsArray[i].trim();

		List<String> imports = Arrays.asList(importsStr.split(","));
		Path dstDirPath = Paths.get(dstDir);
		try {
			Files.createDirectories(dstDirPath);
		} catch (IOException e1) {
			L.error("Unable to create the directory path" + dstDirPath);
			e1.printStackTrace();
		}

		STGroupFile stgf = new STGroupFile(templateFile);
		ST st = stgf.getInstanceOf("AbstractBaseExtSkel");
		st.add("grammarName", grammarName);
		st.add("packageName", packageName);
		st.add("imports", imports);
		if(interfaces != null)
			st.add("interfaces", interfaces);

		File classFile = new File(dstDir+"/AbstractBaseExt.java");
		if(!classFile.exists() || override.equals("true"))
			FileUtils.WriteFile(classFile, st.render());
		else{
			L.info(st.render());
		}

		L.info("Generated "+ dstDir+"/AbstractBaseExt.java");
	}


	private static void populateLocals(Properties props) throws IOException
	{
		String grammarFilePath = props.getProperty("grammarFile");
		String destFilePath = props.getProperty("LocalsPopulateVisitor.destFile");
		String override = props.getProperty("LocalsPopulateVisitor.override");
		String updatedGrammar = LocalsPopulatingVisitor.process(grammarFilePath);
		File destFile = new File(destFilePath);
		if(!destFile.exists() || override.equals("true"))
			FileUtils.WriteFile(destFile,updatedGrammar);
		else{
			L.info(updatedGrammar);
		}

	}


	public static void main(String[] args){
		Properties props = new Properties();
		try {
			InputStream inputStream = Generator.class.getClassLoader().getResourceAsStream(args[0]);
			props.load(inputStream);
			Generator.generateAbstractBaseExtClass(props);
			Generator.generateExtendedContextClasses(props);
			Generator.generatePopulateExtendedContextVisitorClass(props);
			Generator.generateExtendedContextGetVisitorClass(props);
			Generator.populateLocals(props);
		} catch (IOException e) {
			System.out.println("File Not found"+args[0]);
			e.printStackTrace();
		}


	}







}
