package com.vinculaciones.sistema_gad.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
@Table(name = "objetivospdot")
public class Objetivo_pdot implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_objetivo_pdot")
    private Long id_objetivopdto;
    @Column(name = "nombre", length = 200)
    private String nombre;
    @Column(name = "descripcion", length = 1000)
    private String descripcion;
    @Column(name = "visible")
    private boolean visible;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_componente")
    private Componente componente;

    /*
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "objetivopdot")
    @JsonIgnore
    private Set<MetaPDOT> lista_metaspdots = new HashSet<>();*/
}
