package com.vinculaciones.sistema_gad.model.services;



import com.vinculaciones.sistema_gad.model.entity.Indicador;

import java.util.List;

public interface Indicador_Service extends GenericService<Indicador, Long>{
    public List<Indicador> listar();
}
