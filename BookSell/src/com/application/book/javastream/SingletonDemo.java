package com.application.book.javastream;

public class SingletonDemo {

	private static SingletonDemo instance;
	private SingletonDemo() {
		//private constructor
	}
	
	public static SingletonDemo getInstance() {
		
		if(instance==null) {
			synchronized (instance) {
				instance = new SingletonDemo();
			}
			
		}
		
		return instance;
		
	}
}
