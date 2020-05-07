package com.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringMain 
{
	public static void main(String[] args) 
	{
		MySingleton singleton = MySingleton.getMySingletonObject();
		
		System.out.println(singleton.hashCode()); 
		
		singleton = MySingleton.getMySingletonObject();
		
		System.out.println(singleton.hashCode()); 
		
		singleton = MySingleton.getMySingletonObject();
		
		System.out.println(singleton.hashCode()); 
		
		System.out.println("#################################"); 
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
//		HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
//		
//		System.out.println(helloWorld.getMessage());
		
		Employee emp = (Employee) context.getBean("employee1");
		
//		System.out.println(emp.getName();0
//		
//		System.out.println(emp.getTransportService().getTransportMode());
		
		System.out.println("Hashcode of employee: " + emp.hashCode()); 
		
		Employee emp2 = (Employee) context.getBean("employee2");
		
		System.out.println("Hashcode of employee: " + emp2.hashCode());
		
//		Driver driver = context.getBean(Driver.class);
//		
//		driver.drive();
//		
//		PropertyCache fileService = context.getBean(PropertyCache.class);
//		
//		fileService.propertiesValue();
	}
}
