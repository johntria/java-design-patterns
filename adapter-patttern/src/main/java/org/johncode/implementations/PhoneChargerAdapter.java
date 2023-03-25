package org.johncode.implementations;

import org.johncode.interfaces.PhoneCharger;

public class PhoneChargerAdapter implements PhoneCharger {
	private NewPhoneCharger newCharger;

	public PhoneChargerAdapter(NewPhoneCharger newCharger) {
		this.newCharger = newCharger;
	}

	public void charge(String phoneType) {
		newCharger.plugIn(phoneType);
	}
}