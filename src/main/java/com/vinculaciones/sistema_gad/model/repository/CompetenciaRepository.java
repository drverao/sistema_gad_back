package com.vinculaciones.sistema_gad.model.repository;

import com.vinculaciones.sistema_gad.model.entity.Competencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CompetenciaRepository extends JpaRepository<Competencia, Long> {
    @Query(value = "SELECT * from competencia where visible =true ORDER BY nombre ASC", nativeQuery = true)
    List<Competencia> listarCompetencias();
}
