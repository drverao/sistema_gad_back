package com.vinculaciones.sistema_gad.model.services;

import com.vinculaciones.sistema_gad.model.dto.Competencia_DTO;
import com.vinculaciones.sistema_gad.model.entity.Competencia;
import com.vinculaciones.sistema_gad.model.repository.CompetenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    @Override
    public Competencia obtenerCompetenciaId(Long id) {
        return repository.obtenerCompetenciaId(id);
    }
    @Override
    public List<Competencia_DTO> buscarCompetenciasPorNombreDTO(String nombre) {
        List<Object[]> resultados = repository.buscarCompetenciasPorNombre(nombre);
        List<Competencia_DTO> competenciasEncontradas = new ArrayList<>();

        for (Object[] resultado : resultados) {
            Competencia_DTO competenciaDTO = new Competencia_DTO(
                    (Long) resultado[0],
                    (String) resultado[1]
            );
            competenciasEncontradas.add(competenciaDTO);
        }
        return competenciasEncontradas;
    }

}
