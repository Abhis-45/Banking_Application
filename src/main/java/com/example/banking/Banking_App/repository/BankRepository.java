package com.example.banking.Banking_App.repository;


import com.example.banking.Banking_App.model.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends JpaRepository<Bank, Long> {
}

