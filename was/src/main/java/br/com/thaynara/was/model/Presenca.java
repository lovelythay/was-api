package br.com.thaynara.was.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "presenca")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Presenca implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne
    @JoinColumn(name="idexecucao_rota", nullable = false)
    private ExecucaoRota execucaoRota;

    @ManyToOne
    @JoinColumn(name="idaluno", nullable = false)
    private Aluno aluno;

    @Column(name="presenca_ida", nullable = false)
    private boolean presencaIda;

    @Column(name="presenca_volta", nullable = false)
    private boolean presencaVolta;
}
