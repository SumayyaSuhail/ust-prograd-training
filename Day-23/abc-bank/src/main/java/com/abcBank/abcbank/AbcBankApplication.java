package com.abcBank.abcbank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AbcBankApplication {

    public static void main(String[] args) {
        SpringApplication.run(AbcBankApplication.class, args);
    }

}


//    Create a Spring Boot application for ABC Bank. using this application, the customers of the bank
//        should be able to access their account details and transfer funds to the other accounts of the same bank.
//        This application should consist of the following entities:
//        Customer: To store information about the customers of the bank
//        Account:To store information about the existing accounts of the bank
//        FundTransfer: To store information about the funds that are transferred from one account to the other.
//        Create the application and inject dependencies in the entities.