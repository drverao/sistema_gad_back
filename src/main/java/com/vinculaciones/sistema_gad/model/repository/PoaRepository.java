package com.vinculaciones.sistema_gad.model.repository;

import com.vinculaciones.sistema_gad.model.entity.Poa;
import com.vinculaciones.sistema_gad.model.entity.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PoaRepository extends JpaRepository<Poa, Long> {
    @Query(value = "SELECT * from poa where visible =true ORDER BY nombre ASC", nativeQuery = true)
    List<Poa> listarPoas();

    @Query(value = "SELECT * FROM poa WHERE id_poa= :id AND visible = true", nativeQuery = true)
    Poa obtenerPoaId(@Param("id") Long id);
}
