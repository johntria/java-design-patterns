package org.johncode.implementations;

import org.johncode.receivers.Light;
import org.johncode.interfaces.Command;

public class LightOnCommand implements Command {
	Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}
	@Override
	public void execute() {
		light.turnOn();
	}
}