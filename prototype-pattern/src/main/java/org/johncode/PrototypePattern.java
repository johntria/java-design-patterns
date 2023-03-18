package org.johncode;

public class PrototypePattern {
	public static void main(String[] args)   throws CloneNotSupportedException {
		Coffee originalCoffee = new Coffee("Espresso", 0, 0);

		Coffee coffee1 = originalCoffee.clone();
		coffee1.setMilk(1);
		coffee1.setSugar(0);

		Coffee coffee2 = originalCoffee.clone();
		coffee2.setType("Cappuccino");
		coffee2.setMilk(3);
		coffee2.setSugar(2);

		System.out.println("Original coffee: " + originalCoffee.getType() + " with " + originalCoffee.getMilk() + " milk and " + originalCoffee.getSugar() + " sugar");
		System.out.println("Coffee 1: " + coffee1.getType() + " with " + coffee1.getMilk() + " milk and " + coffee1.getSugar() + " sugar");
		System.out.println("Coffee 2: " + coffee2.getType() + " with " + coffee2.getMilk() + " milk and " + coffee2.getSugar() + " sugar");
		System.out.println("Hash code of Original coffee:"+ originalCoffee.hashCode());
		System.out.println("Hash code of Coffee 1: " + coffee1.hashCode());
		System.out.println("Hash code of Coffee 2: " + coffee2.hashCode());
	}
}