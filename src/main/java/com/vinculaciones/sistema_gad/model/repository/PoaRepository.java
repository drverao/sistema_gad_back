package com.vinculaciones.sistema_gad.model.repository;

import com.vinculaciones.sistema_gad.model.entity.Poa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PoaRepository extends JpaRepository<Poa, Long> {
    @Query(value = "SELECT * from poa where visible =true ORDER BY nombre ASC", nativeQuery = true)
    List<Poa> listarPoas();
}
