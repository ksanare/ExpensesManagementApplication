package com.example.tripexpensesmanagement.repository;

import com.example.tripexpensesmanagement.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}