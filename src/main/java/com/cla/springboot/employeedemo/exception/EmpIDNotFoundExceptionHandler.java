package com.cla.springboot.employeedemo.exception;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EmpIDNotFoundExceptionHandler {
	@ExceptionHandler(value= {EmpIDNotFoundException.class})
	public ResponseEntity<Object> habdlerNotFoundException(EmpIDNotFoundException e){
		HttpStatus badRequest=HttpStatus.BAD_REQUEST;
		EmpIDException empIDException=new EmpIDException(
				e.getMessage(),
				HttpStatus.BAD_REQUEST,
				ZonedDateTime.now(ZoneId.of("Z"))
				);
		return new ResponseEntity<>(empIDException,badRequest);
		
	}  
}
