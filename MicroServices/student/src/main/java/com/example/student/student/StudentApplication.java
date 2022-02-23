package com.example.student.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class StudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
	}

	@Bean//API requests
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
}
