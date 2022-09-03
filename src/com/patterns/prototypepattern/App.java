package com.patterns.prototypepattern;
/**
 * 
 * Creating a new objects using clone instead new,
 * In Prototype Pattern, objects can be created 
 * using Shallow cloning or deep cloning
 *
 */
public class App {

	public static void main(String[] args) {
		EmployeeRecord employee=new EmployeeRecord(101, "Mathan", "java");
		
		
		System.out.println(employee);
		System.out.println(employee.hashCode());
		System.out.println(employee.getEmployeeID());
		System.out.println(employee.getEmployeeName());
		System.out.println(employee.getEmployeeTechnology());
		
		EmployeeRecord anotherEmployee=employee.getClone();
		System.out.println(anotherEmployee);
		System.out.println(anotherEmployee.hashCode());
		System.out.println(anotherEmployee.getEmployeeID());
		System.out.println(anotherEmployee.getEmployeeName());
		System.out.println(anotherEmployee.getEmployeeTechnology());
	}
}
