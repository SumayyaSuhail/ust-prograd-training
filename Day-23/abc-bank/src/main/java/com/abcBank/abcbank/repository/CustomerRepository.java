package com.abcBank.abcbank.repository;

import com.abcBank.abcbank.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    @Query("Select user from Customer user where user.email=:email and user.password=:password")
    Customer findByNameAndPassword(@Param("email") String email, @Param("password") String password);

}

