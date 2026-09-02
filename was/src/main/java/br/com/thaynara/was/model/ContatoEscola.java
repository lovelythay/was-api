package br.com.thaynara.was.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name="contato_escola")
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class ContatoEscola implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "nome", length = 70)
    private String nome;

    @Column(name = "telefone", length = 20)
    private String telefone;

    @Column(name="cargo", length = 50)
    private String cargo;

    @ManyToOne
    @JoinColumn(name="idescola")
    private Escola escola;
}
