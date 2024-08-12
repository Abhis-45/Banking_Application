package com.example.banking.Banking_App.repository;


import com.example.banking.Banking_App.model.Service;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;

public interface ServiceRepository extends JpaRepository<Service, Long> {
    List<Service> findByBank_Id(Long bankId);
}

