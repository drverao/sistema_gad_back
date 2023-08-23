package com.vinculaciones.sistema_gad.model.services;


import com.vinculaciones.sistema_gad.model.dto.Indicador_DTO;
import com.vinculaciones.sistema_gad.model.entity.Indicador;
import com.vinculaciones.sistema_gad.model.repository.IndicadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    @Override
    public Indicador obtenerIndicadorId(Long id) {
        return repository.obtenerIndicadorId(id);
    }

    @Override
    public List<Indicador_DTO> buscarIndicadoresPorNombre(String nombre) {
        List<Object[]> resultados = repository.buscarIndicadoresPorNombre(nombre);
        List<Indicador_DTO> indicadoresEncontrados = new ArrayList<>();

        for (Object[] resultado : resultados) {
            Indicador_DTO imdicadorDTO = new Indicador_DTO(
                    (Long) resultado[0],
                    (String) resultado[1],
                    (String) resultado[2],
                    (String) resultado[3]
            );
            indicadoresEncontrados.add(imdicadorDTO);
        }
        return indicadoresEncontrados;
    }
}
