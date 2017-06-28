
import java.io.BufferedReader;
import java.io.FileReader;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class HelloRunner 
    {
    	public static void main( String[] args) throws Exception 
    	{
    		String everything = "";
    		
    		BufferedReader br = new BufferedReader(new FileReader("./study_cases/WL92.AnB"));
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
    		
    		ParseTree tree = anbparser.anb_Protocol(); 
    		
    		ParseTreeWalker anbwalker = new ParseTreeWalker();
    		
    		ANBBaseListener anblistener = new ANBBaseListener();
    		
    		anbwalker.walk(anblistener, tree);
    		
    		//anbparser.setBuildParseTree(true);
    		
    		System.out.println(tree.toStringTree(anbparser));
    		
//    		ParseTree protocol = tree.getChild(0);
//    		System.out.println(tree.getChild(3).toStringTree());
    	}
    }