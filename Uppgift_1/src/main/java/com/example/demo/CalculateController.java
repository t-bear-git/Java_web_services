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
	public float add(float first, float sec) {
		System.out.println(first + sec);
		return first + sec;
	}
	@GetMapping("/subt")
	public float subt(float first, float sec) {
		System.out.println(first - sec);
		return first - sec;
	}
	@GetMapping("/mult")
	public float mult(float first, float sec) {
		System.out.println(first * sec);
		return first * sec;
	}
	@GetMapping("/div")
	public float div(float first, float sec) {
		System.out.println(first / sec);
		return first / sec;
	}
}
