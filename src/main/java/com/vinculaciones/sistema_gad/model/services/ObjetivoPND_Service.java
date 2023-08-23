package com.vinculaciones.sistema_gad.model.services;



import com.vinculaciones.sistema_gad.model.entity.ObjetivoPND;

import java.util.List;

public interface ObjetivoPND_Service extends GenericService<ObjetivoPND, Long>{
    public List<ObjetivoPND> listar();
    List<ObjetivoPND> buscarPorNombre(String nombre);

}
