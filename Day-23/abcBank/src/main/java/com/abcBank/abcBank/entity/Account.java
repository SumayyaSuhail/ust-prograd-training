package com.abcBank.abcBank.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "accountid")
    private Long accountId;
    @Column(name = "accountholdername", nullable = false)
    private String accountHolderName;
    @Column(name = "accountbalance")
    private Double accountBalance;
    @OneToOne
    private Customer customer;
    @Column(name = "bankname")
    private String bankName;
    @Column(name = "ifsccode")
    private String ifscCode;
    @Column(name = "branchname")
    private String branchName;

    public Account() {

    }

    public Account(String accountHolderName, Double accountBalance, Customer customer, String bankName, String ifscCode, String branchName) {
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
        this.customer=customer;
        this.bankName = bankName;
        this.ifscCode = ifscCode;
        this.branchName = branchName;
    }

    public Long getId() {
        return accountId;
    }

    public void setId(Long id) {
        this.accountId = id;
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getIFSCCode() {
        return ifscCode;
    }

    public void setIFSCCode(String IFSCCode) {
        this.ifscCode = IFSCCode;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }
}
