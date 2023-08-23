package com.vinculaciones.sistema_gad.model.services;

import com.vinculaciones.sistema_gad.model.entity.Actividades;
import com.vinculaciones.sistema_gad.model.repository.ActividadesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActividadesServiceImpl extends GenericServiceImpl<Actividades, Long> implements ActividadesService{

    @Autowired
    ActividadesRepository actividadesRepository;
    @Override
    public CrudRepository<Actividades, Long> getDao() {
        return actividadesRepository;
    }

    @Override
    public List<Actividades> listarActividades() {
        return actividadesRepository.listarActividades();
    }
}
