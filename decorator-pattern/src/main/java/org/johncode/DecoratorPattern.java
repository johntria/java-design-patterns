package org.johncode;

import org.johncode.extensions.ColorDecorator;
import org.johncode.extensions.LaceDecorator;
import org.johncode.extensions.ReinforceInsole;
import org.johncode.implementations.BasicShoe;
import org.johncode.interfaces.Shoe;

public class DecoratorPattern {
	public static void main(String[] args) {
		Shoe basicShoe = new BasicShoe();
		System.out.println(basicShoe.getDescription() + " Price: $" + basicShoe.getPrice());

		//Basic shoe which is red
		Shoe coloredShoe = new ColorDecorator(basicShoe, "red");
		System.out.println(coloredShoe.getDescription() + " Price: $" + coloredShoe.getPrice());

		//Basic shoe which is red and lace
		Shoe laceShoe = new LaceDecorator(coloredShoe);
		System.out.println(laceShoe.getDescription() + " Price: $" + laceShoe.getPrice());

		//Basic shoe which is red and lace and 30% reinforced at bottom
		Shoe reinforcedInsole=new ReinforceInsole(laceShoe,30);
		System.out.println(reinforcedInsole.getDescription() + " Price: $" + reinforcedInsole.getPrice());
	}
}