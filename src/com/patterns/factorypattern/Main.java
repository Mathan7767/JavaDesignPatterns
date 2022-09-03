package com.patterns.factorypattern;

/**
 * 
 * 	Factory Pattern can be achieved by creating object for Interface/abstract class
 * 	and allowing the subclass to decide which class to instantiate
 *
 * 	In Factory Pattern, appropriate decisions needs to be taken during the 
 * 	analysis part 
 */

public class Main {
	public static void main(String[] args) throws NullPointerException {
		
		String planName="Domestic Plan";
		int units=5;
		GenerateBillFactory planFactory=new GenerateBillFactory();
		Plans plans=planFactory.getPlan(planName);
		
		try {
			plans.getRate();
			plans.calculateBill(units);
		}	
		catch(NullPointerException e) {
			System.out.println("No Plans Found");
		}
	}
}
