package model;

public class Spring implements Employee{
	SimpleClass address;
	public Spring() {
		this.address=new SimpleClass();
	}
	@Override
	public void emp() {
		System.out.println("Welcome Employee");
	}
}
