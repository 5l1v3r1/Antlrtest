
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
    		
    		AnBHandler anbHandlerObject = new AnBHandler();
			anbHandlerObject.writeFile(anbHandlerObject.openFile("./study_cases/set_rev.AnB"));
			
//			AnBxHandler anbxHandlerObject = new AnBxHandler();
//			anbxHandlerObject.analizeFile("./study_cases/rev_1kp.AnBx");   		
			
    	}
    }