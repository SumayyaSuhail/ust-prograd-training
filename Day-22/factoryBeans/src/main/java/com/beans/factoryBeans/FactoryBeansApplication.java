package com.beans.factoryBeans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@SpringBootApplication
public class FactoryBeansApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(FactoryBeansApplication.class, args);
		FactoryOne one = context.getBean(FactoryOne.class);
		one.show();
		System.out.println(context.getBeanDefinitionCount());
		System.out.println(Arrays.asList(context.getBeanDefinitionNames()));
	}
}
