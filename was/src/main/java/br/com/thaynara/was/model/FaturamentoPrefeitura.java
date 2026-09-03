package br.com.thaynara.was.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name="faturamento_prefeitura")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class FaturamentoPrefeitura implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "competencia", nullable = false)
    private LocalDate competencia;

    @Column(name = "dias_letivos", nullable = false)
    private Integer diasLetivos;

    @Column(name = "valor_total",precision = 10, scale = 2, nullable = false)
    private BigDecimal valorTotal;

    @ManyToOne()
    @JoinColumn(name = "idcontrato_prefeitura", nullable = false)
    private ContratoPrefeitura contratoPrefeitura;
}
