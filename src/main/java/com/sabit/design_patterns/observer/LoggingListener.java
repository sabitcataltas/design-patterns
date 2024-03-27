package com.sabit.design_patterns.observer;

public class LoggingListener implements Observer {

	private String log;

	@Override
	public void update(String value) {

		this.log = value;
		System.out.println("Logged: " + value);

	}

}
