package br.com.thaynara.was.model;

import br.com.thaynara.was.enums.FuncionarioEnum;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name="funcionario")
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Funcionario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name="nome", length = 70, nullable = false)
    private String nome;

    @Column(name="cpf", length = 14, nullable = false)
    private String cpf;

    @Column(name="telefone", length = 20, nullable = false)
    private String telefone;

    @ManyToOne
    @JoinColumn(name="idendereco", nullable = false)
    private Endereco endereco;

    @Column(name="condicao_medica", length = 100)
    private String condicaoMedica;

    @Column(name="salario", precision = 10, scale = 2)
    private BigDecimal salario;

    @Column(name="diaria", precision = 10, scale = 2)
    private BigDecimal diaria;

    @Column(name = "ativo", nullable = false)
    private boolean ativo;

    @Column(name = "fixo", nullable = false)
    private boolean fixo;

    @Enumerated(EnumType.STRING)
    @Column(name="tipo_funcionario", nullable = false)
    private FuncionarioEnum tipoFuncionario;

    @Column(name="vencimento_cnh")
    private LocalDate vencimentoCnh;

    @Column(name="vencimento_toxicologico")
    private LocalDate vencimentoToxicologico;

    @Column(name="nome_contato_emergencia", length = 70, nullable = false)
    private String nomeContatoEmergencia;

    @Column(name="telefone_contato_emergencia", length=20, nullable = false)
    private String telefoneContatoEmergencia;

    @ManyToOne
    @JoinColumn(name="idempresa")
    private Empresa empresa;
}
