package com.vinculaciones.sistema_gad.model.services;



import com.vinculaciones.sistema_gad.model.dto.Eje_DTO;
import com.vinculaciones.sistema_gad.model.entity.Eje;

import java.util.List;

public interface Eje_Service extends GenericService<Eje, Long>{
    public List<Eje> listar();


    List<Eje_DTO> buscarEjesPorNombreDTO(String nombre);

}
