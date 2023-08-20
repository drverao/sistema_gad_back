package com.vinculaciones.sistema_gad.model.repository;

import com.vinculaciones.sistema_gad.model.entity.ReporteTrimestre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ReporteTrimestreRepository extends JpaRepository<ReporteTrimestre, Long> {

    @Query(value = "SELECT * from reporte_trimestre where visible = true ORDER BY fecha ASC", nativeQuery = true)
    List<ReporteTrimestre> listarReporteTrimestres();
}
