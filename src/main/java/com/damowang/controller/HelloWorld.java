package com.damowang.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	
	@RequestMapping("/helloworld")
	public String say() {
		System.out.println("hot fix!");
		return "HelloWorld";
	}
}
