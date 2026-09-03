package br.com.thaynara.was.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name="contrato_prefeitura")
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class ContratoPrefeitura implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "numero_licitacao", length = 50, nullable = false)
    private String numeroLicitacao;

    @Column(name = "modalidade_licitacao", length = 50, nullable = false)
    private String modalidadeLicitacao;

    @Column(name = "numero_processo_administrativo", length = 50, nullable = false)
    private String numeroProcessoAdministrativo;

    @Column(name = "orgao_responsavel", length = 60, nullable = false)
    private String orgaoResponsavel;

    @Column(name = "data_inicio",nullable = false)
    private LocalDate dataInicio;

    @Column(name = "data_validade", nullable = false)
    private LocalDate dataValidade;

    @Column(name = "valor_km", precision = 10, scale = 2, nullable = false)
    private BigDecimal valorKm;

    @Column(name = "status", length = 30, nullable = false)
    private String status;

    @Column(name = "ativo", nullable = false)
    private boolean ativo;

    @ManyToOne
    @JoinColumn(name="empresa", nullable = false)
    private Empresa empresa;

}
