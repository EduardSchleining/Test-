package com.example.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	ExampleService eS = new ExampleService();

	@GetMapping("/")
	public String index() {
		System.out.println("GET Request erhalten!");

		String securePassword = eS.passwordEncryption("geheim");

		System.out.println(securePassword);

		return "Response für GET Request";
	}

}
