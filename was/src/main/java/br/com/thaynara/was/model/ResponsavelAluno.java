package br.com.thaynara.was.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name="responsavel_aluno")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ResponsavelAluno implements Serializable {

    @EmbeddedId
    private ResponsavelAlunoId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("idResponsavel")
    @JoinColumn(name="idresponsavel")
    private Responsavel responsavel;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("idAluno")
    @JoinColumn(name="idaluno")
    private Aluno aluno;

    @Column(name="parentesco", length = 15, nullable = false)
    private String parentesco;

    @Column(name="financeiro", nullable = false)
    private boolean financeiro;

    @Column(name="legal", nullable = false)
    private boolean legal;
}
