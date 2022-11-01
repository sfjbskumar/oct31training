package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@SuppressWarnings("unused")

public class DemoController{
    @GetMapping("/Hi")

    public String sayHi(){
        return "Hello";
    }
}