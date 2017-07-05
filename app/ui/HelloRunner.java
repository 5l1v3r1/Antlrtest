package ui;

import handlers.AnBHandler;
import handlers.AnBxHandler;

public class HelloRunner 
    {
    	public static void main( String[] args) throws Exception 
    	{
    		String filepath = "WMF";
    		AnBHandler anbHandlerObject = new AnBHandler();
//			anbHandlerObject.writeFile(anbHandlerObject.openFile("./study_cases/set_rev.AnB"));
    		anbHandlerObject.analizeFile(anbHandlerObject.openFile("./study_cases/"+filepath+".AnB"));
			
			AnBxHandler anbxHandlerObject = new AnBxHandler();
			//anbxHandlerObject.writeFile(anbxHandlerObject.openFile("./study_cases/Amended_NSCK.AnBx"));
			anbxHandlerObject.analizeFile(anbxHandlerObject.openFile("./study_cases/"+filepath+".AnBx"));   		
			
    	}
    }