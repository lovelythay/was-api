package br.com.thaynara.was.model;

import br.com.thaynara.was.enums.ServicoEnum;
import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalTime;

@Entity
@Table(name = "rota")
public class Rota implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "nome", length = 30)
    private String nome;

    @Enumerated(EnumType.STRING)
    @Column(name="tipo_servico", nullable = false)
    private ServicoEnum tipoServico;

    @Column(name = "quilometragem",  precision = 10, scale = 2, nullable = false)
    private BigDecimal quilometragem;

    @Column(name = "horario_ida", nullable = false)
    private LocalTime horarioIda;

    @Column(name = "horario_volta", nullable = false)
    private LocalTime horarioVolta;

    @Column(name = "turno", length = 20, nullable = false)
    private String turno;

    @ManyToOne
    @JoinColumn(name="idempresa")
    private Empresa empresa;

    @ManyToOne
    @JoinColumn(name="idcontrato_prefeitura")
    private ContratoPrefeitura contratoPrefeitura;
}
