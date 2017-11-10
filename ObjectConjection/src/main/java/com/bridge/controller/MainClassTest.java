package com.bridge.controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

import com.bridge.model.Tringle;

public class MainClassTest {
	public static void main(String[] args) {
		System.out.println("Program Started ");
		Resource resource=(Resource) new ClassPathXmlApplicationContext("Object.xml");
		BeanFactory feFactory=new XmlBeanFactory(resource);
		Tringle tr=(Tringle) feFactory.getBean("tringle");
		tr.display();
		System.out.println("Program Ended");
	}
}
