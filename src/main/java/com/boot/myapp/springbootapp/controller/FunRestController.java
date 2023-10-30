package com.boot.myapp.springbootapp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;

    @GetMapping("/teamInfo")
    public String myapp()
    {
        return "Hello :"+coachName+" Welcome to the "+teamName;
    }

    @GetMapping("/hello")
    public String hello()
    {
        return "Welcome to my Boot Application";
    }

}
