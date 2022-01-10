package com.abcBank.abcBank.service;

import com.abcBank.abcBank.entity.Customer;
import com.abcBank.abcBank.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    /**
     * Method to save customer
     * @param customer
     * @return customer
     */
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    /**
     * Method to find customer by email and password
     * @param email
     * @param password
     * @return customer
     */
    public Customer getCustomerByEmailAndPassword(String email, String password) {
        return customerRepository.findCustomerByEmailAndPassword(email, password);
    }

    /**
     * Method to find customer by email
     * @param email
     * @return customer
     */
    public Customer getCustomerByEmail(String email) {
        return customerRepository.findCustomerByEmail(email);
    }
}
