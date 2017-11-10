package com.bridgeIt.controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.bridgeIt.model.Simple;

@SuppressWarnings({ "deprecation" })
public class TestClass {
		public static void main(String[] args) {
			System.out.println("Program Started");
			Resource resource=new ClassPathResource("Application2.xml");
			BeanFactory factory=new XmlBeanFactory(resource);
			Simple s1=(Simple) factory.getBean("simple");
			s1.run();
			System.out.println("Program Ended");
		}
}
