package com.vinculaciones.sistema_gad.model.services;

import com.vinculaciones.sistema_gad.model.entity.Trimestre;

import java.util.List;

public interface TrimestreService extends GenericService<Trimestre, Long>{

    public List<Trimestre> listarTrimestres();
}
