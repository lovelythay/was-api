package br.com.thaynara.was.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name="veiculo")
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Veiculo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="placa", length = 10, nullable = false)
    private String placa;

    @Column(name="renavam", length = 20, nullable = false)
    private String renavam;

    @Column(name="marca", length = 50, nullable = false)
    private String marca;

    @Column(name="modelo", length = 50, nullable = false)
    private String modelo;

    @Column(name="ano_fabricacao", nullable = false)
    private Integer anoFabricacao;

    @Column(name="ano_modelo", nullable = false)
    private Integer anoModelo;

    @Column(name="tipo_veiculo",length = 30, nullable = false)
    private String tipoVeiculo;

    @Column(name="kilometragem", nullable = false)
    private Integer kilometragem;

    @Column(name="situacao", length = 30, nullable = false)
    private String situacao;

    @Column(name="ativo", nullable = false)
    private boolean ativo;

    @ManyToOne
    @JoinColumn(name="idempresa", nullable = false)
    private Empresa empresa;
}
