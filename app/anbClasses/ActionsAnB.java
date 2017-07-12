package anbClasses;

import java.util.LinkedList;
import java.util.List;

public class ActionsAnB {
	String sender = new String();
	String channel = new String();
	String reciver = new String();
	LinkedList<ActionAnB> actionChild;

	public ActionsAnB() {

	}

	public ActionsAnB(String sender, String channel, String reciver) {
		this.sender = sender;
		this.channel = channel;
		this.reciver = reciver;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getReciver() {
		return reciver;
	}

	public void setReciver(String reciver) {
		this.reciver = reciver;
	}

	public List<ActionAnB> getActionChild() {
		return actionChild;
	}

	public void setActionChild(LinkedList<ActionAnB> actionChild) {
		this.actionChild = actionChild;
	}

	public void addChild(ActionAnB newActionChild) {
		if (newActionChild == null)
			return;
		if (this.actionChild == null)
			this.actionChild = new LinkedList<>();
		this.actionChild.add(newActionChild);
	}

	@Override
	public String toString() {
		List<String> actions = new LinkedList<>();
		String content = "";
		try {			
			for (ActionAnB actionItem : actionChild) {
				actions.add(actionItem.content);
				content += actionItem.content;
			}
		} catch (Exception e) {
			System.out.println("error unhandled in Album: " + e);
		}
		return this.sender+" "+this.channel+" "+this.reciver+" : "+content;
	}
}
