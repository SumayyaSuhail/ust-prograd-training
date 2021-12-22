package com.calculator.CalculatorBeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CalculatorBeansApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(CalculatorBeansApplication.class, args);
		Calculator calculator = context.getBean(Calculator.class);
		System.out.println("Sum = "+ calculator.add());
		System.out.println("Diff = "+ calculator.sub());
		System.out.println("Mul = "+ calculator.mul());
		System.out.println("Quotient = "+ calculator.div());
	}

}
