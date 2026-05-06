package edu.icet.ecom.repository;

import edu.icet.ecom.model.LinkedAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LinkedAccountRepository extends JpaRepository<LinkedAccount, Long> {

    List<LinkedAccount> findByUserId(Long userId);

    Optional<LinkedAccount> findByUserIdAndAccountNumber(Long userId, String accountNumber);

    boolean existsByUserIdAndAccountNumber(Long userId, String accountNumber);
}
