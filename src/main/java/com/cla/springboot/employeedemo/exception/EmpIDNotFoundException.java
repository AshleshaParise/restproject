package com.cla.springboot.employeedemo.exception;

public class EmpIDNotFoundException extends RuntimeException {

	public EmpIDNotFoundException(String message) {
		super(message);
	}

	public EmpIDNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	
}
