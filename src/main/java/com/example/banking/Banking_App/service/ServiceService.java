package com.example.banking.Banking_App.service;

import com.example.banking.Banking_App.model.Service;
import com.example.banking.Banking_App.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceService {
    @Autowired
    private ServiceRepository serviceRepository;

    public List<Service> getServicesByBank(Long bankId) {
        return serviceRepository.findByBank_Id(bankId);
    }
}

