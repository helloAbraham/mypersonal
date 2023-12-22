package com.mypersonal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/hello")
	public String testApp() {
		return "Hello World!!!, Working with CI/CD";
	}

}
