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
@Table(name = "eje")
public class Eje implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_eje")
    private Long id_eje;

    @Column(name = "nombre", length = 200)
    private String nombre;

    @Column(name = "visible")
    private boolean visible;

   @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "eje")
    @JsonIgnore
    private Set<ObjetivoPND> lista_objetivosPNDS = new HashSet<>();

}
