package com.springcore3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore3.SBU;

public class Client {
public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("bean3.xml");
		SBU obj= (SBU) context.getBean("sbubean");
		obj.display();
}
}
