package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	
	
	@GetMapping("/")
	public String index() {
		return "form";
	}
	
	@PostMapping("/confirm")
	public String confirm(@RequestParam String message, Model model) {
		model.addAttribute("message", message);
		return "confirm";
	}

}
