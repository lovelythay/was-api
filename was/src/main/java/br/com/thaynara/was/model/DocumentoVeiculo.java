package br.com.thaynara.was.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="documento_veiculo")
public class DocumentoVeiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="tipo", length = 50, nullable = false)
    private String tipo;

    @Column(name="emissao", nullable = false)
    private LocalDate emissao;

    @Column(name="validade", nullable = false)
    private LocalDate validade;

    @ManyToOne
    @JoinColumn(name="idveiculo")
    private Veiculo veiculo;
}
