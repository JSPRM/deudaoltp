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
@Table(name = "creditos")
public class Credito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_credito", updatable = false)
    private Long idCredito;

    @Column(name = "inicio_credito")
    private String inicioCredito;

    @Column(name = "fin_credito")
    private String finCredito;

    @Column(name = "disposicion_inicial_credito")
    private Double disposicionInicialCredito;

}
