package com.bridgeit.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bridgeit.config.Applicaionconfig;
import com.bridgeit.model.ColorClass;

public class MainClass {
		public static void main(String[] args) {
			System.out.println("Program Started ");
			ApplicationContext context=new AnnotationConfigApplicationContext(Applicaionconfig.class);
			ColorClass color=(ColorClass) context.getBean("mycolorBean");
			color.checkColor();
			System.out.println("Program Ended");
		}
}
