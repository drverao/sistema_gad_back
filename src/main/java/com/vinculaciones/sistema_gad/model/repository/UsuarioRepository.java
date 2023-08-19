package com.vinculaciones.sistema_gad.model.repository;

import com.vinculaciones.sistema_gad.model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
        @Query(value = "SELECT * FROM usuario WHERE username = :username AND visible=true", nativeQuery = true)
        public Usuario findByUsername(String username);

        @Query(value = "SELECT * FROM usuario WHERE visible=true", nativeQuery = true)
        public List<Usuario> listar();
}
