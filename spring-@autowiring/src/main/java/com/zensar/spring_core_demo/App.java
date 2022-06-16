package com.zensar.spring_core_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.beans.Address;
import com.zensar.beans.Employee;
import com.zensar.beans.Product;
import com.zensar.beans.Student;


/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Content.xml");
		Student student =context.getBean("s1", Student.class);
		
		//Address address=context.getBean("address",Address.class);
		System.out.println(student);
		//System.out.println(address);
	}
}
