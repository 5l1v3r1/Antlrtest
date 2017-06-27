import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class AtnlrHandler {

	public void test(String path) throws IOException
	{
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
		
		ANTLRInputStream input = new ANTLRInputStream(everything);
		
		ANBLexer anblexer = new ANBLexer(input);
		
		CommonTokenStream anbtokens = new CommonTokenStream(anblexer);
		
		ANBParser anbparser = new ANBParser(anbtokens);
		
		ParseTree tree = anbparser.anb_Protocol(); // begin parsing at rule 'r'
		
		System.out.println(tree.toStringTree(anbparser));
	}
	
}
