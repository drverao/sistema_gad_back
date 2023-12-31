package com.vinculaciones.sistema_gad.model.services;

import com.vinculaciones.sistema_gad.model.dto.Componente_DTO;
import com.vinculaciones.sistema_gad.model.entity.Componente;
import com.vinculaciones.sistema_gad.model.repository.ComponenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class    Componente_ServiceImpl extends GenericServiceImpl<Componente, Long> implements Componente_Service {

    @Autowired
    private ComponenteRepository repository;

    @Override
    public CrudRepository<Componente, Long> getDao() {
        return repository;
    }

    @Override
    public List<Componente> listar() {
        return repository.listarComponentes();
    }

    @Override
    public Componente obtenerComponenteId(Long id) {
        return repository.obtenerComponenteId(id);
    }

    @Override
    public List<Componente_DTO> buscarComponentesPorNombre(String nombre) {
        List<Object[]> resultados = repository.buscarComponentesPorNombre(nombre);
        List<Componente_DTO> componentesEncontrados = new ArrayList<>();

        for (Object[] resultado : resultados) {
            Componente_DTO componenteDTO = new Componente_DTO(
                    (Long) resultado[0],
                    (String) resultado[1],
                    (String) resultado[2],
                    (String) resultado[3]
            );
            componentesEncontrados.add(componenteDTO);
        }
        return componentesEncontrados;
    }
}
