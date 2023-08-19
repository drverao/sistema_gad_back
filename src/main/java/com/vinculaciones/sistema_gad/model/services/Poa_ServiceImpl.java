package com.vinculaciones.sistema_gad.model.services;

import com.vinculaciones.sistema_gad.model.entity.Poa;
import com.vinculaciones.sistema_gad.model.repository.PoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Poa_ServiceImpl extends GenericServiceImpl<Poa, Long> implements Poa_Service {

    @Autowired
    private PoaRepository repository;

    @Override
    public CrudRepository<Poa, Long> getDao() {
        return repository;
    }

    @Override
    public List<Poa> listar() {
        return repository.listarPoas();
    }
}
