package com.vinculaciones.sistema_gad.model.services;

import com.vinculaciones.sistema_gad.model.entity.DetalleTrimestre;

import java.util.List;

public interface DetalleTrimestreService extends GenericService<DetalleTrimestre, Long>{

    List<DetalleTrimestre> listarDetalleTrimestres();
}
