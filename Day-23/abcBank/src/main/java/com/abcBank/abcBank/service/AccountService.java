package com.abcBank.abcBank.service;

import com.abcBank.abcBank.entity.Account;
import com.abcBank.abcBank.entity.Customer;
import com.abcBank.abcBank.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepo;

    public Account saveAccount(Account account) {
        return accountRepo.save(account);
    }

    public Account getAccountByCustomerId(Customer customer) {
        return accountRepo.findByCustomerId(customer);
    }

    public Account getAccountByAccountId(Long accountId) {
        return accountRepo.findByAccountId(accountId);
    }
}
