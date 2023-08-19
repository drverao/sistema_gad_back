package com.vinculaciones.sistema_gad.model.services;

import com.vinculaciones.sistema_gad.model.entity.Objetivo_pdot;

import java.util.List;

public interface ObjetivoPdot_Service extends GenericService<Objetivo_pdot, Long>{
    public List<Objetivo_pdot> listarObjetivosPdots();
}
