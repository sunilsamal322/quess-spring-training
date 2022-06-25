package com.microservices.restclient;

import com.microservices.model.NumberSet;
import com.microservices.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "${feignclient.name}" )
public interface RestClientService {

    @GetMapping("app1/users")
    public User saveUser(User user);

    @GetMapping("app1/numbers")
    public NumberSet saveNumber(NumberSet numberSet);

    @GetMapping("/app1/name")
    public String name();
}
