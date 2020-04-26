package com.exception.ExceptionWithRest.Entity;




public class Employee{
	
	private int id;
	
	String name;
	
	String dept;
	
	int sal;
	
	public Employee(){}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [id = " + id + ", Name = " + ", dept = " + dept + ", salary = " + sal + " ]";
	}
	
	
}
