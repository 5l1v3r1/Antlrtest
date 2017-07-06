package ui;

import org.antlr.runtime.tree.CommonTree;

import handlers.AnBHandler;
import handlers.AnBxHandler;

public class HelloRunner 
    {
    	public static void main( String[] args) throws Exception 
    	{
    		String filepath = "EPMO";
    		AnBHandler anbHandlerObject = new AnBHandler();
//			anbHandlerObject.writeFile(anbHandlerObject.openFile("./study_cases/set_rev.AnB"));
//    		anbHandlerObject.analizeFile(anbHandlerObject.openFile("./study_cases/"+filepath+".AnB"));
			
			AnBxHandler anbxHandlerObject = new AnBxHandler();
			filepath = anbxHandlerObject.writeFile(anbxHandlerObject.openFile("./study_cases/"+filepath+".AnBx"));
			System.out.println(filepath);
//			anbxHandlerObject.analizeFile(anbxHandlerObject.openFile("./study_cases/"+filepath+".AnBx"));   		
			
			
    	}
    }