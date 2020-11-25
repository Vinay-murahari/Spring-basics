package com.vinay.programmer.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {
	
	@GetMapping("/index")
	public String home() {
		return "index";
	}
}
