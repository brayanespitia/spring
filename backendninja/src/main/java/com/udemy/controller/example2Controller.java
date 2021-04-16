package com.udemy.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/example2")
public class example2Controller {
	
	
	//private static final String EXAMPLO= "example2";
	
	@GetMapping("request1")
	public ModelAndView request1(@RequestParam(name="nm")String nombre) {
		ModelAndView mav = new ModelAndView("example2");
		mav.addObject("nm_in_model" , nombre);
		return mav;
	}

	@GetMapping("/request2/{nm}")
	public ModelAndView request2(@PathVariable("nm") String nombre) {
		
		ModelAndView mav = new ModelAndView("example2");
		mav.addObject("nm_in_model" , nombre);
		return mav;
	}
	
}
