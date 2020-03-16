package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingControllerImpl implements GreetingController {
	
	@Override
	public String greeting(@PathVariable("username") String username) {
		return String.format("Hello %s! this is not the demo rest app\n",  username);
	}
}
