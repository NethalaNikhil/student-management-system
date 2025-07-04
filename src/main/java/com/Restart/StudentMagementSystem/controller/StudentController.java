package com.Restart.StudentMagementSystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	 @GetMapping("/test")
	    public String test() {
	        return "Spring Boot running!";
	    }
}
