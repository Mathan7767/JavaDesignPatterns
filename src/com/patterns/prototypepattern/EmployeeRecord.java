package com.patterns.prototypepattern;

public class EmployeeRecord implements Cloneable{
	
	private int employeeID;
	private String employeeName;
	private String employeeTechnology;
	
	
	public EmployeeRecord(int employeeID, String employeeName, String employeeTechnology) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.employeeTechnology = employeeTechnology;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeTechnology() {
		return employeeTechnology;
	}
	public void setEmployeeTechnology(String employeeTechnology) {
		this.employeeTechnology = employeeTechnology;
	}
	
	public EmployeeRecord getClone() {
		try {
			return (EmployeeRecord) super.clone();
		}
		catch(CloneNotSupportedException e) {
			e.getStackTrace();
			return null;
		}
	}

}
