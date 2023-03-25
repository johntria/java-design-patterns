package org.johncode.implementations;

import org.johncode.interfaces.PhoneCharger;

public class OldPhoneCharger implements PhoneCharger {
	public void charge(String phoneType) {
		System.out.println("Charging " + phoneType + " with old charger...");
	}
}