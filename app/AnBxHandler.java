import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class AnBxHandler {
	
	public void analizeFile(String everything){

		ANTLRInputStream input = new ANTLRInputStream(everything);

		ANBXLexer anbxlexer = new ANBXLexer(input);

		CommonTokenStream anbxtokens = new CommonTokenStream(anbxlexer);

		ANBXParser anbxparser = new ANBXParser(anbxtokens);

		ParseTree tree = anbxparser.anb_Protocol();

		System.out.println(tree.toStringTree(anbxparser));
	}
	
	public String writeFile(String everything) {
		String output = "";
		
		ANTLRInputStream input = new ANTLRInputStream(everything);

		ANBXLexer anbxlexer = new ANBXLexer(input);

		CommonTokenStream anbxtokens = new CommonTokenStream(anbxlexer);

		ANBXParser anbxparser = new ANBXParser(anbxtokens);

		ParseTree tree = anbxparser.anb_Protocol();

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
}
