package com.vinculaciones.sistema_gad.model.services;



import com.vinculaciones.sistema_gad.model.entity.MetaPDOT;

import java.util.List;

public interface MetaPDOT_Service extends GenericService<MetaPDOT, Long>{
    public List<MetaPDOT> listar();
}
