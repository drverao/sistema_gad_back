package com.vinculaciones.sistema_gad.model.services;

import com.vinculaciones.sistema_gad.model.entity.Poa;
import java.util.List;

public interface Poa_Service extends GenericService<Poa, Long>{
    public List<Poa> listar();
}
