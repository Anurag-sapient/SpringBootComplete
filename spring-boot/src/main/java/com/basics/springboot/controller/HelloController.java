package com.basics.springboot.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//    @RequestMapping(value = "/",method = RequestMethod.GET)
    @Value("${welcome.message}")
    private String welcome;

    @GetMapping("/")
    public String helloWorld(){
        return welcome;
//                "welcome to website endpoint    what t!!!";
    }
}
