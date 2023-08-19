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
@Table(name = "usuario")
public class Usuario{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    @Column(name = "visible")
    private boolean visible;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_persona")
    private Persona persona;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_rol")
    private Rol rol;


    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "usuario")
    @JsonIgnore
    private Set<Poa> lista_poas = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "usuario")
    @JsonIgnore
    private Set<ModeloPOA> lista_modelos = new HashSet<>();

    public Usuario() {
    }

    public Usuario(Long id) {
        super();
        this.id = id;
    }

    public Usuario(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

}