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

    public Account(){

    }
    public Account(String accountHolderName, Double accountBalance, Long customerId) {
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
        this.customerId = customerId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
}
