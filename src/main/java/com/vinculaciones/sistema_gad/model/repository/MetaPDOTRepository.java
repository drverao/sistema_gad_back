package com.vinculaciones.sistema_gad.model.repository;


import com.vinculaciones.sistema_gad.model.entity.MetaPDOT;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MetaPDOTRepository extends JpaRepository<MetaPDOT, Long> {
    @Query(value = "SELECT * from metapdot where visible =true ORDER BY nombre ASC", nativeQuery = true)
    List<MetaPDOT> listarMetaPDOTs();
}
