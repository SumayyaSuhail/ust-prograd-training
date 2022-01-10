package com.abcBank.abcBank.repository;

import com.abcBank.abcBank.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    /**
     * Method to find the customer with email and password that matches with parameters email and password
     * @param email
     * @param password
     * @return customer
     */
    @Query("Select customer from Customer customer where customer.email=:email and customer.password=:password")
    Customer findCustomerByEmailAndPassword(@Param("email") String email, @Param("password") String password);

    /**
     * Method to find the customer with email that matches with parameter email
     * @param email
     * @return customer
     */
    @Query("Select customer from Customer customer where customer.email=:email")
    Customer findCustomerByEmail(@Param("email") String email);

}
