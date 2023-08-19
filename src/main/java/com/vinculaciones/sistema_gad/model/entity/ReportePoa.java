package com.vinculaciones.sistema_gad.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
@Table(name = "reportepoa")
public class ReportePoa implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reportepoa")
    private Long id_reportepoa;
}
