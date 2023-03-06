package org.johncode.implementations;

import java.util.ArrayList;
import java.util.List;

import org.johncode.interfaces.Observer;
import org.johncode.interfaces.Subject;

public class Creator implements Subject {
	private List<Observer> observers = new ArrayList<>();
	private String videoTitle;

	public String getVideoTitle() {
		return videoTitle;
	}

	public void setVideoTitle(String videoTitle) {
		this.videoTitle = videoTitle;
		notifyObserver();
	}

	@Override
	public void register(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void unregister(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObserver() {
		for (Observer eachObserver : observers) {
			eachObserver.update();
		}
	}
}