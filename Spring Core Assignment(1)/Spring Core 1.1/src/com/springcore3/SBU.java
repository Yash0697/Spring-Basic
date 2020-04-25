package com.springcore3;

import java.util.List;

public class SBU {
	private String sbuCode;
	private String sbuName;
	private String sbuHead;
	private List<Employee> empList;
	
	public SBU() {
		
	}

	public SBU(String sbuCode, String sbuName, String sbuHead,
			List<Employee> empList) {
		super();
		this.sbuCode = sbuCode;
		this.sbuName = sbuName;
		this.sbuHead = sbuHead;
		this.empList = empList;
	}
	public String getSbuCode() {
		return sbuCode;
	}
	public void setSbuCode(String sbuCode) {
		this.sbuCode = sbuCode;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	public List<Employee> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	
	public void display() {
		System.out.println("SBU details.......");
		System.out.println("sbuCode=" + sbuCode + ", sbuName=" + sbuName
				+ ", sbuHead=" + sbuHead);
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("Employee Details.....");
		java.util.Iterator<Employee> itr = empList.iterator();
		while(itr.hasNext()){
			Employee emp = itr.next();
			System.out.println(emp);
		}
	}
}
