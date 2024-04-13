package com.spec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody

public class HelloContoller {
	
	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello Spec .....!";

       }
	@RequestMapping("/name")
	public String printName() {
		return "naveen singamshetty .....!";
}
}
