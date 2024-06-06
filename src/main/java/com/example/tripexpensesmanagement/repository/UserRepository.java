package com.example.tripexpensesmanagement.repository;

import com.example.tripexpensesmanagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}