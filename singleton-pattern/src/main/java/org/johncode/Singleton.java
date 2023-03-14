package org.johncode;

import java.util.Objects;

public class Singleton {
	private static Singleton instance = null;

	private Singleton() {}

	public static Singleton getInstance() {
		if (Objects.isNull(instance)) {
			instance = new Singleton();
		}
		return instance;
	}

}