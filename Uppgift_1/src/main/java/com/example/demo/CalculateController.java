package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculateController {
	
	@RequestMapping("/")
	public String index() {
		return "Visit /add, /subt, /mult or /div, provide 'first' and 'sec' parameters to get calculation as response.";
		
	}
	
	@GetMapping("/add")
	public double add(double first, double sec) {
		System.out.println(first + sec);
		return first + sec;
	}
	@GetMapping("/subt")
	public double subt(double first, double sec) {
		System.out.println(first - sec);
		return first - sec;
	}
	@GetMapping("/mult")
	public double mult(double first, double sec) {
		System.out.println(first * sec);
		return first * sec;
	}
	@GetMapping("/div")
	public double div(double first, double sec) {
		System.out.println(first / sec);
		return first / sec;
	}
}
