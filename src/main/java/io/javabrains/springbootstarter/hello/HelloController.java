package io.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	// this maps to all HTTP methods
	@RequestMapping("/hello")
	public String sayHi() {
		return "Hi there, Georgeous!";
	}
}
