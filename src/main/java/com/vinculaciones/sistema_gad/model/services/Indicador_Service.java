package com.vinculaciones.sistema_gad.model.services;



import com.vinculaciones.sistema_gad.model.dto.Indicador_DTO;
import com.vinculaciones.sistema_gad.model.entity.Indicador;
import com.vinculaciones.sistema_gad.model.entity.Objetivo_pdot;

import java.util.List;

public interface Indicador_Service extends GenericService<Indicador, Long>{
    public List<Indicador> listar();

    public Indicador obtenerIndicadorId(Long id);
    List<Indicador_DTO> buscarIndicadoresPorNombre(String nombre);
}
