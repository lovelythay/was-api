package br.com.thaynara.was.model;

import br.com.thaynara.was.enums.ServicoEnum;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="aluno")
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Aluno implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "nome", length = 70, nullable = false)
    private String nome;

    @Column(name="data_nascimento", nullable = false)
    private LocalDate dataNascimento;

    @Column(name="condicao_media", length = 100)
    private String condicaoMedica;

    @Column(name="medicamentos",length = 100)
    private String medicamentos;

    @Column(name="ativo",nullable = false)
    private boolean ativo;

    @Enumerated(EnumType.STRING)
    @Column(name="tipo_aluno", nullable = false)
    private ServicoEnum tipoAluno;

    @ManyToOne
    @JoinColumn(name="idendereco", nullable = false)
    private Endereco endereco;

    @ManyToOne
    @JoinColumn(name="idescola", nullable = false)
    private Escola escola;

    @OneToMany(mappedBy = "aluno")
    private List<ResponsavelAluno> responsaveis = new ArrayList<>();
}
