package com.rama.calculator;


import org.springframework.stereotype.Component;

@Component
public class MyCalculator {

    public String addString(String a,String b){
        return a.concat(b);
    }
}
