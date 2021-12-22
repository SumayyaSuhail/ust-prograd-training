package com.calculator.CalculatorBeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
    @Value("${value1}")
    public double value1;
    @Value("${value2}")
    public double value2;
    public double add(){
        return value1+value2;
    }
    public double sub(){
        return value1-value2;
    }
    public double mul(){
        return value1*value2;
    }
    public double div(){
        if (value2>0){
            return value1/value2;
        }
        else{
            throw new ArithmeticException("Cannot divide by zero");
        }
    }
}
