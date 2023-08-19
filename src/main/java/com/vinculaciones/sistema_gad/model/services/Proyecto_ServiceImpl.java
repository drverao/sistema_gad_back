package com.vinculaciones.sistema_gad.model.services;


import com.vinculaciones.sistema_gad.model.entity.Proyecto;
import com.vinculaciones.sistema_gad.model.repository.ProyectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Proyecto_ServiceImpl extends GenericServiceImpl<Proyecto, Long> implements Proyecto_Service {

    @Autowired
    private ProyectoRepository repository;

    @Override
    public CrudRepository<Proyecto, Long> getDao() {
        return repository;
    }

    @Override
    public List<Proyecto> listar() {
        return repository.listarProyectos();
    }
}
