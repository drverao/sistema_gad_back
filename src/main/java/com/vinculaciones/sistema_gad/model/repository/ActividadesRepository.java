package com.vinculaciones.sistema_gad.model.repository;

import com.vinculaciones.sistema_gad.model.entity.Actividades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Set;

public interface ActividadesRepository extends JpaRepository<Actividades, Long>{

    @Query(value = "SELECT * from actividades where visible = true ORDER BY nombre ASC", nativeQuery = true)
    List<Actividades> listarActividades();
}
