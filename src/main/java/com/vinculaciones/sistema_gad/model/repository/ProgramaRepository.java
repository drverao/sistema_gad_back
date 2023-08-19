package com.vinculaciones.sistema_gad.model.repository;


import com.vinculaciones.sistema_gad.model.entity.Programa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProgramaRepository extends JpaRepository<Programa, Long> {
    @Query(value = "SELECT * from programa where visible =true ORDER BY nombre ASC", nativeQuery = true)
    List<Programa> listarProgramas();
}
