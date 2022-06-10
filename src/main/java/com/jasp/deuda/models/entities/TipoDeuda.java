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
@Table(name = "tipos_deuda")
public class TipoDeuda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_deuda", updatable = false)
    private Long idTipoDeuda;

    @Column(name = "tipo_deuda")
    private String tipoDeuda;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_credito", foreignKey = @ForeignKey(name = "FK_CREDITO_ID"))
    private Credito credito;

}
