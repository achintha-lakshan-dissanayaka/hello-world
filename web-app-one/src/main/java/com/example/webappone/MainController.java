package com.example.webappone;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class MainController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello, ";
    }
	
	@GetMapping("/hi")
    public String sayHi(){
        return "Hi, ";
    }
}
