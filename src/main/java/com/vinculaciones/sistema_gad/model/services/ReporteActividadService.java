package com.vinculaciones.sistema_gad.model.services;

import com.vinculaciones.sistema_gad.model.entity.ReporteActividad;

import java.util.List;

public interface ReporteActividadService extends GenericService<ReporteActividad, Long>{

    public List<ReporteActividad> listarReporteActividades();
}
