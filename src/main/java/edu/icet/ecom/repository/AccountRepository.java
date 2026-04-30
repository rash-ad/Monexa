package edu.icet.ecom.repository;

import edu.icet.ecom.model.Account;

import java.util.List;
import java.util.Optional;

public interface AccountRepository {
    Optional<Account> findByAccountNumber(String accountNumber);
    List<Account> findByUserId(Long userId);
    Boolean existsByAccountNumber(String accountNumber);
}
