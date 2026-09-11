package br.com.thaynara.was.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="escola")
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Escola implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name="nome", length = 70, nullable = false)
    private String nome;

    @ManyToOne
    @JoinColumn(name="idendereco", nullable = false)
    private Endereco endereco;

    @OneToMany(mappedBy = "escola")
    private List<ContatoEscola> contato = new ArrayList<>();
}
