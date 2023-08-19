package com.vinculaciones.sistema_gad.model.repository;

import com.vinculaciones.sistema_gad.model.entity.Objetivo_pdot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ObjetivoPdotRepository extends JpaRepository<Objetivo_pdot, Long> {
    @Query(value = "SELECT * from objetivospdot where visible =true ORDER BY nombre ASC", nativeQuery = true)
    List<Objetivo_pdot> listarObjetivosPdots();
}
