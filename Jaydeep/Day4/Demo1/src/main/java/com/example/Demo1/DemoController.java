package com.example.Demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("/Hi")
    public String sayHello(){
        return "Hello Jaydeep";
    }
}
