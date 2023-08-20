package com.vinculaciones.sistema_gad.model.services;


import com.vinculaciones.sistema_gad.model.dto.Componente_DTO;
import com.vinculaciones.sistema_gad.model.dto.MetaPdot_DTO;
import com.vinculaciones.sistema_gad.model.entity.MetaPDOT;
import com.vinculaciones.sistema_gad.model.entity.Objetivo_pdot;
import com.vinculaciones.sistema_gad.model.repository.MetaPDOTRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MetaPDOT_ServiceImpl extends GenericServiceImpl<MetaPDOT, Long> implements MetaPDOT_Service {

    @Autowired
    private MetaPDOTRepository repository;

    @Override
    public CrudRepository<MetaPDOT, Long> getDao() {
        return repository;
    }

    @Override
    public List<MetaPDOT> listar() {
        return repository.listarMetaPDOTs();
    }

    @Override
    public MetaPDOT obtenerMetaPdotId(Long id) {
        return repository.obtenerMetaPdotId(id);
    }

    @Override
    public List<MetaPdot_DTO> buscarMetasPdotsPorNombre(String nombre) {
        List<Object[]> resultados = repository.buscarMetasPdotsPorNombre(nombre);
        List<MetaPdot_DTO> metasEncontradas = new ArrayList<>();

        for (Object[] resultado : resultados) {
            MetaPdot_DTO metaDTO = new MetaPdot_DTO(
                    (Long) resultado[0],
                    (String) resultado[1],
                    (String) resultado[2],
                    (double) resultado[3]
            );
            metasEncontradas.add(metaDTO);
        }
        return metasEncontradas;
    }
}
