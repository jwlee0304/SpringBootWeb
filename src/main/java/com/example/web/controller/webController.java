package com.example.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class webController {
	
	@RequestMapping(value="/")
	public String home() {
		return "home";
	}
}
