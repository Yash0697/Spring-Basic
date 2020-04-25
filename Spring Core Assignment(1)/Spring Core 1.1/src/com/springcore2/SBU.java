package com.springcore2;

public class SBU {

	public int sbuId;
	public String sbuName;
	public String subHead;
	public int getSbuId() {
		return sbuId;
	}
	public void setSbuId(int sbuId) {
		this.sbuId = sbuId;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSubHead() {
		return subHead;
	}
	public void setSubHead(String subHead) {
		this.subHead = subHead;
	}
	public String getSubDetails() {
	return "BU ID : " + this.sbuId + " BU Name : " + this.sbuName + "BU Head " + this.subHead;
		
	}
	
}
