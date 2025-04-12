package com.example.lab2.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "auto")
public class Auto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idauto")
    private int idAuto;
    @Column(nullable = false)
    private String modelo;
    @Column(nullable = false)
    private String color;
    @Column(nullable = false)
    private double kilometraje;
    @Column(nullable = false)
    private int sede_idsede;
    @Column(nullable = false)
    private double costo_por_dia;
}
