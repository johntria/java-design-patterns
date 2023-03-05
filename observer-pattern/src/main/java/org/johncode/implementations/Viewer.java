package org.johncode.implementations;

import org.johncode.interfaces.Observer;

public class Viewer implements Observer {
	private Creator subject;
	private String firstName;
	private String lastName;

	public Viewer(Creator subject, String firstName, String lastName) {
		this.subject = subject;
		subject.register(this);
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public void update() {
		String toBePrinted = String.format("Hello %s %s %s", firstName, lastName, subject.getVideoTitle());
		System.out.println(toBePrinted);
	}
}