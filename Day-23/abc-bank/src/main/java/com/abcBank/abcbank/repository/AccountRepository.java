package com.abcBank.abcbank.repository;

import com.abcBank.abcbank.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AccountRepository extends JpaRepository<Account, Long> {
    @Query("Select user from Account user where user.customerId=:customerId")
    Account findByCustomerId(@Param("customerId") Long customerId);
}
