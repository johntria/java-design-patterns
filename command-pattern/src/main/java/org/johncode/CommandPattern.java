package org.johncode;

import org.johncode.controls.VoiceControl;
import org.johncode.implementations.LightOffCommand;
import org.johncode.implementations.LightOnCommand;
import org.johncode.interfaces.Command;
import org.johncode.receivers.Light;

public class CommandPattern {
	public static void main(String[] args) {
		// Create the receiver object
		Light light = new Light();

		// Create the command objects
		Command lightOn = new LightOnCommand(light);
		Command lightOff = new LightOffCommand(light);

		// Create the invoker object
		VoiceControl voiceControl = new VoiceControl();

		// Set the commands to be executed by the invoker
		voiceControl.setCommand(lightOn);
		voiceControl.buttonPressed(); // Turns the light on

		voiceControl.setCommand(lightOff);
		voiceControl.buttonPressed(); // Turns the light off
	}
}