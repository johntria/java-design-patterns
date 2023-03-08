package org.johncode.implementations;

import org.johncode.interfaces.LegoBlock;
import org.johncode.interfaces.LegoFactory;

public class BlueLegoFactory implements LegoFactory {
	public LegoBlock createBlock() {
		return new BlueLegoBlock();
	}
}