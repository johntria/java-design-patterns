package org.johncode.implementations;

import org.johncode.interfaces.Shoe;

public class BasicShoe implements Shoe {
	@Override
	public String getDescription() {
		return "Basic shoe";
	}
	@Override
	public double getPrice() {
		return 50.0;
	}
}