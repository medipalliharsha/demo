package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/test")
public class Sample {

	@GetMapping("/data")
	public String getSampleData() {
		return "Hi harsha";
	}
}
