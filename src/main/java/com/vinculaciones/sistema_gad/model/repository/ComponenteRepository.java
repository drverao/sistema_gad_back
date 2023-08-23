package com.vinculaciones.sistema_gad.model.repository;

import com.vinculaciones.sistema_gad.model.dto.Componente_DTO;
import com.vinculaciones.sistema_gad.model.entity.Componente;
import com.vinculaciones.sistema_gad.model.entity.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ComponenteRepository extends JpaRepository<Componente, Long> {
    @Query(value = "SELECT * from componente where visible =true ORDER BY nombre ASC", nativeQuery = true)
    List<Componente> listarComponentes();

    @Query(value = "SELECT * FROM componente WHERE id_componente= :id AND visible = true", nativeQuery = true)
    Componente obtenerComponenteId(@Param("id") Long id);

    @Query(value = "SELECT id_componente, nombre, codigo, descripcion FROM componente WHERE LOWER(nombre) LIKE LOWER(CONCAT('%', :nombre, '%')) AND visible = true", nativeQuery = true)
    List<Object[]> buscarComponentesPorNombre(@Param("nombre") String nombre);

}
