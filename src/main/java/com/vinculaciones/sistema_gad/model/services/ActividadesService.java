package com.vinculaciones.sistema_gad.model.services;

import com.vinculaciones.sistema_gad.model.entity.Actividades;

import java.util.List;

public interface ActividadesService extends GenericService<Actividades, Long>{

    public List<Actividades> listarActividades();
}
