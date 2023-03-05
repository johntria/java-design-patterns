package org.johncode.vehicles;

import org.johncode.implementations.CantFly;

public class Bike extends Vehicle{

	public Bike() {
		super();
		flyingType= new CantFly();
	}


}