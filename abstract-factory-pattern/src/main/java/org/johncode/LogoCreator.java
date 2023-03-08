package org.johncode;

import org.johncode.implementations.BlueLegoFactory;
import org.johncode.implementations.RedLegoFactory;
import org.johncode.interfaces.LegoBlock;
import org.johncode.interfaces.LegoFactory;

public class LogoCreator {
	public static void main(String[] args) {
		LegoFactory redLegoFactory = new RedLegoFactory();
		LegoBlock redBlock = redLegoFactory.createBlock();
		System.out.println("Red Lego Block - Color: " + redBlock.getColor() + ", Shape: " + redBlock.getShape());

		LegoFactory blueLegoFactory = new BlueLegoFactory();
		LegoBlock blueBlock = blueLegoFactory.createBlock();
		System.out.println("Blue Lego Block - Color: " + blueBlock.getColor() + ", Shape: " + blueBlock.getShape());
	}
}