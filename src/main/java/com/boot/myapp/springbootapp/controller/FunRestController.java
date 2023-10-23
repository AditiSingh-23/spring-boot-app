package com.boot.myapp.springbootapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String myapp()
    {
        return "Hello World";
    }

    @GetMapping("/hello")
    public String hello()
    {
        return "Welcome to my Boot Application";
    }

}
