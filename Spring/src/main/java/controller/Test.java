package controller;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import model.Spring;

public class Test {
		public static void main(String[] args) {
			System.out.println("Program Started");
			Resource resource=new ClassPathResource("Application.xml");
			BeanFactory factory=new XmlBeanFactory(resource);
			Spring s1=(Spring) factory.getBean("em");
			s1.emp();
			System.out.println("Program Ended");
		}
}
