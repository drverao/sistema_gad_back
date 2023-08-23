package com.vinculaciones.sistema_gad.model.dto;

import com.vinculaciones.sistema_gad.model.entity.Eje;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ObjetivoPnd_DTO {
    private Long id_objetivoods;
    private String nombre;
    private String descripcion;
    private Long id_eje;
    private String nombre_eje;
}
