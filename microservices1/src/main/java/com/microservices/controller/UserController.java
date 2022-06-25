package com.microservices.controller;

import com.microservices.model.SendNumber;
import com.microservices.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app1")
public class UserController {

    @Autowired
    private Environment environment;

    @PostMapping("/users")
    public User getStudent()
    {
        User user=new User();
        user.setFirstName("Sunil");
        user.setLastName("Samal");
        user.setEnvironment(environment.getProperty("local.server.port"));
        return  user;
    }

    @PostMapping("/numbers")
    public SendNumber sendNumber()
    {
        SendNumber numbers=new SendNumber();
        numbers.setNumber1(20);
        numbers.setNumber2(10);
        numbers.setEnvironment(environment.getProperty("local.server.port"));
        return numbers;
    }
    @GetMapping("/name")
    public String name()
    {
        return "sunil";
    }

}
