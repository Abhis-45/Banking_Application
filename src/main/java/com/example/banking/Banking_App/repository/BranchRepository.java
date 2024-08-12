package com.example.banking.Banking_App.repository;


import com.example.banking.Banking_App.model.Branch;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;

public interface BranchRepository extends JpaRepository<Branch, Long> {
    List<Branch> findByCityAndBank_Id(String city, Long bankId);
}

