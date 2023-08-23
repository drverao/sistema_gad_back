package com.vinculaciones.sistema_gad.model.services;



import com.vinculaciones.sistema_gad.model.dto.Componente_DTO;
import com.vinculaciones.sistema_gad.model.dto.MetaPdot_DTO;
import com.vinculaciones.sistema_gad.model.entity.MetaPDOT;
import com.vinculaciones.sistema_gad.model.entity.Objetivo_pdot;

import java.util.List;

public interface MetaPDOT_Service extends GenericService<MetaPDOT, Long>{
    public List<MetaPDOT> listar();

    public MetaPDOT obtenerMetaPdotId(Long id);
    List<MetaPdot_DTO> buscarMetasPdotsPorNombre(String nombre);
}
