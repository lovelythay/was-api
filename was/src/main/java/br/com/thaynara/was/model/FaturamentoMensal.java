package br.com.thaynara.was.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.YearMonth;

@Entity
@Table(name="faturamento_mensal")
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class FaturamentoMensal implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "mes_ano", nullable = false)
    private YearMonth mesAno;

    @Column(name = "valor_particular",  precision = 10, scale = 2, nullable = false)
    private BigDecimal valorParticular;

    @Column(name = "valor_prefeitura",  precision = 10, scale = 2, nullable = false)
    private BigDecimal valorPrefeitura;

    @Column(name = "valor_total",  precision = 10, scale = 2, nullable = false)
    private BigDecimal valorTotal;

    @Column(name = "data_fechamento")
    private LocalDate dataFechamento;

    @Column(name = "status", nullable = false)
    private boolean status;

    @ManyToOne
    @JoinColumn(name = "idempresa", nullable = false)
    private Empresa empresa;
}
