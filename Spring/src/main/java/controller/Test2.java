package controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
			public static void main(String[] args) {
				System.out.println("Program Started");
				ApplicationContext context =new ClassPathXmlApplicationContext("Application.xml");
				System.out.println("Program Ended");
			}
}
