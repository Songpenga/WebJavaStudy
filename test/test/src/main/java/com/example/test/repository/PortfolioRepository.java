package com.example.test.repository;

import com.example.test.entity.Portfolio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PortfolioRepository extends JpaRepository<Portfolio, Long> {
    // 기본 CRUD 메서드들은 JpaRepository에서 제공됨
}



