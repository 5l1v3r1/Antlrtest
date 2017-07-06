package handlers;

import parsersLexers.ANBXBaseListener;
import parsersLexers.ANBXParser;

public class AnBxwalker extends ANBXBaseListener {
	public String newFile = "";

	public AnBxwalker() {
		String newFile = "";
	}

	@Override
	public void enterAnbx_ProtocolName(ANBXParser.Anbx_ProtocolNameContext ctx) {

		for (int i = 0; i < ctx.ANBX_Identifier().size(); i++) {
			newFile += "Protocol Name:\n" + ctx.ANBX_Identifier().get(i).getText() + "\n";
		}
	}

	@Override
	public void enterAnbx_Types(ANBXParser.Anbx_TypesContext ctx) {
		newFile += "Types Section:\n";

		for (int i = 0; i < ctx.anbx_Type().size(); i++) {
			if (ctx.anbx_Type(i).ANBX_CHANNEL() == null) {
				if (ctx.anbx_Type(i).ANBX_Identifier().size() == 1) {
					newFile += ctx.anbx_Type(i).ANBX_Identifier(0).getText();
					newFile += " : ";
					for (int j = 0; j < ctx.anbx_Type(i).ANBX_KNOW().size(); j++) {
						newFile += ctx.anbx_Type(i).ANBX_KNOW(j).getText();
						newFile += "\n";
					}
				} else {
					newFile += ctx.anbx_Type(i).ANBX_Identifier(0).getText();
					newFile += " : ";
					newFile += ctx.anbx_Type(i).ANBX_Identifier(1).getText();
					newFile += "\n";
				}
			} else {
				newFile += ctx.anbx_Type(i).ANBX_Identifier(0).getText();
				newFile += " : ";

				for (int j = 1; j < ctx.anbx_Type(i).getChildCount(); j++) {
					newFile += ctx.anbx_Type(i).getChild(j).getText();
				}
				newFile += "\n";
			}
		}
	}

	@Override
	public void enterAnbx_Definitions(ANBXParser.Anbx_DefinitionsContext ctx) {
		newFile += "Definitions:\n";
		for (int i = 0; i < ctx.anbx_Definition().size(); i++) {
			newFile += ctx.anbx_Definition(i).ANBX_Identifier().getText();
			newFile += "\n";
		}

	}

	@Override
	public void enterAnbx_Knowlegde(ANBXParser.Anbx_KnowlegdeContext ctx) {
		newFile += "Knowledge:\n";
		for (int i = 0; i < ctx.anbx_Know().size(); i++) {
			if (ctx.anbx_Know(i).ANBX_DELIMITER().size() >= 1) {
				if (ctx.anbx_Know(i).ANBX_DELIMITER(0).getText().equals(":")) {
					newFile += ctx.anbx_Know(i).ANBX_Identifier(0).getText();
					newFile += " " + ctx.anbx_Know(i).ANBX_DELIMITER(0).getText() + " ";
					newFile += ctx.anbx_Know(i).ANBX_KNOW(0);
					newFile += "\n";
				} else {
					newFile += "where ";
					newFile += ctx.anbx_Know(i).ANBX_KNOW_CONDITION(0).getText();
					for (int j = 1; j < ctx.anbx_Know(i).ANBX_KNOW_CONDITION().size(); j++) {
						newFile += "," + ctx.anbx_Know(i).ANBX_KNOW_CONDITION(j).getText();
					}
					newFile += "\n";
				}
			} else {
				for (int j = 0; j < ctx.anbx_Know(i).getChildCount(); j++) {
					if (ctx.anbx_Know(i).getChild(j).getText().equals("agree")
							|| ctx.anbx_Know(i).getChild(j).getText().equals("share")) {
						newFile += " " + ctx.anbx_Know(i).getChild(j).getText() + " ";
					} else {
						newFile += ctx.anbx_Know(i).getChild(j).getText();
					}
				}
				newFile += "\n";
			}
		}
	}

	@Override
	public void exitAnbx_Actions(ANBXParser.Anbx_ActionsContext ctx) {
		newFile += "Actions:\n";
		for (int i = 0; i < ctx.anbx_Action().size(); i++) {
			for (int j = 0; j < ctx.anbx_Action(i).getChildCount(); j++) {
				newFile += ctx.anbx_Action(i).getChild(j).getText();
			}
			newFile += "\n";
		}
	}

	@Override
	public void exitAnbx_Goals(ANBXParser.Anbx_GoalsContext ctx) {
		newFile += "Goals:\n";
		for (int i = 0; i < ctx.anbx_Goal().size(); i++) {
			for (int j = 0; j < ctx.anbx_Goal(i).getChildCount(); j++) {
				newFile += ctx.anbx_Goal(i).getChild(j).getText() + " ";
			}
			newFile += "\n";
		}
	}

}
