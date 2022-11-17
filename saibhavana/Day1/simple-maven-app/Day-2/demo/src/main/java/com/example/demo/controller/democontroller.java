package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class democontroller {

    @GetMapping("/Hi")
    public String sayHi(){
        return "Hello";
    }
}
