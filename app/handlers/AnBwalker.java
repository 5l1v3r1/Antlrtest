package handlers;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupDir;
import org.stringtemplate.v4.STGroupFile;

import anbClasses.ActionAnB;
import anbClasses.ActionsAnB;
import anbClasses.GoalAnB;
import anbClasses.GoalsAnB;
import anbClasses.KnowledgeAnB;
import anbClasses.TypesANB;
import parsersLexers.ANBBaseListener;
import parsersLexers.ANBParser;

public class AnBwalker extends ANBBaseListener {

	public String newFile = "";
	private STGroup groupStringTemplate = new STGroupFile("./stringTemplates/protocolAnB.stg");

	public AnBwalker() {
		String newFile = "";
		STGroup groupStringTemplate = new STGroupFile("./stringTemplates/protocolAnB.stg");
	}

	@Override
	public void enterAnb_ProtocolName(ANBParser.Anb_ProtocolNameContext ctx) {
		ST st = groupStringTemplate.getInstanceOf("title");
		st.add("title", "Protocol Name Section");
		newFile += st.render();
		st = groupStringTemplate.getInstanceOf("protocolname");		
		st.add("name", ctx.ANB_Identifier().getText());
		newFile += st.render();
	}

	@Override
	public void enterAnb_Types(ANBParser.Anb_TypesContext ctx) {
		ST st = groupStringTemplate.getInstanceOf("title");
		st.add("title", "Types Section");
		newFile += st.render();

		for (int i = 0; i < ctx.anb_Type().size(); i++) {
			st = groupStringTemplate.getInstanceOf("types");
			if (ctx.anb_Type(i).ANB_Identifier().size() == 1) {
				String typeName = ctx.anb_Type(i).ANB_Identifier(0).getText();
				String typeChilds = ctx.anb_Type(i).ANB_KNOW().getText();
				st.add("type", new TypesANB(typeName, typeChilds));
			} else {
				String typeName = ctx.anb_Type(i).ANB_Identifier(0).getText();
				String typeChilds = ctx.anb_Type(i).ANB_Identifier(1).getText();
				st.add("type", new TypesANB(typeName, typeChilds));
			}
			newFile += st.render();
		}
	}

	@Override
	public void enterAnb_Knowlegde(ANBParser.Anb_KnowlegdeContext ctx) {
		ST st = groupStringTemplate.getInstanceOf("title");
		st.add("title", "Knowledge Section");
		newFile += st.render();
		for (int i = 0; i < ctx.anb_know().size(); i++) {
			st = groupStringTemplate.getInstanceOf("knowlegde");
			st.add("knowledge", new KnowledgeAnB(ctx.anb_know(i).getText()));
			newFile += st.render();
		}
	}

	@Override
	public void enterAnb_Actions(ANBParser.Anb_ActionsContext ctx) {
		ST st = groupStringTemplate.getInstanceOf("title");
		st.add("title", "Actions Section");
		newFile += st.render();
		for (int i = 0; i < ctx.anb_Action().size(); i++) {
			ActionsAnB actionline = new ActionsAnB(ctx.anb_Action(i).ANB_Identifier(0).getText(),
					ctx.anb_Action(i).ANB_CHANNEL().getText(), ctx.anb_Action(i).ANB_Identifier(1).getText());
			for (int j = 0; j < ctx.anb_Action(i).anb_SubAction(0).getChildCount(); j++) {
				if (ctx.anb_Action(i).anb_SubAction(0).getChild(j).getChildCount() > 0) {
					for (int k = 0; k < ctx.anb_Action(i).anb_SubAction(0).getChild(j).getChildCount(); k++) {
						if (ctx.anb_Action(i).anb_SubAction(0).getChild(j).getChild(k).getChildCount() > 0) {
							for (int l = 0; l < ctx.anb_Action(i).anb_SubAction(0).getChild(j).getChild(k)
									.getChildCount(); l++) {
								actionline.addChild(new ActionAnB(ctx.anb_Action(i).anb_SubAction(0).getChild(j)
										.getChild(k).getChild(l).getText()));
							}
						} else {
							actionline.addChild(new ActionAnB(ctx.anb_Action(i).anb_SubAction(0).getChild(j).getChild(k).getText()));
						}
					}
				} else {
					actionline.addChild(new ActionAnB(ctx.anb_Action(i).anb_SubAction(0).getChild(j).getText()));
				}
			}
			st = groupStringTemplate.getInstanceOf("actions");
			st.add("action", actionline);
			newFile += st.render();
		}
	}

	@Override
	public void enterAnb_Goals(ANBParser.Anb_GoalsContext ctx) {
		ST st = groupStringTemplate.getInstanceOf("title");
		st.add("title", "Goals Section");
		newFile += st.render();
		for (int i = 0; i < ctx.anb_Goal().size(); i++) {
			st = groupStringTemplate.getInstanceOf("goals");
			String goalsChilds = "";
			for (int j = 0; j < ctx.anb_Goal(i).getChildCount(); j++) {
				goalsChilds += ctx.anb_Goal(i).getChild(j).getText() + " ";
			}
			GoalsAnB goalline = new GoalsAnB(goalsChilds);
			st.add("goal", new GoalsAnB(goalsChilds));
			newFile += st.render();
		}
	}
}
