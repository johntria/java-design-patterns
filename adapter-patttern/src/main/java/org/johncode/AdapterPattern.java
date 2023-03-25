package org.johncode;

import org.johncode.implementations.NewPhoneCharger;
import org.johncode.implementations.OldPhoneCharger;
import org.johncode.implementations.PhoneChargerAdapter;
import org.johncode.interfaces.PhoneCharger;

public class AdapterPattern {
	public static void main(String[] args) {
		// Use the old phone charger
		PhoneCharger oldCharger = new OldPhoneCharger();
		oldCharger.charge("iPhone");

		// Use the new phone charger with an adapter
		NewPhoneCharger newCharger = new NewPhoneCharger();
		PhoneCharger adapter = new PhoneChargerAdapter(newCharger);
		adapter.charge("Samsung");
	}
}