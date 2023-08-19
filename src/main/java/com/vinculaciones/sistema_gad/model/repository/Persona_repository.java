package com.vinculaciones.sistema_gad.model.repository;

import com.vinculaciones.sistema_gad.model.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Persona_repository extends JpaRepository<Persona, Long> {
    @Query(value = "SELECT * FROM persona p JOIN usuario u ON p.id_persona = u.id_persona WHERE u.username = :username", nativeQuery = true)
    public Persona obtenerPersona(String username);
    
    @Query(value = "SELECT * FROM persona p JOIN usuario u ON p.id_persona = u.id_persona WHERE u.id = :id", nativeQuery = true)
    public Persona obtenerPersonaUsuario(Long id);

    public Persona findByCedula(String cedula);

}
