package br.com.thaynara.was.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode

@Embeddable
public class ResponsavelAlunoId implements Serializable {

    private Long idResponsavel;
    private Long idAluno;
}
