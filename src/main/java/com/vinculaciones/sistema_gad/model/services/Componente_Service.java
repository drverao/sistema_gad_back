package com.vinculaciones.sistema_gad.model.services;

import com.vinculaciones.sistema_gad.model.entity.Componente;

import java.util.List;

public interface Componente_Service extends GenericService<Componente, Long>{
    public List<Componente> listar();
}
