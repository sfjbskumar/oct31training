package com.rama.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyCalculatorTest {

    @Test
    public void addStringTest(){
        MyCalculator myCalculator=new MyCalculator();
        String result=myCalculator.addString("hello","world");
        assertEquals("helloworld", result);
    }
}
