package org.johncode;

import org.johncode.factories.FactoryLego;
import org.johncode.interfaces.Lego;

public class FactoryPattern {
	public static void main(String[] args) {
		Lego car = FactoryLego.createLego("car");
		Lego house = FactoryLego.createLego("house");
		Lego spaceship = FactoryLego.createLego("spaceship");

		car.build();
		house.build();
		spaceship.build();

	}
}