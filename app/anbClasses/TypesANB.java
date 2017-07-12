package anbClasses;

import java.util.LinkedList;
import java.util.List;

public class TypesANB {
	String name = new String();
	public java.util.Collection<TypeAnB> typeChild;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public java.util.Collection<TypeAnB> getTypeChild() {
		return typeChild;
	}

	public void setTypeChild(java.util.Collection<TypeAnB> typeChild) {
		this.typeChild = typeChild;
	}

	public TypesANB(String name, String childs) {
		this.name = name;

		String mainChilds[] = childs.split(",");

		for (int i = 0; i < mainChilds.length; i++) {
			this.addChild(new TypeAnB(mainChilds[i]));
		}

	}

	public java.util.Iterator getIteratorTrack() {
		if (typeChild == null)
			typeChild = new java.util.HashSet<TypeAnB>();
		return typeChild.iterator();
	}

	public java.util.Collection<TypeAnB> getTrack() {
		if (typeChild == null)
			typeChild = new java.util.HashSet<TypeAnB>();
		return typeChild;
	}

	public void addChild(TypeAnB newtypeChild) {
		if (newtypeChild == null)
			return;
		if (this.typeChild == null)
			this.typeChild = new java.util.HashSet<TypeAnB>();
		if (!this.typeChild.contains(newtypeChild))
			this.typeChild.add(newtypeChild);
	}

	@Override
	public String toString() {
		List<String> types = new LinkedList<>();

		try {
			Iterable<TypeAnB> iterable = typeChild;
			for (TypeAnB typeItem : iterable) {
				types.add(typeItem.name);
			}
		} catch (Exception e) {
			System.out.println("error unhandled in Album: " + e);
		}

		return this.getName() + " : " + String.join(",", types);
	}

}
