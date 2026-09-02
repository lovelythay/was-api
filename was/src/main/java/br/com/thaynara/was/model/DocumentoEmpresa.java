package br.com.thaynara.was.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name="documento_empresa")
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class DocumentoEmpresa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name="tipo", length = 50, nullable = false)
    private String tipo;

    @Column(name="emissao", nullable = false)
    private LocalDate emissao;

    @Column(name="validade", nullable = false)
    private LocalDate validade;

    @ManyToOne
    @JoinColumn(name="empresa", nullable = false)
    private Empresa empresa;
}
