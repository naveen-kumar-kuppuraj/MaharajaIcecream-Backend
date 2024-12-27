package com.SpringBoot.Maharaja.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/homecontroller")
@RestController

public class homecontroller {
	@GetMapping("/home")
	String welcome()
	{
		return "hello";
	}

	

}
