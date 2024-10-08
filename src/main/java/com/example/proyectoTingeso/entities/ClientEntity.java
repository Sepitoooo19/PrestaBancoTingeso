package com.example.proyectoTingeso.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "client")
@Getter
@Setter


public class ClientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long Client_id;

    @Column(name = "FullName")
    private String FullName;

    @Column(name = "Rut")
    private String Rut;

    @Column(name = "Email")
    private String Email;

    @Column(name = "Phone")
    private String Phone;

    @Column(name = "Address")
    private String Address;

    @Column(name = "monthlyIncome")
    private int monthlyIncome;

    @Column(name = "jobSeniority")
    private int jobSeniority;

    @Column(name = "jobType")
    private String jobType;



}
