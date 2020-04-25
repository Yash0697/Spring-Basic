package com.springcore4;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore4.SBU;

public class Client {
	public static void main(String[] args) {
			
			ApplicationContext context=new ClassPathXmlApplicationContext("bean4.xml");
			SBU obj= (SBU) context.getBean("sbubean");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter employee id: ");
			int id = sc.nextInt();
			Employee emp = obj.display(id);
			System.out.println("Employee Info-------------------");
			System.out.println("Employee Id      : "+emp.getEmpId());
			System.out.println("Employee Name    : "+emp.getEmpName());
			System.out.println("Employee Salary  : "+emp.getSalary());
			sc.close();
	}
}