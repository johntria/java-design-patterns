package org.johncode.implementations;

import org.johncode.interfaces.Lego;

public class Car implements Lego {
	@Override
	public void build() {
		System.out.println("Building a Car with Legos");
	}
}