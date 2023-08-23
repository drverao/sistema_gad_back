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
@Table(name = "persona",uniqueConstraints = {@UniqueConstraint(columnNames = "cedula")})

public class Persona implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona")
    private Long id_persona;
    @Column(name = "cedula")
    private String cedula;
    @Column(name = "primer_nombre")
    private String primer_nombre;
    @Column(name = "segundo_nombre")
    private String segundo_nombre;
    @Column(name = "primer_apellido")
    private String primer_apellido;
    @Column(name = "segundo_apellido")
    private String segundo_apellido;
    @Column(name = "correo")
    private String correo;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "celular")
    private String celular;
    @Column(name = "visible")
    private boolean visible;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "persona")
    @JsonIgnore
    private Set<Usuario> listausuarios = new HashSet<>();
}
