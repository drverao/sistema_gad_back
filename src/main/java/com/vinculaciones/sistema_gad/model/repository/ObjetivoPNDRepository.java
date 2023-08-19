package com.vinculaciones.sistema_gad.model.repository;


import com.vinculaciones.sistema_gad.model.entity.ObjetivoPND;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ObjetivoPNDRepository extends JpaRepository<ObjetivoPND, Long> {
    @Query(value = "SELECT * from objetivopnd where visible =true ORDER BY nombre ASC", nativeQuery = true)
    List<ObjetivoPND> listarObjetivosPNDS();
}
