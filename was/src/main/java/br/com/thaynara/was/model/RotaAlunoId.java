package br.com.thaynara.was.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode

@Embeddable
public class RotaAlunoId implements Serializable {

    private Long idRota;
    private Long idAluno;
}
