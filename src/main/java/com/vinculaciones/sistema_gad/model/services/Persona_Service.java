package com.vinculaciones.sistema_gad.model.services;

import com.vinculaciones.sistema_gad.model.entity.Persona;
import org.springframework.data.jpa.repository.Query;

public interface Persona_Service extends GenericService<Persona, Long>{
    public Persona obtenerPersona(String username);

    public Persona obtenerPersonaPorIdUsuario(Long id);
    public Persona findByCedula(String cedula);


}
