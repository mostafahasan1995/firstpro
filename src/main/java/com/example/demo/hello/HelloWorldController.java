package com.example.demo.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//controller
@RestController
public class HelloWorldController {
	//@RequestMapping(method = RequestMethod.GET, path ="/hello")
	@GetMapping("/hello1")
public String helloworld() {
	return "hello world4";
}
@GetMapping("/hello-bean")	
public UserDetails Hello() {
	return new UserDetails ("Ali","Ahmad","jable");
}
}
