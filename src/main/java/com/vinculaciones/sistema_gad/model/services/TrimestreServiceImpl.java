package com.vinculaciones.sistema_gad.model.services;

import com.vinculaciones.sistema_gad.model.entity.Trimestre;
import com.vinculaciones.sistema_gad.model.repository.TrimestreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrimestreServiceImpl extends GenericServiceImpl<Trimestre, Long> implements TrimestreService{

    @Autowired
    TrimestreRepository trimestreRepository;
    @Override
    public CrudRepository<Trimestre, Long> getDao() {
        return trimestreRepository;
    }

    @Override
    public List<Trimestre> listarTrimestres() {
        return trimestreRepository.listarTrimestres();
    }
}
