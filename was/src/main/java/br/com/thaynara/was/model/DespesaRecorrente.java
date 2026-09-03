package br.com.thaynara.was.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name="despesa_recorrente")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
public class DespesaRecorrente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name="descricao", length = 100, nullable = false)
    private String descricao;

    @Column(name="valor_padrao", precision = 10, scale = 2, nullable = false)
    private BigDecimal valorPadrao;

    @Column(name="dia_vencimento", nullable = false)
    private Integer diaVencimento;

    @Column(name="categoria", length = 30, nullable = false)
    private String categoria;

    @Column(name="ativo", nullable = false)
    private boolean ativo;

    @ManyToOne
    @JoinColumn(name="idempresa",nullable = false)
    private Empresa empresa;
}
