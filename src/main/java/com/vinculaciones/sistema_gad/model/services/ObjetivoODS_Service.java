package com.vinculaciones.sistema_gad.model.services;



import com.vinculaciones.sistema_gad.model.entity.ObjetivoODS;

import java.util.List;

public interface ObjetivoODS_Service extends GenericService<ObjetivoODS, Long>{
    public List<ObjetivoODS> listar();
    List<ObjetivoODS> buscarPorNombre(String nombre);

}
