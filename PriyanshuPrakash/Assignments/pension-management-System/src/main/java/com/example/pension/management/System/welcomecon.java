package com.example.pension.management.System;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomecon {
    @GetMapping("/hii")
    public String welcome()
    {
        return "Welcome to my pension management system";
    }

}
