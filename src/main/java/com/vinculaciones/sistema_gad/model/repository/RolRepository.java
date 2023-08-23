package com.vinculaciones.sistema_gad.model.repository;

import com.vinculaciones.sistema_gad.model.entity.Persona;
import com.vinculaciones.sistema_gad.model.entity.Poa;
import com.vinculaciones.sistema_gad.model.entity.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RolRepository extends JpaRepository<Rol,Long> {
    @Query(value = "SELECT * from rol where visible =true", nativeQuery = true)
    List<Rol> listarRoles();

    @Query(value = "SELECT * FROM rol WHERE id_rol= :id AND visible = true", nativeQuery = true)
    Rol obtenerRolId(@Param("id") Long id);
}
