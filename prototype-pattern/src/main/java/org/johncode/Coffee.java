package org.johncode;

public class Coffee implements Cloneable {
	private String type;
	private int milk;
	private int sugar;

	public Coffee(String type, int milk, int sugar) {
		this.type = type;
		this.milk = milk;
		this.sugar = sugar;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setMilk(int milk) {
		this.milk = milk;
	}

	public void setSugar(int sugar) {
		this.sugar = sugar;
	}

	public String getType() {
		return type;
	}

	public int getMilk() {
		return milk;
	}

	public int getSugar() {
		return sugar;
	}

	@Override
	public Coffee clone() throws CloneNotSupportedException {
		return new Coffee(this.type, this.milk, this.sugar);
	}
}