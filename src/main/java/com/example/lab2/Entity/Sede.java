package com.example.lab2.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "sede")
public class Sede {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idsede")
    private int idSede;
    @Column(nullable = false)
    private String distrito;
    @Column(nullable = false)
    private String direccion;
}
