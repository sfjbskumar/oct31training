package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

   @GetMapping("/add")

        public float addition(@RequestParam(name = "a" , required=true) float a,@RequestParam(name="b",required=true) float b){
            return a+b;

    }

    @GetMapping("/sub")

    public int sub(@RequestParam(name = "a" , required=true) int a,@RequestParam(name="b",required=true) int b){
        return a-b;

    }

    @GetMapping("/mul")

    public int multi(@RequestParam(name = "a" , required=true) int a,@RequestParam(name="b",required=true) int b) {
        return a * b;
    }

    @GetMapping("/div")

    public float divison(@RequestParam(name = "a" , required=true) int a,@RequestParam(name="b",required=true) int b) {
        return a/b;
    }

}

