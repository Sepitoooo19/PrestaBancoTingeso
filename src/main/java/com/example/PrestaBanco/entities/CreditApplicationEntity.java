package com.example.PrestaBanco.entities;

import jakarta.persistence.*;

import com.example.PrestaBanco.entities.ClientEntity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "credit_applications")
@Data
@AllArgsConstructor
@NoArgsConstructor



public class CreditApplicationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    @Column(name = "client_id")
    private Long client_id;

    @Column(name = "amount")
    private double amount;

    @Column(name = "time_limit")
    private Integer timeLimit;

    @Column(name = "application_status")
    private String application_status;





}
