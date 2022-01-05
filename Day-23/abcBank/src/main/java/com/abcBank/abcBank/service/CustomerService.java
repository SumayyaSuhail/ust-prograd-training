package com.abcBank.abcBank.service;

import com.abcBank.abcBank.entity.Customer;
import com.abcBank.abcBank.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepo;

    public Customer saveCustomer(Customer customer) {
        return customerRepo.save(customer);
    }

    public Customer getCustomerByEmailAndPassword(String email, String password) {
        return customerRepo.findByEmailAndPassword(email, password);
    }
    public Customer getCustomerByEmail(String email){
        return customerRepo.findByEmail(email);
    }
}
