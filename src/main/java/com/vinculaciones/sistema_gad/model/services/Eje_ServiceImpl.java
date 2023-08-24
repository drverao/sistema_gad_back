package com.vinculaciones.sistema_gad.model.services;


import com.vinculaciones.sistema_gad.model.dto.Eje_DTO;
import com.vinculaciones.sistema_gad.model.entity.Eje;
import com.vinculaciones.sistema_gad.model.repository.EjeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Eje_ServiceImpl extends GenericServiceImpl<Eje, Long> implements Eje_Service {

    @Autowired
    private EjeRepository repository;

    @Override
    public CrudRepository<Eje, Long> getDao() {
        return repository;
    }

    @Override
    public List<Eje> listar() {
        return repository.listarEje();
    }
    @Override
    public List<Eje_DTO> buscarEjesPorNombreDTO(String nombre) {
        List<Object[]> resultados = repository.buscarEjesPorNombre(nombre);
        List<Eje_DTO> ejesEncontrados = new ArrayList<>();

        for (Object[] resultado : resultados) {
            Eje_DTO ejeDTO = new Eje_DTO(
                    (Long) resultado[0],
                    (String) resultado[1]
            );
            ejesEncontrados.add(ejeDTO);
        }
        return ejesEncontrados;
    }


}
