package com.vinculaciones.sistema_gad.model.repository;

import com.vinculaciones.sistema_gad.model.entity.Objetivo_pdot;
import com.vinculaciones.sistema_gad.model.entity.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ObjetivoPdotRepository extends JpaRepository<Objetivo_pdot, Long> {
    @Query(value = "SELECT * from objetivospdot where visible =true ORDER BY nombre ASC", nativeQuery = true)
    List<Objetivo_pdot> listarObjetivosPdots();

    @Query(value = "SELECT * FROM objetivospdot WHERE id_objetivo_pdot= :id AND visible = true", nativeQuery = true)
    Objetivo_pdot obtenerObjetivoPdotId(@Param("id") Long id);
}
