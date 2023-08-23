package com.vinculaciones.sistema_gad.model.repository;


import com.vinculaciones.sistema_gad.model.entity.Eje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EjeRepository extends JpaRepository<Eje, Long> {
    @Query(value = "SELECT * from eje where visible =true ORDER BY nombre ASC", nativeQuery = true)
    List<Eje> listarEje();

    @Query("SELECT e FROM Eje e WHERE e.nombre LIKE %:nombre% AND e.visible = true")
    List<Eje> findByNombreContaining(String nombre);

}
