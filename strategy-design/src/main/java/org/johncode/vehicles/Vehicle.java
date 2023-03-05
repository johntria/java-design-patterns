package org.johncode.vehicles;

import org.johncode.interfaces.Flys;

public class Vehicle {
	private String name;
	private Double weight;
	private String country;
	public Flys flyingType;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String tryToFly(){
		return flyingType.fly();
	}

	public void setFlyingAbility(Flys flyingType){
		this.flyingType=flyingType;

	}
}