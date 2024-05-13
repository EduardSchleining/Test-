package com.example.Test;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
	@GetMapping("/")
	public String index() {
		System.out.println("GET Request erhalten!");
        return "Response für GET Request";
	}
	

}
