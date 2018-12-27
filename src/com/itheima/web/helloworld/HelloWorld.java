package com.itheima.web.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloworld")
public class HelloWorld {
	
	@RequestMapping("/getName")
	public String getName() {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		// int i = 1 / 1;
		System.out.println(4);
		System.out.println(5);
		return "index";
	}
	
	
}
