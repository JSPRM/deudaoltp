package com.jasp.deuda.models.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "acreedores")
public class Acreedor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_acreedor", updatable = false)
    private Long idAcreedor;

    @Column(name = "acreedor")
    private String acreedeor;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_credito", foreignKey = @ForeignKey(name = "FK_DEUDA_ID"))
    private Credito credito;

}
