package com.vinculaciones.sistema_gad.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "reportepoa")
public class ReportePoa implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reportepoa")
    private Long id_reportepoa;
    @Column(name = "fecha")
    private LocalDate fecha;
    @Column(name = "ejecucion_presupuesto")
    private double ejecucion_presupuesto;
}
