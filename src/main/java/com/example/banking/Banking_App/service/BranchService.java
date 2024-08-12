package com.example.banking.Banking_App.service;

import com.example.banking.Banking_App.model.Branch;
import com.example.banking.Banking_App.repository.BranchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BranchService {
    @Autowired
    private BranchRepository branchRepository;

    public List<Branch> getBranchesByCityAndBank(String city, Long bankId) {
        return branchRepository.findByCityAndBank_Id(city, bankId);
    }
}

