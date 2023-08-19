package com.vinculaciones.sistema_gad.model.services;


import com.vinculaciones.sistema_gad.model.entity.Indicador;
import com.vinculaciones.sistema_gad.model.repository.IndicadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Indicador_ServiceImpl extends GenericServiceImpl<Indicador, Long> implements Indicador_Service {

    @Autowired
    private IndicadorRepository repository;

    @Override
    public CrudRepository<Indicador, Long> getDao() {
        return repository;
    }

    @Override
    public List<Indicador> listar() {
        return repository.listarIndicadores();
    }
}
