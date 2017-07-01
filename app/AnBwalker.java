
public class AnBwalker extends ANBBaseListener {
	
	public String newFile = "";
	
	public AnBwalker(){
		String newFile = "";
	}

	@Override
	public void enterAnb_ProtocolName(ANBParser.Anb_ProtocolNameContext ctx) {
		newFile += "Protocol Name:\n"+ctx.ANB_Identifier().getText()+"\n";
	}
	
	@Override 
	public void enterAnb_Types(ANBParser.Anb_TypesContext ctx) {
		newFile += "Types Section:\n";
		for(int i=0; i < ctx.anb_Type().size(); i++)
		{
			newFile += ctx.anb_Type().get(i).ANB_Identifier().get(0).getText()+":";
			if(!ctx.anb_Type().get(i).getChild(1).equals(null) || !ctx.anb_Type().get(i).getChild(1).equals(""))
			{
				newFile += ctx.anb_Type().get(i).getChild(1).getText()+"\n";
			}
			else
			{
				newFile += ctx.anb_Type().get(i).ANB_KNOW()+"\n";
			}	
			
		}		
	}
	
	@Override 
	public void enterAnb_Knowlegde(ANBParser.Anb_KnowlegdeContext ctx) { 
		newFile += "Knowledge:\n";		
		for(int i=0; i < ctx.anb_know().size(); i++)
		{				
			newFile += ctx.anb_know(i).getText()+"\n";			
		}
	}
	
	@Override 
	public void enterAnb_Actions(ANBParser.Anb_ActionsContext ctx) { 
		newFile += "Actions:\n";		
		for(int i=0; i < ctx.anb_Action().size(); i++)
		{
			newFile += ctx.anb_Action(i).ANB_Identifier(0);
			newFile += ctx.anb_Action(i).ANB_CHANNEL();
			newFile += ctx.anb_Action(i).ANB_Identifier(1);
			newFile += ":";
			for(int j=0; j<ctx.anb_Action(i).anb_SubAction(0).getChildCount(); j++)
			{
				newFile += ctx.anb_Action(i).anb_SubAction(0).getChild(j).getText();
			}			
			newFile += "\n";		
		}		
	}
	
	@Override 
	public void exitAnb_Goals(ANBParser.Anb_GoalsContext ctx) { 
		newFile += "Goals:\n";
		
		for(int i=0; i < ctx.anb_Goal().size(); i++)
		{
			for(int j=0; j<ctx.anb_Goal(i).getChildCount(); j++)
			{
				newFile += ctx.anb_Goal(i).getChild(j).getText()+" ";
			}
			newFile += "\n";
		}
	}
}