package com.example.banking.Banking_App.model;
import jakarta.persistence.*;

@Entity
public class Branch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String city;

    @ManyToOne
    @JoinColumn(name = "bank_id")
    private Bank bank;

    // Getters and Setters
}

