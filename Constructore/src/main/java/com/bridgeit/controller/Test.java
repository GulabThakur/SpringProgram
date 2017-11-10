package com.bridgeit.controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.bridgeit.model.Employee;

/**
 * @author GulabThakur 
 * this method we are used pass value with help of xml into constractore
 *
 */
@SuppressWarnings("deprecation")
public class Test {
		/**
		 * @param
		 */
		
		public static void main(String[] args) {
			System.out.println("Program Started");
			Resource resource=new ClassPathResource("Application3.xml");
			BeanFactory factory=new XmlBeanFactory(resource);
			Employee emp=(Employee) factory.getBean("cons");
			emp.setId(1245);
			emp.setName("Deepak");
			emp.display();
			System.out.println("Program Ended");
		}
}
