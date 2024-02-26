package com.example.testH2;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, name = "Cognome")
    private String lastName;
    @Column(nullable = false, name = "Nome")
    private String firstName;
    @Column(nullable = false, unique = true, name = "Email")
    private String email;
}