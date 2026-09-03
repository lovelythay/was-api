package br.com.thaynara.was.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name="despesa")
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Despesa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "descricao", length = 100, nullable = false)
    private String descricao;

    @Column(name = "valor", precision = 10, scale = 2, nullable = false)
    private BigDecimal valor;

    @Column(name = "data",nullable = false )
    private LocalDate data;

    @Column(name = "categoria", length = 30, nullable = false)
    private String categoria;

    @ManyToOne
    @JoinColumn(name="idempresa", nullable = false)
    private Empresa empresa;

    @ManyToOne
    @JoinColumn(name="idveiculo", nullable = false)
    private Veiculo veiculo;

    @ManyToOne
    @JoinColumn(name="idmanutencao", nullable = false)
    private Manutencao manutencao;
}
