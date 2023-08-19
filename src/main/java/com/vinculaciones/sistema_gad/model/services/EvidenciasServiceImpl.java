package com.vinculaciones.sistema_gad.model.services;

import com.vinculaciones.sistema_gad.model.entity.Evidencias;
import com.vinculaciones.sistema_gad.model.repository.EvidenciasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class EvidenciasServiceImpl extends GenericServiceImpl<Evidencias, Long> implements EvidenciasService{

    @Autowired
    EvidenciasRepository evidenciasRepository;
    @Override
    public CrudRepository<Evidencias, Long> getDao() {
        return evidenciasRepository;
    }
}
