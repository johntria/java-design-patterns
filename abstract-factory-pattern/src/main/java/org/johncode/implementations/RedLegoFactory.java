package org.johncode.implementations;

import org.johncode.interfaces.LegoBlock;
import org.johncode.interfaces.LegoFactory;

public class RedLegoFactory implements LegoFactory {
	@Override
	public LegoBlock createBlock() {
		return new RedLegoBlock();
	}
}