package com.damowang.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringBoot {
	
	@RequestMapping("/hello")
	public String say() {
		
		return "Hello Spring Boot";
	}
	
}
