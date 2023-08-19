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
@Table(name = "programa")
public class Programa implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_programa")
    private Long id_objetivopnd;
    @Column(name = "nombre", length = 200)
    private String nombre;
    @Column(name = "descripcion", length = 1000)
    private String descripcion;
    @Column(name = "visible")
    private boolean visible;


    //Relacion a proyecto
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "programa")
    @JsonIgnore
    private Set<Proyecto> lista_proyectos = new HashSet<>();
}
