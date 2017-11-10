package com.bridgeit.model;

/**
 * @author Gulab Thakur 
 * @  this Class this my model class
 *
 */
public class Employee {
	    private String empName;
		private int empId;
		/**
		 * @param name
		 * @param id
		 * @ this constructore
		 */
		public Employee(String name,int id) {
			this.empName=name;
			this.empId=id;
		}
		public void setName(String name) 
		{
			this.empName=name;
		}
		public void setId(int id) 
		{
			this.empId=id;
		}
	 /**
	 * this using for dispaly all value
	 */
	public void display() 
	 {
		System.out.println("Employee [Employee name: "+empName+" Employee ID "+empId+"]");
	 }
}
