package com.anjali.springdemo.demodoc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoDocker {

@GetMapping("/Hi")
    public String sayHi(){
    return "Hello Docker";
}
}

