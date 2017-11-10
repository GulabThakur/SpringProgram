package com.bridgeIt.model;

public class Employee {
	private String empName;
	
	public void setEmpName(String name) 
	{
		this.empName=name;
	}
	/**
	 * @return retrieve name 
	 */
	
	
	public void disp() 
	{
		System.out.println("Employee Name :"+empName);
	}
}
