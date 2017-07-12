package anbClasses;

import java.util.LinkedList;
import java.util.List;

public class GoalsAnB {
	public List<GoalAnB> goalChild;

	public GoalsAnB() {
	}

	public GoalsAnB(String childs) {
		String mainChilds[] = childs.split("\\s+");
		for (int i = 0; i < mainChilds.length; i++) {
			this.addChild(new GoalAnB(mainChilds[i]));
		}

	}

	public void addChild(GoalAnB newGoalChild) {
		if (newGoalChild == null)
			return;
		if (this.goalChild == null)
			this.goalChild = new LinkedList<>();
		this.goalChild.add(newGoalChild);
	}

	@Override
	public String toString() {
		List<String> goals = new LinkedList<>();
		try {
			Iterable<GoalAnB> iterable = goalChild;
			for (GoalAnB goalItem : iterable) {
				goals.add(goalItem.information);
			}
		} catch (Exception e) {
			System.out.println("error unhandled in Album: " + e);
		}
		return String.join(" ", goals);
	}

}
