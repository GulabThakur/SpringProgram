package com.bridge.model;

@SuppressWarnings("unused")
public class Tringle {
	
	private Points pointA;
	private Points pointB;
	private Points pointC;
	public void setPointA(Points pointA) 
	{
		this.pointA=pointA;
	}
	public void setPointB(Points pointB) 
	{
		this.pointB=pointB;
	}
	public void setPointC(Points pointC) 
	{
		this.pointC=pointC;
	}
	public Points getPointA() 
	{
		return pointA;
	}
	public Points getPointB() 
	{
		return pointB;
	}
	public Points getPointC() 
	{
		return pointC;
	}
	public void display() 
	{
	System.out.println("Triangle [Point A: ["+pointA.getX()+","+pointA.getY()+"] Point B:["+pointB.getX()+","+pointB.getY()+"] Point C:["+pointC.getX()+","+pointC.getY()+"]");
	}
}
