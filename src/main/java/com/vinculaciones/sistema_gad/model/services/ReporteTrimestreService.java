package com.vinculaciones.sistema_gad.model.services;

import com.vinculaciones.sistema_gad.model.entity.ReporteTrimestre;

import java.util.List;

public interface ReporteTrimestreService extends GenericService<ReporteTrimestre, Long>{

    public List<ReporteTrimestre> listarReporteTrimestres();
}
