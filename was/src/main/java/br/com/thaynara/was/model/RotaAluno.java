package br.com.thaynara.was.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalTime;

@Entity
@Table(name="rota_aluno")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RotaAluno implements Serializable {

    @EmbeddedId
    private RotaAlunoId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("idRota")
    @JoinColumn(name="idrota")
    private Rota rota;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("idAluno")
    @JoinColumn(name="idaluno")
    private Aluno aluno;

    @Column(name="horario_embarque")
    private LocalTime horarioEmbarque;

    @Column(name="horario_desembarque")
    private LocalTime horarioDesembarque;

    @Column(name="endereco_embarque")
    private Endereco enderecoEmbarque;

    @Column(name="endereco_desembarque")
    private Endereco enderecoDesembarque;

    @Column(name = "ordem_embarque")
    private Integer ordemEmbarque;

    @Column(name = "ordem_desembarque")
    private Integer ordemDesembarque;

    @Column(name = "dias_uso", length = 30, nullable = false)
    private String diasUso;
}
