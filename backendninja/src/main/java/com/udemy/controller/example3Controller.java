package com.udemy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.udemy.model.Person;

@Controller
@RequestMapping("/example3")
public class example3Controller {

	@GetMapping("/")
	public String redirect() {

		return "redirect:/example3/show";
	}

	@GetMapping("/show")
	public String mostrarForm(Model model) {

		model.addAttribute("person", new Person());
	
		return "form";

	}

	/*
	 * @PostMapping("/addpersona")
	 * 
	 * public ModelAndView addPersona( @ModelAttribute("person") Person person) {
	 * 
	 * 
	 * ModelAndView mav= new ModelAndView("resultado"); mav.addObject("person",
	 * person);
	 * 
	 * return mav; }
	 * 
	 */

	@PostMapping("/addpersona")
	public String agregarPersona(@ModelAttribute("person") Person person, Model model) {
		model.addAttribute("person", person);

		return "resultado";
	}

}
