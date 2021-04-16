package com.udemy.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.udemy.model.UserCredential;

@Configuration
public class LoginController {

	@GetMapping("/")
	public String redirectToLogin() {

		return "redirect:/login";
	}

	@GetMapping("/login")
	public String showLoginForm(@RequestParam(name = "error", defaultValue = "", required = false) String error) {
		return "login";

	}

	@PostMapping
	public String loginCheck(@ModelAttribute(name = "userCredentials") UserCredential userCredential) {

		if (userCredential.getUsername().equals("user") && userCredential.getPassword().equals("user")) {
			
		

			return "contacts";
		}

		return "redirect:/login?error";

	}

}
