package io.javabrains.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// first tell spring to start with the annotation
@SpringBootApplication
public class CourseApiApp {

	public static void main(String[] args) {
		// This is the start of the application
		// doesn't need a servlet to start it
		
		SpringApplication.run(CourseApiApp.class, args);
		

	}

}
