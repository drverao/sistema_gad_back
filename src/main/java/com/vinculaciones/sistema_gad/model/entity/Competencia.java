package com.vinculaciones.sistema_gad.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "competencia")
public class Competencia implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_competencia")
    private Long id_competencia;
    @Column(name = "nombre", length = 200)
    private String nombre;
    @Column(name = "visible")
    private boolean visible;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "competencia")
    @JsonIgnore
    private Set<Proyecto> lista_proyectos = new HashSet<>();
}
