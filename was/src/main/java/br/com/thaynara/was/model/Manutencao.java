package br.com.thaynara.was.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "manutencao")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@AllArgsConstructor
public class Manutencao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name="tipo", length = 30, nullable = false)
    private String tipo;

    @Column(name="descricao", length = 100)
    private String descricao;

    @Column(name="data", nullable = false)
    private LocalDate data;

    @Column(name = "valor", precision = 10, scale = 2, nullable = false)
    private BigDecimal valor;

    @Column(name="situacao", nullable = false)
    private boolean situacao;

    @Column(name="oficina",length = 30)
    private String oficina;

    @ManyToOne
    @JoinColumn(name="idveiculo", nullable = false)
    private Veiculo veiculo;

    @ManyToOne
    @JoinColumn(name="idplano_manutencao")
    private PlanoManutencao planoManutencao;

}
