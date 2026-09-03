package br.com.thaynara.was.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "mensalidade")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Mensalidade implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "competencia", nullable = false)
    private LocalDate competencia;

    @Column(name="valor",  precision = 10, scale = 2, nullable = false)
    private BigDecimal valor;

    @Column(name="data_nascimento", nullable = false)
    private LocalDate dataNascimento;

    @Column(name="data_pagamento", nullable = false)
    private LocalDate dataPagamento;

    @Column(name = "status", nullable = false)
    private boolean status;

    @Column(name = "ativo", nullable = false)
    private boolean ativo;

    @ManyToOne()
    @JoinColumn(name="idaluno",nullable = false)
    private Aluno aluno;

}
