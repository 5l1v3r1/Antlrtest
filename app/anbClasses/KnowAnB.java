package anbClasses;

public class KnowAnB {
	String content = new String();

	public KnowAnB(String know) {
		this.content = know;
	}
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public KnowAnB() {
	}
	
	@Override
	public String toString() {
		return this.getContent();
	}

	

}
