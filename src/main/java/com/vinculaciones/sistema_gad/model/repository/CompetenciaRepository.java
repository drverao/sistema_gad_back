package com.vinculaciones.sistema_gad.model.repository;

import com.vinculaciones.sistema_gad.model.entity.Competencia;
import com.vinculaciones.sistema_gad.model.entity.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CompetenciaRepository extends JpaRepository<Competencia, Long> {
    @Query(value = "SELECT * from competencia where visible =true ORDER BY nombre ASC", nativeQuery = true)
    List<Competencia> listarCompetencias();

    @Query(value = "SELECT * FROM competencia WHERE id_competencia= :id AND visible = true", nativeQuery = true)
    Competencia obtenerCompetenciaId(@Param("id") Long id);
}
