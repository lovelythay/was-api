package br.com.thaynara.was.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name="endereco")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Endereco implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name="cep", length = 9, nullable = false)
    private String cep;

    @Column(name="bairro", length = 25, nullable = false)
    private String bairro;

    @Column(name="rua", length = 50, nullable = false)
    private String rua;

    @Column(name="numero", length=6, nullable=false)
    private String numero;
}
