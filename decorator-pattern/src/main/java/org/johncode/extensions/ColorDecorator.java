package org.johncode.extensions;

import org.johncode.implementations.ShoeDecorator;
import org.johncode.interfaces.Shoe;

public class ColorDecorator extends ShoeDecorator {
	private String color;
	public ColorDecorator(Shoe shoe, String color) {
		super(shoe);
		this.color = color;
	}
	@Override
	public String getDescription() {
		return shoe.getDescription() + " in " + color;
	}
	@Override
	public double getPrice() {
		return shoe.getPrice() + 20.0;
	}
}