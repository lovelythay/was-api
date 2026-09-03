package br.com.thaynara.was.model;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name="execucao_rota")
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class ExecucaoRota implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "data",nullable = false)
    private LocalDate data;

    @Column(name="observacoes", length = 100)
    private String observacoes;

    @ManyToOne
    @JoinColumn(name="idrota", nullable = false)
    private Rota rota;

    @ManyToOne
    @JoinColumn(name="idveiculo", nullable = false)
    private Veiculo veiculo;

    @ManyToOne
    @JoinColumn(name="idmotorista", nullable = false)
    private Funcionario motorista;

    @ManyToOne
    @JoinColumn(name="idmonitor")
    private Funcionario monitor;
}
