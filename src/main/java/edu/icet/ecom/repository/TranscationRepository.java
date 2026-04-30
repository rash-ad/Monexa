package edu.icet.ecom.repository;

import edu.icet.ecom.model.Transaction;
import edu.icet.ecom.model.User;
import org.springframework.data.annotation.Id;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TranscationRepository extends JpaRepository<User, Long> {
    List<Transaction> findByFromAccountNumber(String accountNumber);
    List<Transaction> findByToAccountNumber(String accountNumber);
    List<Transaction> findByStatus(String status);
    Optional<Transaction> findByReferenceNumber(String referenceNumber);
}
