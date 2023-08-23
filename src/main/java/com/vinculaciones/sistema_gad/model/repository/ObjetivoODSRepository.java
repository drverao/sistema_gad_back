package com.vinculaciones.sistema_gad.model.repository;


import com.vinculaciones.sistema_gad.model.entity.ObjetivoODS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ObjetivoODSRepository extends JpaRepository<ObjetivoODS, Long> {
    @Query(value = "SELECT * from objetivo_ods where visible =true ORDER BY nombre ASC", nativeQuery = true)
    List<ObjetivoODS> listarObjetivosODS();
    @Query(value = "SELECT * FROM objetivo_ods WHERE nombre LIKE %?1% AND visible = true", nativeQuery = true)
    List<ObjetivoODS> findByNombreContaining(String nombre);

}
