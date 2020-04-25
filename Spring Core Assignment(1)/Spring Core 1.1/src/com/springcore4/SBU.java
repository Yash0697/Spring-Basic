package com.springcore4;

import java.util.Iterator;
import java.util.List;

import com.springcore4.Employee;

public class SBU {
	private List<Employee> empList;

	public List<Employee> getEmpList() {
		return empList;
	}

	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	
	public Employee display(int id){
		Iterator<Employee> itr = empList.iterator();
		while(itr.hasNext()){
			Employee emp = itr.next();
			if(emp.getEmpId()==id){
				return emp;
			}
		}
		return null;
	}

	public SBU(List<Employee> empList) {
		super();
		this.empList = empList;
	}
}
