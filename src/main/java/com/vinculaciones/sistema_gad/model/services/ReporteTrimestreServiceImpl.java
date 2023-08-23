package com.vinculaciones.sistema_gad.model.services;

import com.vinculaciones.sistema_gad.model.entity.ReporteTrimestre;
import com.vinculaciones.sistema_gad.model.repository.ReporteTrimestreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReporteTrimestreServiceImpl extends GenericServiceImpl<ReporteTrimestre, Long> implements ReporteTrimestreService{

    @Autowired
    ReporteTrimestreRepository reporteTrimestreRepository;
    @Override
    public CrudRepository<ReporteTrimestre, Long> getDao() {
        return reporteTrimestreRepository;
    }

    @Override
    public List<ReporteTrimestre> listarReporteTrimestres() {
        return reporteTrimestreRepository.listarReporteTrimestres();
    }
}
