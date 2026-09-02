package br.com.thaynara.was.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name="empresa")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Empresa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name="cnpj", length = 18, nullable = false)
    private String cnpj;

    @Column(name="razao_social", length = 60, nullable = false)
    private String razaoSocial;

    @Column(name="nome_fantasia", length = 60, nullable = false)
    private String nomeFantasia;
}