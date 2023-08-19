package com.vinculaciones.sistema_gad.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "metapdot")
public class MetaPDOT implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_meta_pdot")
    private Long id_objetivopnd;

    @Column(name = "nombre", length = 200)
    private String nombre;

    @Column(name = "descripcion", length = 1000)
    private String descripcion;

    @Column(name = "porcentaje_meta")
    private double porcentaje_meta;

    @Column(name = "visible")
    private boolean visible;



   /* @ManyToOne(fetch = FetchType.EAGER)
   @JoinColumn(name="id_objetivopdot")
    private ObjetivoPDOT objetivopdot;



    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "metapdot")
    @JsonIgnore
    private Set<Indicadores> lista_indicadores = new HashSet<>();

    */
}
