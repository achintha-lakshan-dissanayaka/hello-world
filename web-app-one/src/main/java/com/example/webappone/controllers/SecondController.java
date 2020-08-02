package com.example.webappone.controllers;

import com.example.webappone.models.BmiCal;
import com.example.webappone.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/sec")
public class SecondController {

    @Autowired
    private BmiCal bmiCal;

    @GetMapping("/hi/{name}")
    public String sayHi(@PathVariable String name){
        return "Hi, " + name;
    }


    @GetMapping("/all")
    public List<Person> getall(){
        List<Person> personArrayList =  Arrays.asList(
                new Person("thomas" , "jhay" , "hdhdhdhhdhd"),
                new Person("jhon" , "doe" , "hshhshshs")
        );

        return personArrayList;
    }

    @GetMapping("/b")
    public double getbmi(){
        return bmiCal.getBmi(120.2,6);
    }
	
	@GetMapping("/b2")
    public double getbmi2(){
        return bmiCal.getBmi(120.2,6);
    }
	
	
}
