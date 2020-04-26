package com.exception.ExceptionWithRest.exception;

public class InvalidEmployeeNameException extends Exception{
	public InvalidEmployeeNameException(String msg){
		super(msg);
	}

}
