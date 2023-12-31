package com.vinculaciones.sistema_gad.model.services;



import com.vinculaciones.sistema_gad.model.dto.Programa_DTO;
import com.vinculaciones.sistema_gad.model.entity.Programa;

import java.util.List;

public interface Programa_Service extends GenericService<Programa, Long>{
    public List<Programa> listar();
    List<Programa_DTO> buscarProgramasPorNombreDTO(String nombre);

}
