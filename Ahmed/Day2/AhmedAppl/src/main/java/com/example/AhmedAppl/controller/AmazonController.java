package com.example.AhmedAppl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AmazonController {

    @GetMapping("/Registration")
    public String registrationPage(){
        return "Welcome!! Register Create your new Amazon ";
    }

    @GetMapping("/Login")
    public String loginPage(){
        return "Enter valid Credentials, if unregisterd, register first";
    }

    @GetMapping("/Products")
    public String prodPage(){
        return "Mobile section, Laptop Section, Clothes Section, Shoe Section";
    }

    @GetMapping("/Order")
    public String orderPage(){
        return "Confirm your order here ";
    }

}
