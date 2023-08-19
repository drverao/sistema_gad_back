package com.vinculaciones.sistema_gad.model.services;

import com.vinculaciones.sistema_gad.model.entity.DetalleTrimestre;
import com.vinculaciones.sistema_gad.model.repository.DetalleTrimestreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class DetalleTrimestreServiceImpl extends GenericServiceImpl<DetalleTrimestre, Long> implements DetalleTrimestreService{

    @Autowired
    DetalleTrimestreRepository detalleTrimestreRepository;
    @Override
    public CrudRepository<DetalleTrimestre, Long> getDao() {
        return detalleTrimestreRepository;
    }
}
