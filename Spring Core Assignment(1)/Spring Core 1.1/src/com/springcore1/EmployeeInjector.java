package com.springcore1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeInjector {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("empBean.xml");
		
		Employee obj = (Employee) context.getBean("emp");
		System.out.println("Printing Employee details.....\n--------------------------------------------");
		System.out.println("Employee Id : "+obj.getId());
		System.out.println("Employee Name : "+obj.getName());
		System.out.println("Employee Salary : "+obj.getSalary());
		System.out.println("Employee BU : "+obj.getBu());
		System.out.println("Employee Age : "+obj.getAge());
}
}
