package com.patterns.factorypattern;

public abstract class Plans {

	protected double rate;
	abstract void getRate();
	
	public void calculateBill(int units) {
		System.out.println(units*rate);
	}
}
