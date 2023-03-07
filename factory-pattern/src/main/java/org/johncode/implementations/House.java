package org.johncode.implementations;

import org.johncode.interfaces.Lego;

public class House implements Lego {
	@Override
	public void build() {
		System.out.println("Building a House with Legos");
	}

}