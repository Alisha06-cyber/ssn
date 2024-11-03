package com.example.demo.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.SSN;

public interface SsnRepository extends JpaRepository<SSN, String> {
    // No need to define methods here, JpaRepository provides basic CRUD methods
Optional<SSN> findBySsn(String ssn);

}
