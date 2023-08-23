package com.vinculaciones.sistema_gad.model.repository;


import com.vinculaciones.sistema_gad.model.entity.ObjetivoPND;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ObjetivoPNDRepository extends JpaRepository<ObjetivoPND, Long> {
    @Query(value = "SELECT * from objetivopnd where visible =true ORDER BY nombre ASC", nativeQuery = true)
    List<ObjetivoPND> listarObjetivosPNDS();
    @Query(value = "SELECT id_objetivo_pnd, nombre, descripcion, id_eje, e.nombre FROM objetivopnd o JOIN eje e ON o.id_eje = e.id_eje WHERE LOWER(o.nombre) LIKE LOWER(CONCAT('%', :nombre, '%')) AND o.visible = true", nativeQuery = true)
    List<Object[]> buscarObjetivosPNDSPorNombre(@Param("nombre") String nombre);

}
