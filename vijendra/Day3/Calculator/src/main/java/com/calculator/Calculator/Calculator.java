package com.calculator.Calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator {
    @GetMapping("/add")
    public int addition(@RequestParam(name = "a", required = true) int a,@RequestParam(name = "b", required = true) int b) {
        return a+b;
    }

    @GetMapping("/sub")
    public float subtraction(@RequestParam(name = "a", required = true) int a, @RequestParam(name = "b", required = true) int b) {
        return a-b;
    }

    @GetMapping("/mul")
    public float multiplication(@RequestParam(name = "a", required = true) int a,@RequestParam(name = "b", required = true) int b) {
        return a*b;
    }

    @GetMapping("/div")
    public float division(@RequestParam(name = "a", required = true) int a,@RequestParam(name = "b", required = true) int b) {

        return a/b;
    }

}
