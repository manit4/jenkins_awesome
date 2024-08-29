package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/")
	public String getMessage() {
		
		System.out.println("inside getMessage()");
		
		return "Hi, there";
	}
}
