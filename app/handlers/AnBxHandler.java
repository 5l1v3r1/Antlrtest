package handlers;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import baseClasses.ANBXLexer;
import baseClasses.ANBXParser;

public class AnBxHandler {
	
	public void analizeFile(String everything){

		ANBXLexer anbxlexer = new ANBXLexer(CharStreams.fromString(everything));

		CommonTokenStream anbxtokens = new CommonTokenStream(anbxlexer);

		ANBXParser anbxparser = new ANBXParser(anbxtokens);

		ParseTree tree = anbxparser.anbx_Protocol();

		System.out.println(tree.toStringTree(anbxparser));
	}
	
	public String writeFile(String everything) {
		String output = "";

		ANBXLexer anbxlexer = new ANBXLexer(CharStreams.fromString(everything));

		CommonTokenStream anbxtokens = new CommonTokenStream(anbxlexer);

		ANBXParser anbxparser = new ANBXParser(anbxtokens);

		ParseTree tree = anbxparser.anbx_Protocol();

		//System.out.println(tree.toStringTree(anbparser));	

		ParseTreeWalker anbxwalker = new ParseTreeWalker();
		
		AnBxwalker anbxlistener = new AnBxwalker();
				
		anbxwalker.walk(anbxlistener, tree);
		
		output = anbxlistener.newFile;
		
		return output;
	}
	
	public String openFile(String path) throws IOException {
		String everything = "";

		BufferedReader br = new BufferedReader(new FileReader(path));
		try {
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
			}
			everything = sb.toString();
		} finally {
			br.close();
		}
		
		return everything;
	}
	
	public boolean saveFile(String path, String content){
		String filepath = path+".peal";
		String filecontent = content;
		
		FileWriter save;
		try {
			save = new FileWriter(filepath);
			save.write(filecontent);
			save.close();
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
}
