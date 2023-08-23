package com.vinculaciones.sistema_gad.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "rol")
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rol")
    private Long id_rol;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "visible")
    private boolean visible;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "rol")
    @JsonIgnore
    private Set<Usuario> usuarios = new HashSet<>();

}
