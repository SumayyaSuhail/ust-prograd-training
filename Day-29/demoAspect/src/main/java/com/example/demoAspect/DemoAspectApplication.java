package com.example.demoAspect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class DemoAspectApplication {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(DemoAspectApplication.class, args);
		Student student=context.getBean(Student.class);
		student.show();
	}

}
