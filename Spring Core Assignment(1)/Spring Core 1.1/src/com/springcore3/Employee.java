package com.springcore3;

public class Employee {
	private int empId;
	private String empName;
	private int age;
	private double salary;
	
	public Employee() {
		
	}
	
	public Employee(int empId, String empName, double salary, int age ) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.age = age;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", age="
				+ age + ", salary=" + salary + "]";
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	
}
