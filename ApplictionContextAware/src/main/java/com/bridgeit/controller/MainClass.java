package com.bridgeit.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgeit.model.Tringle;

public class MainClass {
		public static void main(String[] args) {
			System.out.println("Program Started");
			ApplicationContext context=new ClassPathXmlApplicationContext("application.xml");
			Tringle trl=(Tringle) context.getBean("triangle");
			trl.dispaly();
			System.out.println("Program Ended");
		}
}
