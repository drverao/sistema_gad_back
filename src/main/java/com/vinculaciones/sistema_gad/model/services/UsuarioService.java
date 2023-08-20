package com.vinculaciones.sistema_gad.model.services;

import com.vinculaciones.sistema_gad.model.entity.Usuario;

import java.util.List;

public interface UsuarioService extends GenericService<Usuario, Long> {
    public Usuario obtenerUsuario(String username);

    public List<Usuario> listar();

    public Usuario obtenerUsuarioId(Long id);

}
