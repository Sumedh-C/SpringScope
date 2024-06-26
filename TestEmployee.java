package com.SpringBeanScope;

public class TestEmployee {

	public static void main(String[] args) 
	{
		Employee3 employee1 = new Employee3();
		System.out.println(employee1.hashCode());
		
		Employee3 employee2 = new Employee3();
		System.out.println(employee2.hashCode());
		
		Employee3 employee3 = new Employee3();
		System.out.println(employee3.hashCode());



	}

}
