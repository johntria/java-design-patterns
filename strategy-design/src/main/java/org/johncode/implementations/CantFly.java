package org.johncode.implementations;

import org.johncode.interfaces.Flys;

public class CantFly implements Flys {
	@Override
	public String fly() {
		return "I cannot fly !!";
	}
}