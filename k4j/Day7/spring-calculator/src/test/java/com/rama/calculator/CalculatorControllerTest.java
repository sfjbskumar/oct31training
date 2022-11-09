package com.rama.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorControllerTest {
    CalculatorController calculatorController;

    @Test
    public void addTest(){
        MyCalculator calculator=new MyCalculator();
        calculatorController=new CalculatorController();
       float result= calculatorController.addition(3.0f,4.0f);
        assertEquals(7.0, result,0.0002);

    }

    @Test
    public void subTest(){
        MyCalculator calculator=new MyCalculator();
        calculatorController=new CalculatorController();
        float result= calculatorController.subtraction(8.0f,4.0f);
        assertEquals(4.0, result,0.0002);

    }

    @Test
    public void mulTest(){
        MyCalculator calculator=new MyCalculator();
        calculatorController=new CalculatorController();
        float result= calculatorController.multiplication(3.0f,4.0f);
        assertEquals(12.0, result,0.0002);

    }

    @Test
    public void divTest(){
        MyCalculator calculator=new MyCalculator();
        calculatorController=new CalculatorController();
        float result= calculatorController.division(12.0f,4.0f);
        assertEquals(3.0, result,0.0002);

    }
}
