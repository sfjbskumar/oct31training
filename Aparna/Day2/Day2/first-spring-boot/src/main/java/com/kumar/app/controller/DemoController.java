package com.kumar.app.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class DemoController {
    @GetMapping("hi")
    public String sayHello(){
        return "Hello";
    }
}
