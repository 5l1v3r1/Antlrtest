import java.io.BufferedReader;
import java.io.FileReader;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


public class HelloRunner 
    {
    	public static void main( String[] args) throws Exception 
    	{
    		String everything = "";
    		
    		BufferedReader br = new BufferedReader(new FileReader("./study_cases/dh_auth.AnB"));
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
    		
    		
    		
//    		ParseTree protocol = tree.getChild(0);
//    		
    		System.out.println(tree.getChild(3).toStringTree());
//    		System.out.println(tree.getChild(2).getChild(2).toStringTree());
//    		System.out.println(tree.getChild(2).getChild(3).toStringTree());
//    		System.out.println(tree.getChild(2).getChild(4).toStringTree());
//    		
//    		System.out.println(tree.getChild(2).getChild(4).getChildCount());
//    		System.out.println(tree.getChild(2).getChild(4).getChild(2).toStringTree());
    		
//    		
//    		CSVLexer lexer3 = new CSVLexer(input);
//    		
//    		CommonTokenStream tokens3 = new CommonTokenStream(lexer3);
//    		
//    		CSVParser parser3 = new CSVParser(tokens3);
//    		
//    		ParseTree tree = parser3.csvFile(); // begin parsing at rule 'r'
//    		
//    		System.out.println(tree.toStringTree(parser3)); // print LISP-style tree
    
//    		ANTLRInputStream input2 = new ANTLRInputStream();
//    		
//    		@SuppressWarnings("deprecation")
//			ANTLRInputStream input = new ANTLRInputStream( System.in);
//    
//    		HelloLexer lexer = new HelloLexer(input);
//    		
//    		HTMLLexer lexer2 = new HTMLLexer(input);
//    		
//    		CSVLexer lexer3 = new CSVLexer(input);
//    
//    		CommonTokenStream tokens = new CommonTokenStream(lexer);
//    		
//    		CommonTokenStream tokens2 = new CommonTokenStream(lexer2);
//    		
//    		CommonTokenStream tokens3 = new CommonTokenStream(lexer3);
//    
//    		HelloParser parser = new HelloParser(tokens);
//    		
//    		HTMLParser parser2 = new HTMLParser(tokens2);
//    		
//    		CSVParser parser3 = new CSVParser(tokens3);
//    		
//    		ParseTree tree = parser3.csvFile(); // begin parsing at rule 'r'
//    		System.out.println(tree.toStringTree(parser3)); // print LISP-style tree
    		
    		
    	}
    }