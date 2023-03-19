package org.johncode.implementations;

import org.johncode.interfaces.Shoe;

public abstract class ShoeDecorator implements Shoe {
	protected Shoe shoe;
	public ShoeDecorator(Shoe shoe) {
		this.shoe = shoe;
	}
	@Override
	public String getDescription() {
		return shoe.getDescription();
	}
	@Override
	public double getPrice() {
		return shoe.getPrice();
	}
}