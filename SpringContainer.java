package com.SpringBeanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringContainer {

	public static void main(String[] args) 
	{
		ApplicationContext   context4=new ClassPathXmlApplicationContext("congif.xml");
		
		Employee3 std=(Employee3)context4.getBean("employee2222");
		System.out.println(std.hashCode());
		
		
		Employee3 std1=(Employee3)context4.getBean("employee2222");
		System.out.println(std1.hashCode());

	}

}
