package org.johncode.factories;

import org.johncode.implementations.Car;
import org.johncode.implementations.House;
import org.johncode.implementations.Spaceship;
import org.johncode.interfaces.Lego;

public class FactoryLego{
	public static Lego createLego(String type) {
		switch (type) {
			case "car":
				return new Car();
			case "house":
				return new House();
			case "spaceship":
				return new Spaceship();
			default:
				throw new IllegalArgumentException("Invalid Lego type: " + type);
		}
	}
}