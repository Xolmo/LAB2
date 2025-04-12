package com.example.lab2.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "seguro")
public class Seguro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idseguro")
    private int idSeguro;
    @Column(nullable = false)
    private String empresa_aseguradora;
    @Column(nullable = false)
    private double cobertura_maxima;
    @Column(nullable = false)
    private double tarifa;
}
