package com.example.banking.Banking_App.model;


import jakarta.persistence.*;
import java.util.*;

@Entity
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "bank", cascade = CascadeType.ALL)
    private List<Branch> branches;

    @OneToMany(mappedBy = "bank", cascade = CascadeType.ALL)
    private List<Service> services;

    // Getters and Setters
}
