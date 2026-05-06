package edu.icet.ecom.repository;

import edu.icet.ecom.model.SpendingCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SpendingAccountRepository extends JpaRepository<SpendingCategory, Long> {

    List<SpendingCategory> findByUserId(Long userId);

    Optional<SpendingCategory> findByUserIdAndName(Long userId, String name);

    boolean existsByUserIdAndName(Long userId, String name);
}
