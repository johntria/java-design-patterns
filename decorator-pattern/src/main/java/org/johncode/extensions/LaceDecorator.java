package org.johncode.extensions;

import org.johncode.implementations.ShoeDecorator;
import org.johncode.interfaces.Shoe;

public class LaceDecorator extends ShoeDecorator {
	public LaceDecorator(Shoe shoe) {
		super(shoe);
	}
	@Override
	public String getDescription() {
		return shoe.getDescription() + " with laces";
	}
	@Override
	public double getPrice() {
		return shoe.getPrice() + 10.0;
	}
}