package com.patterns.factorypattern;

public class GenerateBillFactory {

	//Factory method to initialize the object of type plan.
	public Plans getPlan(String planType) {
		
		if(planType.equalsIgnoreCase("Domestic Plan")){
			return new DomesticPlan();
		}
		else if(planType.equalsIgnoreCase("International Plan")) {
			return new InstitutionalPlan();
		}
		
		return null;
	}
}
