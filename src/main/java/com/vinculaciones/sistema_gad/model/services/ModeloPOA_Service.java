package com.vinculaciones.sistema_gad.model.services;



import com.vinculaciones.sistema_gad.model.entity.ModeloPOA;

import java.util.List;

public interface ModeloPOA_Service extends GenericService<ModeloPOA, Long>{
    public List<ModeloPOA> listar();
}
