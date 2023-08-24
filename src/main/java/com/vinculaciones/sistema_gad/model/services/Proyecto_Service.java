package com.vinculaciones.sistema_gad.model.services;



import com.vinculaciones.sistema_gad.model.dto.ProyectoResumenDTO;
import com.vinculaciones.sistema_gad.model.entity.Proyecto;

import java.util.List;

public interface Proyecto_Service extends GenericService<Proyecto, Long>{
    public List<Proyecto> listar();

    public List<ProyectoResumenDTO> listarProyectosConRelaciones();
}
