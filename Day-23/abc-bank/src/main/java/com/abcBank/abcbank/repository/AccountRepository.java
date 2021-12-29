package com.abcBank.abcbank.repository;

import com.abcBank.abcbank.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
