package com.jasp.deuda.models.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "creditos_en_periodo")
public class CreditoEnPeriodo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_credito_en_periodo", updatable = false)
    private Long idCreditoEnPeriodo;

    @Column(name = "colocacion_periodo")
    private Double colocacionPeriodo;

    @Column(name = "amortizacion_periodo")
    private Double amortizacionPeriodo;

    @Column(name = "interes_periodo")
    private Double interesPeriodo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_credito", foreignKey = @ForeignKey(name = "FK_CREDITO_ID"))
    private Credito credito;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_periodo", referencedColumnName = "id_periodo", foreignKey = @ForeignKey(name = "FK_PERIODO_ID"))
    private Periodo periodo;



}
