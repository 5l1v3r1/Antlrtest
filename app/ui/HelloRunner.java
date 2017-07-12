package ui;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupDir;

import handlers.AnBHandler;
import handlers.AnBxHandler;

public class HelloRunner 
    {
    	public static void main( String[] args) throws Exception 
    	{
    		String filepath = "EPMO";
    		AnBHandler anbHandlerObject = new AnBHandler();
			filepath = anbHandlerObject.writeFile(anbHandlerObject.openFile("./study_cases/"+filepath+".AnB"));
			System.out.println(filepath);
//    		anbHandlerObject.analizeFile(anbHandlerObject.openFile("./study_cases/"+filepath+".AnB"));
			
//			AnBxHandler anbxHandlerObject = new AnBxHandler();
//			filepath = anbxHandlerObject.writeFile(anbxHandlerObject.openFile("./study_cases/"+filepath+".AnBx"));
//			System.out.println(filepath);
//			anbxHandlerObject.analizeFile(anbxHandlerObject.openFile("./study_cases/"+filepath+".AnBx"));   		
			
//    		STGroup groupStringTemplate = new STGroupDir("./stringTemplates");
//    		ST st = groupStringTemplate.getInstanceOf("protocolname");
//    		st.add("name", "test");
//           System.out.println(st.render());
    		
    	}
    }