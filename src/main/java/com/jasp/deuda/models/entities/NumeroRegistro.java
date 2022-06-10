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
@Table(name = "numeros_registros")
public class NumeroRegistro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_numero_registro", updatable = false)
    private Long idNumeroRegistro;

    @Column(name = "no_registro")
    private String noRegistro;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_credito_en_periodo", foreignKey = @ForeignKey(name = "FK_CREDITO_EN_PERIODO_ID"))
    private CreditoEnPeriodo creditoEnPeriodo;
}
