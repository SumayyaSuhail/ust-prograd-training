package com.abcBank.abcbank.entity;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "accountId")
    private Long id;
    @Column(name = "accountholdername", nullable = false)
    private String accountHolderName;
    private Double accountBalance;
    @Column(name = "customerid", nullable = false)
    private Long customerId;

    public Account(String accountHolderName, Double accountBalance, Long customerId) {
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
        this.customerId = customerId;
    }
}
