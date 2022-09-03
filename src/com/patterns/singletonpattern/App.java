package com.patterns.singletonpattern;

/**
 * 
 * Singleton Pattern prevents the instantiation of class more than once,
 * providing access to single object.
 *
 */
public class App {

	public static void main(String[] args) {
		
		SingletonLogger singletonLogger=SingletonLogger.getinstance();
		
		singletonLogger.logStartMessage();
		singletonLogger.logStartMessage();
	}
}
