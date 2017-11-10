package com.bridgeIt.controller;

import javax.persistence.Entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgeIt.model.Employee;
@Entity
public class Test2 {
	public static void main(String[] args) {

		System.out.println("Program Started ");
		ApplicationContext context=new ClassPathXmlApplicationContext("Application2.xml");
		Employee emp=(Employee) context.getBean("employee");
		emp.setEmpName("deepak");
		emp.disp();
		System.out.println("Program Ended");
	}
}
