package org.johncode.extensions;

import org.johncode.implementations.ShoeDecorator;
import org.johncode.interfaces.Shoe;

public class ReinforceInsole extends ShoeDecorator {
	Integer percentage;

	public ReinforceInsole(Shoe shoe, Integer percentage) {
		super(shoe);
		this.percentage = percentage;
	}

	@Override
	public String getDescription() {
		return shoe.getDescription() + " with " + percentage + "% reinforced insole";
	}

	@Override
	public double getPrice() {
		return shoe.getPrice() + 50.0;
	}
}