package com.exception.ExceptionWithRest.exception;

public class InvalidEmployeeIdException extends Exception{

	public InvalidEmployeeIdException(String msg){
		super(msg);
	}
}
