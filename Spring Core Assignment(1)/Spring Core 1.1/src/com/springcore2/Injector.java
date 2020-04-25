package com.springcore2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore2.Employee;

public class Injector {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("SBUBean.xml");
		Employee obj = (Employee) context.getBean("empl");
		SBU sbj = (SBU) context.getBean("Sbu");
		obj.setBussinessUnit(sbj);
		System.out.println("Printing Employee details.....\n--------------------------------------------");
		System.out.println("Employee Id : "+obj.getEmployeeId());
		System.out.println("Employee Name : "+obj.getEmployeeName());
		System.out.println("Employee Salary : "+obj.getSalary());
		System.out.println("Employee SBU ID : "+obj.getBussinessUnit().getSubDetails());
		System.out.println("Employee SBU Name : "+obj.getBussinessUnit().getSbuName());
		System.out.println("Employee SBU Head : "+obj.getBussinessUnit().getSubHead());
	}

}