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
@Table(name = "detalles_tipo_deuda")
public class DetalleTipoDeuda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detalle_tipo_deuda", updatable = false)
    private Long idDetalleTipoDeuda;

    @Column(name = "detalle_tipo_deuda")
    private String detalleTipoDeuda;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_credito", foreignKey = @ForeignKey(name = "FK_CREDITO_ID"))
    private Credito credito;
}
