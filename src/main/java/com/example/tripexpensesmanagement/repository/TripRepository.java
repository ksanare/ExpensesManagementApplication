package com.example.tripexpensesmanagement.repository;

import com.example.tripexpensesmanagement.model.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripRepository extends JpaRepository<Trip, Long> {
}