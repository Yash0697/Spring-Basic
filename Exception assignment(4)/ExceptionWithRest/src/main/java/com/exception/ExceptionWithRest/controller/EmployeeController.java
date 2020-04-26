package com.exception.ExceptionWithRest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.exception.ExceptionWithRest.exception.InvalidEmployeeIdException;
import com.exception.ExceptionWithRest.exception.InvalidEmployeeNameException;

@RestController
public class EmployeeController {

	@GetMapping(path="/isValid", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> index(@RequestParam("id") int id,
			@RequestParam("name") String name) throws InvalidEmployeeIdException, InvalidEmployeeNameException
	{
		String strValidProduct = new String();
		
		if(id<=0)
			throw new InvalidEmployeeIdException("EXCEPTION : Invalid Employee Id");
		else
			strValidProduct = "Valid Employee";
		System.out.println("Name is : "+name);
		if(name.equals(""))
			throw new InvalidEmployeeNameException("EXCEPTION : Invalid Employee Name");
		return new ResponseEntity<String> (strValidProduct, HttpStatus.OK);
	}
/*
	@ExceptionHandler(InvalidEmployeeIdException.class)
	public ResponseEntity<String> handleException(Exception ex)
	{
		return new ResponseEntity<String>(ex.getMessage(), HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(InvalidEmployeeNameException.class)
	public ResponseEntity<String> handleExceptionForName(Exception ex)
	{
		return new ResponseEntity<String>(ex.getMessage(), HttpStatus.NOT_FOUND);
	}
	*/
}
