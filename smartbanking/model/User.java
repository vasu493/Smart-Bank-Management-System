package com.smartbanking.model;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String role; // USER or ADMIN
    private Double balance;

    // Getters and Setters
}
