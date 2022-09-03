package com.patterns.singletonpattern;

public class SingletonLogger {

	/*
	 * Eager Initialization, creating instance during load time
	 * 
	 * SingletonLogger singletonLoggerInstance=new SingletonLogger()
	 */
	
	/*
	 * Lazy Initialization, creating an object when ever needed.
	 */
	private static SingletonLogger singletonLoggerInstance=null;
	
	/* Private constructor to prevent from creating multiple instance */
	private SingletonLogger() {}
	
	
	public static synchronized SingletonLogger getinstance() {
		if(singletonLoggerInstance==null) {
			return new SingletonLogger();
		}
		
		return singletonLoggerInstance;
	}
	
	public void logStartMessage() {
		System.out.println("Logged message is start");
	}
	
	public void logEndMessage() {
		System.err.println("Logged message is end");
	}
}
