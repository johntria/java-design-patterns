package org.johncode.implementations;

import org.johncode.receivers.Light;
import org.johncode.interfaces.Command;

public class LightOffCommand implements Command {
	private Light light;

	public LightOffCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.turnOff();
	}
}