package com.sabit.design_patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class EventManager implements Observable {

	private List<Observer> observers = new ArrayList<>();
	private String message;
	
	public void sendMessage(String message) {
		this.message = message;
		notifyObservers();
	}
	
	@Override
	public void subscribe(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void unsubscribe(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		observers.stream().forEach(o -> o.update(this.message));
	}

}
