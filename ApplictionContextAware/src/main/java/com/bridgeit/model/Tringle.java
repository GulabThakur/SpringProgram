package com.bridgeit.model;

import java.beans.beancontext.BeanContext;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

@SuppressWarnings("unused")
public class Tringle  implements ApplicationContextAware ,BeanNameAware{
	private Points pointA;
	private Points pointB;
	private Points pointC;

	ApplicationContext context=null;
	

	public void setPointA(Points pointA) {
		this.pointA = pointA;
	}
	
	public void setPointB(Points pointB) {
		this.pointB = pointB;
	}
	
	public void setPointC(Points pointC) {
		this.pointC = pointC;
	}
	
	/**
	 * @ to display out
	 */
	public void dispaly() 
	{
		System.out.println("PointA is :("+pointA.getX()+","+pointA.getY()+")");
		System.out.println("PointB is :("+pointB.getX()+","+pointB.getY()+")");
		System.out.println("PointC is :("+pointC.getX()+","+pointC.getY()+")");
	}
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context=context;
	}
	@Override
	public void setBeanName(String beanName) {
		System.out.println("Beans Name is :"+beanName);
	}

}
