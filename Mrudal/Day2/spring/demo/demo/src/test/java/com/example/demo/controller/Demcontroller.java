package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class Demcontroller {
    //@GetMapping("/Hi");
    public String sayhello()
    {
        return "Hello";
    }
}
