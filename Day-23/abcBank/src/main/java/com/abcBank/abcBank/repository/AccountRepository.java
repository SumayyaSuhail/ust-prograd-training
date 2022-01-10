package com.abcBank.abcBank.repository;

import com.abcBank.abcBank.entity.Account;
import com.abcBank.abcBank.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AccountRepository extends JpaRepository<Account, Long> {

    /**
     * Abstract method to find the account with customerId that matches with customerId passed as parameter
     * @param customer
     * @return account
     */
    @Query("Select account from Account account where account.customer=:customer")
    Account findAccountByCustomerId(@Param("customer") Customer customer);

    /**
     * Abstract method to find the account with accountId that matches with accountId passed as parameter
     * @param accountId
     * @return account
     */
    @Query("Select account from Account account where account.accountId=:accountId")
    Account findAccountByAccountId(@Param("accountId") Long accountId);
}
