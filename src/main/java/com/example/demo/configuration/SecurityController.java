package com.example.demo.configuration;

import org.springframework.web.bind.annotation.GetMapping;

public class SecurityController {

	@GetMapping("/")
	public String login() {
		return "index";
	}
	
	
}
