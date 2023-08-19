package com.vinculaciones.sistema_gad.model.repository;


import com.vinculaciones.sistema_gad.model.entity.ModeloPOA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ModeloPOARepository extends JpaRepository<ModeloPOA, Long> {
    @Query(value = "SELECT * from modelopoa where visible =true ORDER BY nombre ASC", nativeQuery = true)
    List<ModeloPOA> listarModelosPOA();
}
