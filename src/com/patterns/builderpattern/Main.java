package com.patterns.builderpattern;

/**
 * Builder pattern is used in dealing with complex objects or constructors
 * that requires a lot of parameters.
*/


public class Main {
	public static void main(String[] args) {
		User mathanS = new User.UserBuilder("Mathan", "s")
				.setUserAge(21)
				.setUserAddress("Fake Address")
				.setUserNumber("62348766543")
				.build();
		
		System.out.println("User 1 Details:"+mathanS);
				
	}
}
