package com.spring.microservices.controller;


import com.spring.microservices.model.NameSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class NameController {

    @Value("${app.number1}")
    private Integer number1;
    @Value("${app.number2}")
    private Integer number2;
    @Autowired
    private NameSender nameSender;

    @GetMapping("/name")
    public NameSender getName()
    {
        return new NameSender(nameSender.getFirstName(),nameSender.getLastName());
    }

    @GetMapping("/sum")
    public HashMap<String,Integer> getSum()
    {
        HashMap<String,Integer> hashMap=new HashMap<>();
        hashMap.put("Sum of "+number1+" and "+number2,(number1+number2));
        return hashMap;
    }
}
