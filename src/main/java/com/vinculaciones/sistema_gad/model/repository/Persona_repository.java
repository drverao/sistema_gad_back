package com.vinculaciones.sistema_gad.model.repository;

import com.vinculaciones.sistema_gad.model.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface Persona_repository extends JpaRepository<Persona, Long> {
    @Query(value = "SELECT * FROM persona p JOIN usuario u ON p.id_persona = u.id_persona WHERE u.username = :username", nativeQuery = true)
    public Persona obtenerPersonaPorNombreUsuario(String username);

    @Query(value = "SELECT * FROM persona WHERE cedula = :cedula AND visible = true", nativeQuery = true)
    Persona findByCedula(@Param("cedula") String cedula);

    @Query(value = "SELECT * FROM persona WHERE id_persona = :id AND visible = true", nativeQuery = true)
    Persona obtenerPersonaId(@Param("id") Long id);

}
