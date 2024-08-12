package com.example.banking.Banking_App.service;


import com.example.banking.Banking_App.model.Bank;
import com.example.banking.Banking_App.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankService {
    @Autowired
    private BankRepository bankRepository;

    public Bank getBank(Long id) {
        return bankRepository.findById(id).orElse(null);
    }
}

