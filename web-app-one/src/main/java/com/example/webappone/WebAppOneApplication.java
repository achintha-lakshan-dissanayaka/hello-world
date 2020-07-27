package com.example.webappone;

import com.example.webappone.models.BmiCal;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class WebAppOneApplication {

	@Bean
	public BmiCal getacal(){
		return new BmiCal(0,0);
	}

	public static void main(String[] args) {
		SpringApplication.run(WebAppOneApplication.class, args);
	}

}

