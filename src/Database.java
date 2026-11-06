package com.plastic.app.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password; // In production, store BCrypt hashed passwords

    private String role; // "USER", "COLLECTOR", "ADMIN"
    private int ecoPoints;
}




