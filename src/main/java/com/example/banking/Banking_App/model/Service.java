package com.example.banking.Banking_App.model;
import jakarta.persistence.*;

@Entity
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "bank_id")
    private Bank bank;

    // Getters and Setters
}
