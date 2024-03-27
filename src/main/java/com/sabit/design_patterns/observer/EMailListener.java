package com.sabit.design_patterns.observer;

public class EMailListener implements Observer {

	private String email;

	@Override
	public void update(String value) {
		
		this.email = value;
		System.out.println("E-Mail sent: " + value);

	}

}
