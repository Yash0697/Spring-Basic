package com.exception.ExceptionWithRest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler({InvalidEmployeeIdException.class, InvalidEmployeeNameException.class})
	public ResponseEntity<String> handleExceptions(Exception ex){
		if(ex instanceof InvalidEmployeeIdException) {
			HttpStatus status = HttpStatus.NOT_FOUND;
			return new ResponseEntity("EXCEPTION : Invalid Employee ID",status);
		}
		else if(ex instanceof InvalidEmployeeNameException){
			HttpStatus status = HttpStatus.NOT_FOUND;
			return new ResponseEntity("EXCEPTION : Invalid Employee Name",status);
		}
		else
			return null;
	}
}
