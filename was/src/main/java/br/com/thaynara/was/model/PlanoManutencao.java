package br.com.thaynara.was.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "plano_manutencao")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class PlanoManutencao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "tipo_servico", length = 100, nullable = false)
    private String tipoServico;

    @Column(name = "intervalo_km", nullable = false)
    private Integer intervaloKm;

    @Column(name = "intervalo_meses", nullable = false)
    private Integer intervaloMeses;

    @Column(name = "km_ultima_execucao", nullable = false)
    private Integer kmUltimaExecucao;

    @Column(name = "data_ultima_execucao", nullable = false)
    private LocalDate dataUltimaExecucao;

    @ManyToOne
    @JoinColumn(name = "idveiculo", nullable = false)
    private Veiculo veiculo;
}
