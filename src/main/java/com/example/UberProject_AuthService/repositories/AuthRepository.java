package com.example.UberProject_AuthService.repositories;

import com.example.UberProject_AuthService.models.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthRepository extends JpaRepository<Passenger, Long> {
}
