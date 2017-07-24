package handlers;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import anbClasses.ActionAnB;
import anbClasses.ActionsAnB;
import anbClasses.KnowledgeAnB;
import anbClasses.TypesANB;
import baseClasses.ANBXBaseListener;
import baseClasses.ANBXParser;

public class AnBxwalker extends ANBXBaseListener {
	public String newFile = "";
	private STGroup groupStringTemplate = new STGroupFile("./stringTemplates/protocolAnB.stg");

	public AnBxwalker() {
		String newFile = "";
		STGroup groupStringTemplate = new STGroupFile("./stringTemplates/protocolAnB.stg");
	}

	@Override
	public void enterAnbx_ProtocolName(ANBXParser.Anbx_ProtocolNameContext ctx) {
		ST st = groupStringTemplate.getInstanceOf("title");
		// st.add("title", "Protocol Name Section");
		// newFile += st.render();

		for (int i = 0; i < ctx.ANBX_Identifier().size(); i++) {
			st = groupStringTemplate.getInstanceOf("protocolname");
			st.add("name", ctx.ANBX_Identifier(i).getText());
			newFile += st.render();
		}
	}

	@Override
	public void enterAnbx_Types(ANBXParser.Anbx_TypesContext ctx) {
		ST st = groupStringTemplate.getInstanceOf("title");
		st.add("title", "Types Section");
		newFile += st.render();

		for (int i = 0; i < ctx.anbx_Type().size(); i++) {
			if (ctx.anbx_Type(i).ANBX_CHANNEL() == null) {
				st = groupStringTemplate.getInstanceOf("types");
				if (ctx.anbx_Type(i).ANBX_Identifier().size() == 1) {
					String typeName = ctx.anbx_Type(i).ANBX_Identifier(0).getText();
					String typeChilds = "";
					for (int j = 0; j < ctx.anbx_Type(i).ANBX_KNOW().size(); j++) {
						typeChilds += ctx.anbx_Type(i).ANBX_KNOW(j).getText();
					}
					st.add("type", new TypesANB(typeName, typeChilds));
				} else {
					String typeName = ctx.anbx_Type(i).ANBX_Identifier(0).getText();
					String typeChilds = ctx.anbx_Type(i).ANBX_Identifier(1).getText();
					st.add("type", new TypesANB(typeName, typeChilds));
				}
				// section to be delevoped for ANBX case with channel involved
			} else {
				st = groupStringTemplate.getInstanceOf("types");
				String typeName = ctx.anbx_Type(i).ANBX_Identifier(0).getText();
				String typeChilds = "";

				// newFile += ctx.anbx_Type(i).ANBX_Identifier(0).getText();
				// newFile += " : ";

				for (int j = 1; j < ctx.anbx_Type(i).getChildCount(); j++) {
					typeChilds += ctx.anbx_Type(i).getChild(j).getText();
				}
				st.add("type", new TypesANB(typeName, typeChilds));

				// newFile += "\n";
			}
			newFile += st.render();
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
		ST st = groupStringTemplate.getInstanceOf("title");
		st.add("title", "knowledge");
		newFile += st.render();

		for (int i = 0; i < ctx.anbx_Know().size(); i++) {
			if (ctx.anbx_Know(i).ANBX_DELIMITER().size() >= 1) {
				st = groupStringTemplate.getInstanceOf("knowlegde");
				st.add("knowledge", new KnowledgeAnB(ctx.anbx_Know(i).getText()));
				newFile += st.render();

				// if (ctx.anbx_Know(i).ANBX_DELIMITER(0).getText().equals(":"))
				// {
				// newFile += ctx.anbx_Know(i).ANBX_Identifier(0).getText();
				// newFile += " " + ctx.anbx_Know(i).ANBX_DELIMITER(0).getText()
				// + " ";
				// newFile += ctx.anbx_Know(i).ANBX_KNOW(0);
				// newFile += "\n";
				// } else {
				// newFile += "where ";
				// newFile += ctx.anbx_Know(i).ANBX_KNOW_CONDITION(0).getText();
				// for (int j = 1; j <
				// ctx.anbx_Know(i).ANBX_KNOW_CONDITION().size(); j++) {
				// newFile += "," +
				// ctx.anbx_Know(i).ANBX_KNOW_CONDITION(j).getText();
				// }
				// newFile += "\n";
				// }
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
	public void enterAnbx_Actions(ANBXParser.Anbx_ActionsContext ctx) {
		ST st = groupStringTemplate.getInstanceOf("titleactions");
		st.add("title", "title");
		newFile += st.render();

		// System.out.println(ctx.anbx_Action().size());
		// System.out.println(ctx.anbx_Action(4).ANBX_DELIMITER().size());

		for (int i = 0; i < ctx.anbx_Action().size(); i++) {
			if (ctx.anbx_Action(i).ANBX_DELIMITER().size() > 1) {

			} else {
				ActionsAnB actionline = new ActionsAnB(ctx.anbx_Action(i).ANBX_Identifier(0).getText(),
						ctx.anbx_Action(i).ANBX_CHANNEL().getText(), ctx.anbx_Action(i).ANBX_Identifier(1).getText());
				for (int j = 0; j < ctx.anbx_Action(i).anbx_SubAction(0).getChildCount(); j++) {
					if (ctx.anbx_Action(i).anbx_SubAction(0).getChild(j).getChildCount() > 0) {
						for (int k = 0; k < ctx.anbx_Action(i).anbx_SubAction(0).getChild(j).getChildCount(); k++) {
							if (ctx.anbx_Action(i).anbx_SubAction(0).getChild(j).getChild(k).getChildCount() > 0) {
								for (int l = 0; l < ctx.anbx_Action(i).anbx_SubAction(0).getChild(j).getChild(k)
										.getChildCount(); l++) {
									actionline.addChild(new ActionAnB(ctx.anbx_Action(i).anbx_SubAction(0).getChild(j)
											.getChild(k).getChild(l).getText()));
								}
							} else {
								actionline.addChild(new ActionAnB(
										ctx.anbx_Action(i).anbx_SubAction(0).getChild(j).getChild(k).getText()));
							}
						}
					} else {
						actionline.addChild(new ActionAnB(ctx.anbx_Action(i).anbx_SubAction(0).getChild(j).getText()));
					}
				}
				st = groupStringTemplate.getInstanceOf("actions");
				st.add("action", actionline);
				st.add("number", i + 1);
				st.add("lastaction", (i == ctx.anbx_Action().size()-1 ? false : i + 2 ));
				newFile += st.render();
			}
		}

		// for (int i = 0; i < ctx.anbx_Action().size(); i++) {
		// for (int j = 0; j < ctx.anbx_Action(i).getChildCount(); j++) {
		// newFile += ctx.anbx_Action(i).getChild(j).getText();
		// }
		// newFile += "\n";
		// }
	}
}
