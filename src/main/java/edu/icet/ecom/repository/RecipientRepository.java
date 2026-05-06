package edu.icet.ecom.repository;

import edu.icet.ecom.model.Recipient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RecipientRepository extends JpaRepository<Recipient, Long> {

    List<Recipient> findByUserId(Long userId);

    Optional<Recipient> findByUserIdAndAccountNumber(Long userId, String accountNumber);

    boolean existsByUserIdAndAccountNumber(Long userId, String accountNumber);
}