package com.vinculaciones.sistema_gad.model.repository;

import com.vinculaciones.sistema_gad.model.entity.Evidencias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EvidenciasRepository extends JpaRepository<Evidencias, Long> {

    @Query(value = "SELECT * from evidencias where visible=true ORDER BY nombre ASC", nativeQuery = true)
    List<Evidencias> listarEvidencias();
}
