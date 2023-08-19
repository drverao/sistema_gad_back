package com.vinculaciones.sistema_gad.model.services;

import com.vinculaciones.sistema_gad.model.entity.ReporteActividad;
import com.vinculaciones.sistema_gad.model.repository.ReporteActividadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class ReporteActividadServiceImpl extends GenericServiceImpl<ReporteActividad, Long> implements ReporteActividadService{
    @Autowired
    ReporteActividadRepository reporteActividadRepository;
    @Override
    public CrudRepository<ReporteActividad, Long> getDao() {
        return reporteActividadRepository;
    }
}
