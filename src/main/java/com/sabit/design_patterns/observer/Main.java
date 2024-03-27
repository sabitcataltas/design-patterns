package com.sabit.design_patterns.observer;

public class Main  {

	public static void main(String[] args) {
		
		EventManager em = new EventManager();
		
		Observer logListener = new LoggingListener();
		Observer emailListener = new EMailListener();
		
		em.subscribe(logListener);
		em.subscribe(emailListener);
		
		em.sendMessage("Message Text");
		
		em.unsubscribe(emailListener);
		
		em.sendMessage("Message Text 2");
	}
	
}
