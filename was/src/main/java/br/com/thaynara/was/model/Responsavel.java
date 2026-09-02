package br.com.thaynara.was.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="responsavel")
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Responsavel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name="nome", length = 70, nullable = false)
    private String nome;

    @Column(name="telefone",length = 20, nullable = false)
    private String telefone;

    @Column(name="cpf",length = 14, nullable = false)
    private String cpf;

    @OneToMany(mappedBy = "responsavel")
    private List<ResponsavelAluno> alunos = new ArrayList<>();

}
