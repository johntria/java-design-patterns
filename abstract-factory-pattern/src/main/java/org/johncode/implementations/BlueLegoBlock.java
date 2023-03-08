package org.johncode.implementations;

import org.johncode.interfaces.LegoBlock;

public class BlueLegoBlock implements LegoBlock {
	private String color = "blue";
	private String shape = "block";
	public void setColor(String color) {
		this.color = color;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getColor() {
		return color;
	}

	public String getShape() {
		return shape;
	}
}