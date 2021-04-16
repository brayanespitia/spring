package com.udemy.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.udemy.component.ExampleComponent;
import com.udemy.model.Person;

@Controller
@RequestMapping("/example")
public class exampleController {

	//public static final String EXAMPLE_VIEW ="example";
	
	@Autowired
	@Qualifier("exampleComponent")
	private ExampleComponent exampleComponent;
	
	//primera forma
	@GetMapping("exampleString")

	public String exampleString(Model model) {
		
	
		model.addAttribute("personas", getPersonitas() );
		
		return "example";
		
	}
	
	
	//segunda fprma
	
	@RequestMapping(value="/exampleMAV", method=RequestMethod.GET)
	public ModelAndView exampleMAV() {
		ModelAndView mav = new ModelAndView("example");
		mav.addObject("name", "david");
		
		return mav;
}
	

 
	private List<Person> getPersonitas(){
		
		
		
		List<Person> personas= new ArrayList<>();
		personas.add(new Person("espitia", 25));
		personas.add(new Person("pepe", 15));
		personas.add(new Person("perez", 2));
		personas.add(new Person("domino", 5));
		return personas;
	}
}
