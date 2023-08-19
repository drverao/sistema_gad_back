package com.vinculaciones.sistema_gad.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "detalle_trimestre")
public class DetalleTrimestre {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id_detalle_trimestre")
    private Long id_detalle_trimestre;
    @Column(name = "porcentaje")
    private double porcentaje;
    @Column(name = "presupuesto_referencial")
    private double presupuesto_referencial;
    @Column(name = "ejecucion_presupuesto")
    private double ejecucion_presupuesto;
    @Column(name = "visible")
    private boolean visible;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_trimestre")
    private Trimestre trimestre;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_actividad")
    private Actividades actividad;

    //relacion con la tabla reporte_trimestre
    @JsonIgnore
    @OneToMany(mappedBy = "detalle_trimestre", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private java.util.Set<ReporteTrimestre> reporte_trimestres = new java.util.HashSet<>();
}
