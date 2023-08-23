package com.vinculaciones.sistema_gad.model.services;

import com.vinculaciones.sistema_gad.model.dto.ObjetivoPdot_DTO;
import com.vinculaciones.sistema_gad.model.entity.Objetivo_pdot;
import com.vinculaciones.sistema_gad.model.entity.Rol;
import com.vinculaciones.sistema_gad.model.repository.ObjetivoPdotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ObjetivoPdot_ServiceImpl extends GenericServiceImpl<Objetivo_pdot, Long> implements ObjetivoPdot_Service {

    @Autowired
    private ObjetivoPdotRepository repository;

    @Override
    public CrudRepository<Objetivo_pdot, Long> getDao() {
        return repository;
    }

    @Override
    public List<Objetivo_pdot> listarObjetivosPdots() {
        return repository.listarObjetivosPdots();
    }

    @Override
    public Objetivo_pdot obtenerObjetivoPdotId(Long id) {
        return repository.obtenerObjetivoPdotId(id);
    }

    @Override
    public List<ObjetivoPdot_DTO> buscarObjetivosPdotsPorNombre(String nombre) {
        List<Object[]> resultados = repository.buscarObjetivosPdotsPorNombre(nombre);
        List<ObjetivoPdot_DTO> objetivosEncontrados = new ArrayList<>();

        for (Object[] resultado : resultados) {
            ObjetivoPdot_DTO objetivoDTO = new ObjetivoPdot_DTO(
                    (Long) resultado[0],
                    (String) resultado[1],
                    (String) resultado[2]
            );
            objetivosEncontrados.add(objetivoDTO);
        }
        return objetivosEncontrados;
    }
}
