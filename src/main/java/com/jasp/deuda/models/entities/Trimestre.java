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
@Table(name = "trimestres")
public class Trimestre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_trimestre", updatable = false)
    private Long idTrimestre;

    @Column(name = "trimestre")
    private String trimestre;

    @Column(name = "mes")
    private String mes;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_periodo", foreignKey = @ForeignKey(name = "FK_PERIODO_ID"))
    private Periodo periodo;

}
