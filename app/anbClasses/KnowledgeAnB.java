package anbClasses;

import java.util.LinkedList;
import java.util.List;

public class KnowledgeAnB {
	String agent = new String();
	KnowAnB knowAnB = new KnowAnB();
	
	public String getAgent() {
		return agent;
	}

	public void setAgent(String agent) {
		this.agent = agent;
	}

	public KnowAnB getKnowAnB() {
		return knowAnB;
	}

	public void setKnowAnB(KnowAnB knowAnB) {
		this.knowAnB = knowAnB;
	}
	
	public KnowledgeAnB(String knowledge) {
		String content[] = knowledge.split("where");
		String agents[] = content[0].split(":");
		if(agents[0].isEmpty())
		{
			this.agent = "where";
			knowAnB = new KnowAnB(content[1].toString());
		}
		else{
			this.agent = agents[0];		
			knowAnB = new KnowAnB(agents[1]);
		}		
	}

	@Override
	public String toString() {

		return this.getAgent() + " : " + knowAnB.toString();
	}

}
