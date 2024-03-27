package com.sabit.design_patterns.observer;

public interface Observable {

	void subscribe(Observer observer);

	void unsubscribe(Observer observer);

	void notifyObservers();
	
}
