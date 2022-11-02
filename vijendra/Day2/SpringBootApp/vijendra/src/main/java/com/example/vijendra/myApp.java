package com.example.vijendra;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myApp {
    @RequestMapping("/")
    public String hi(){
        return "<h1>Hello World</h1>";
    }
}
