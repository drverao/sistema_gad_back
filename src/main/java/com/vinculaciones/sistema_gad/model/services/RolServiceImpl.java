package com.vinculaciones.sistema_gad.model.services;

import com.vinculaciones.sistema_gad.model.entity.Rol;
import com.vinculaciones.sistema_gad.model.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolServiceImpl extends GenericServiceImpl<Rol, Long> implements RolService{
    @Autowired
    private RolRepository rolRepository;
    @Override
    public CrudRepository<Rol, Long> getDao() {
        return rolRepository;
    }

    @Override
    public List<Rol> listarRoles() {
        return rolRepository.listarRoles();
    }
}
