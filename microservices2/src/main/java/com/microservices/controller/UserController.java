package com.microservices.controller;

import com.microservices.model.NumberSet;
import com.microservices.model.User;
import com.microservices.restclient.RestClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app2")
public class UserController {

    @Autowired
    private RestClientService restClientService;

    @GetMapping("/users")
    public User getUser(User user)
    {
        return restClientService.saveUser(user);
    }
    @GetMapping("/multiplication")
    public NumberSet sendNumber(NumberSet sendNumber)
    {
        NumberSet numberSet=restClientService.saveNumber(sendNumber);
        numberSet.setMultiplication(numberSet.getNumber1()* numberSet.getNumber2());
        return numberSet;
    }
    @GetMapping("/name")
    public String name()
    {
        return restClientService.name();
    }
}
