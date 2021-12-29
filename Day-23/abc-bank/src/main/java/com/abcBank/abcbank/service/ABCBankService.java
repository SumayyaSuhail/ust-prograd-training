package com.abcBank.abcbank.service;

import com.abcBank.abcbank.entity.Account;
import com.abcBank.abcbank.entity.Customer;
import com.abcBank.abcbank.repository.AccountRepository;
import com.abcBank.abcbank.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ABCBankService {
    @Autowired
    private CustomerRepository customerRepo;

    public Customer addCustomer(Customer customer) {
        return customerRepo.save(customer);
    }

    public Customer getCustomerByEmailAndPassword(String email, String password) {
        return customerRepo.findByNameAndPassword(email, password);
    }

    @Autowired
    private AccountRepository accountRepo;

    public Account addAccount(Account account) {
        return accountRepo.save(account);
    }

}
