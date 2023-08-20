package com.vinculaciones.sistema_gad.model.services;

import com.vinculaciones.sistema_gad.model.entity.Evidencias;

import java.util.List;

public interface EvidenciasService extends GenericService<Evidencias, Long>{

    public List<Evidencias> listarEvidencias();
}
