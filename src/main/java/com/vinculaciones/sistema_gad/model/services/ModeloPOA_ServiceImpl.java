package com.vinculaciones.sistema_gad.model.services;


import com.vinculaciones.sistema_gad.model.entity.ModeloPOA;
import com.vinculaciones.sistema_gad.model.repository.ModeloPOARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModeloPOA_ServiceImpl  extends GenericServiceImpl<ModeloPOA, Long> implements ModeloPOA_Service {

    @Autowired
    private ModeloPOARepository repository;

    @Override
    public CrudRepository<ModeloPOA, Long> getDao() {
        return repository;
    }

    @Override
    public List<ModeloPOA> listar() {
        return repository.listarModelosPOA();
    }
}
