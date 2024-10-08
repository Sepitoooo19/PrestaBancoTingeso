package com.example.PrestaBanco.entities;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "clients")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    @Column(name = "rut")
    private String rut;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "monthlySalary")
    private double monthlySalary;

    @Column(name = "personalSavings")
    private Double personalSavings;

    @Column(name = "jobSeniority")
    private int jobSeniority;

    @Column(name = "jobType")
    private String jobType;

}
