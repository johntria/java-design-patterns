package org.johncode.vehicles;

import org.johncode.implementations.ItFlys;

public class Airplane extends Vehicle {

	public Airplane() {
		super();
		flyingType=new ItFlys();
	}
}