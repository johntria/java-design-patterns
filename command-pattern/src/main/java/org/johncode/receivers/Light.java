package org.johncode.receivers;

public class Light {
	private boolean isOn;

	public Light() {
		isOn = false;
	}

	public void turnOn() {
		isOn = true;
		System.out.println("The light is on");
	}

	public void turnOff() {
		isOn = false;
		System.out.println("The light is off");
	}

	public boolean isOn() {
		return isOn;
	}
}