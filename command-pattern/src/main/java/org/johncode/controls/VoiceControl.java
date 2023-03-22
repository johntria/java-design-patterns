package org.johncode.controls;

import org.johncode.interfaces.Command;

public class VoiceControl {
	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}

	public void buttonPressed() {
		command.execute();
	}
}