package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeCon {
    @GetMapping("/welcome")
    public String welcome()
    {
        return "Welcome to my first spring boot app ";
    }
}
