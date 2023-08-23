package com.vinculaciones.sistema_gad.model.services;


import com.vinculaciones.sistema_gad.model.entity.ObjetivoPND;
import com.vinculaciones.sistema_gad.model.repository.ObjetivoPNDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ObjetivoPND_ServiceImpl extends GenericServiceImpl<ObjetivoPND, Long> implements ObjetivoPND_Service {

    @Autowired
    private ObjetivoPNDRepository repository;

    @Override
    public CrudRepository<ObjetivoPND, Long> getDao() {
        return repository;
    }

    @Override
    public List<ObjetivoPND> listar() {
        return repository.listarObjetivosPNDS();
    }
    @Override
    public List<ObjetivoPND> buscarPorNombre(String nombre) {
        return repository.findByNombreContaining(nombre);
    }

}
