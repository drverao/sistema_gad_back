package com.vinculaciones.sistema_gad.model.services;


import com.vinculaciones.sistema_gad.model.entity.Poa;
import com.vinculaciones.sistema_gad.model.entity.Rol;

import java.util.List;

public interface RolService extends GenericService<Rol, Long>{
    public List<Rol> listarRoles();
}
