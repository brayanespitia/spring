package com.udemy.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrosController {

	
	@ExceptionHandler(Exception.class)
	public String error500(){
		
		return "error/500";
	}
	
}
