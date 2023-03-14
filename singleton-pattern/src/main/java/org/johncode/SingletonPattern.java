package org.johncode;

public class SingletonPattern {
	public static void main(String[] args) {
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println("Instance 1 hash code: " + instance1.hashCode());
		System.out.println("Instance 2 hash code: " + instance2.hashCode());
	}
}