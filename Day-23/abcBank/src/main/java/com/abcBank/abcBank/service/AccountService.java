package com.abcBank.abcBank.service;

import com.abcBank.abcBank.entity.Account;
import com.abcBank.abcBank.entity.Customer;
import com.abcBank.abcBank.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    /**
     * Method to save account
     * @param account
     * @return account
     */
    public Account saveAccount(Account account) {
        return accountRepository.save(account);
    }

    /**
     * Method to find account by customerId
     * @param customer
     * @return account
     */
    public Account getAccountByCustomerId(Customer customer) {
        return accountRepository.findAccountByCustomerId(customer);
    }

    /**
     * Method to find account by accountId
     * @param accountId
     * @return account
     */
    public Account getAccountByAccountId(Long accountId) {
        return accountRepository.findAccountByAccountId(accountId);
    }
}
