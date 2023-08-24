package com.vinculaciones.sistema_gad.model.services;


import com.vinculaciones.sistema_gad.model.dto.ObjetivoOds_DTO;
import com.vinculaciones.sistema_gad.model.entity.ObjetivoODS;
import com.vinculaciones.sistema_gad.model.repository.ObjetivoODSRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ObjetivoODS_ServiceImpl extends GenericServiceImpl<ObjetivoODS, Long> implements ObjetivoODS_Service {

    @Autowired
    private ObjetivoODSRepository repository;

    @Override
    public CrudRepository<ObjetivoODS, Long> getDao() {
        return repository;
    }

    @Override
    public List<ObjetivoODS> listar() {
        return repository.listarObjetivosODS();
    }
    @Override
    public List<ObjetivoOds_DTO> buscarObjetivosODSPorNombreDTO(String nombre) {
        List<Object[]> resultados = repository.buscarObjetivosODSPorNombre(nombre);
        List<ObjetivoOds_DTO> objetivosEncontrados = new ArrayList<>();

        for (Object[] resultado : resultados) {
            ObjetivoOds_DTO objetivoDTO = new ObjetivoOds_DTO(
                    (Long) resultado[0],
                    (String) resultado[1],
                    (String) resultado[2]
            );
            objetivosEncontrados.add(objetivoDTO);
        }
        return objetivosEncontrados;
    }


}
