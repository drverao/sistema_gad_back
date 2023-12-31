package com.vinculaciones.sistema_gad.model.services;

import com.vinculaciones.sistema_gad.model.dto.Competencia_DTO;
import com.vinculaciones.sistema_gad.model.entity.Competencia;

import java.util.List;

public interface Competencia_Service extends GenericService<Competencia, Long>{
    public List<Competencia> listar();

    public Competencia obtenerCompetenciaId(Long id);
    List<Competencia_DTO> buscarCompetenciasPorNombreDTO(String nombre);

}
