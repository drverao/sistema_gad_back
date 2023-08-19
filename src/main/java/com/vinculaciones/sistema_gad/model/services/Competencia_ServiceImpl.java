package com.vinculaciones.sistema_gad.model.services;

import com.vinculaciones.sistema_gad.model.entity.Competencia;
import com.vinculaciones.sistema_gad.model.repository.CompetenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Competencia_ServiceImpl extends GenericServiceImpl<Competencia, Long> implements Competencia_Service {

    @Autowired
    private CompetenciaRepository repository;

    @Override
    public CrudRepository<Competencia, Long> getDao() {
        return repository;
    }

    @Override
    public List<Competencia> listar() {
        return repository.listarCompetencias();
    }
}
