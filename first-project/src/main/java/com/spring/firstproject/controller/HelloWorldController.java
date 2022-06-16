package com.spring.firstproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {

    private int number1=10;
    private int number2=15;

    @GetMapping("/helloworld")
    public String getHello()
    {
       return "Hello, how are you ?";
    }

    @GetMapping("/addition")
    public String getAddition()
    {
        return "Addition of "+number1+" and "+number2+" is "+(number1+number2);
    }
    @GetMapping("/multiplication")
    public String getMultiplication()
    {
        return "Multipication of "+number1+" and "+number2+" is "+number1*number2;
    }
}
