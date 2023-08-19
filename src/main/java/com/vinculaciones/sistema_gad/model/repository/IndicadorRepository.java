package com.vinculaciones.sistema_gad.model.repository;


import com.vinculaciones.sistema_gad.model.entity.Indicador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IndicadorRepository extends JpaRepository<Indicador, Long> {
    @Query(value = "SELECT * from indicador where visible =true ORDER BY nombre ASC", nativeQuery = true)
    List<Indicador> listarIndicadores();
}
