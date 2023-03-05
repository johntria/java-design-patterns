package org.johncode;

import org.johncode.implementations.CantFly;
import org.johncode.vehicles.Airplane;
import org.johncode.vehicles.Bike;
import org.johncode.vehicles.Vehicle;

public class StrategyDesign {
	public static void main(String[] args) {
		Vehicle airplane = new Airplane();
		Vehicle bike = new Bike();

		System.out.println("Hey airplane can you fly?  " + airplane.tryToFly());
		System.out.println("Hey bike can you fly?" + bike.tryToFly());

		//After a technical problem occurred on the plane,
		// unfortunately it cannot fly
		airplane.setFlyingAbility(new CantFly());

		System.out.println("Hey ✈️ can you fly now ?  " + airplane.tryToFly());

	}
}