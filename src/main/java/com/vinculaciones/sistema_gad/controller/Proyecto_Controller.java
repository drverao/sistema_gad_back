package com.vinculaciones.sistema_gad.controller;


import com.vinculaciones.sistema_gad.model.dto.ProyectoResumenDTO;
import com.vinculaciones.sistema_gad.model.entity.Proyecto;
import com.vinculaciones.sistema_gad.model.services.Proyecto_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/proyecto")
public class Proyecto_Controller {
    @Autowired
    Proyecto_Service Service;

    @PostMapping("/crear")
    public ResponseEntity<Proyecto> crear(@RequestBody Proyecto r) {
        try {
            r.setVisible(true);
            return new ResponseEntity<>(Service.save(r), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Proyecto>> obtenerLista() {
        try {
            return new ResponseEntity<>(Service.listar(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/buscar/{id}")
    public ResponseEntity<Proyecto> getById(@PathVariable("id") Long id) {
        try {
            return new ResponseEntity<>(Service.findById(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id, @RequestBody Proyecto Proyecto) {
        return Service.delete(id);
    }

    @PutMapping("/eliminarlogic/{id}")
    public ResponseEntity<?> eliminarlogic(@PathVariable Long id) {
        Proyecto a = Service.findById(id);
        if (a == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                a.setVisible(false);
                return new ResponseEntity<>(Service.save(a), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }

        }
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Proyecto> actualizar(@PathVariable Long id, @RequestBody Proyecto p) {
        Proyecto a = Service.findById(id);
        if (a == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                a.setCodigo(p.getCodigo());
                a.setNombre(p.getNombre());
                a.setObjetivo(p.getObjetivo());
                a.setMeta(p.getMeta());
                a.setPorcentaje_alcance(p.getPorcentaje_alcance());
                a.setOds(p.getOds());
                a.setPnd(p.getPnd());
                a.setModelopoa(p.getModelopoa());
                a.setPrograma(p.getPrograma());
                //a.setIndicadores(p.getIndicadores());
                //a.setComponente(p.getComponente());
                //a.setCompetencia(p.getCompetencia());
                a.setVisible(p.isVisible());
                 return new ResponseEntity<>(Service.save(a), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @GetMapping("/listarProyectosConRelaciones")
    public ResponseEntity<List<ProyectoResumenDTO>> obtenerProyectosConRelaciones() {
        List<ProyectoResumenDTO> proyectos = Service.listarProyectosConRelaciones();
        return ResponseEntity.ok(proyectos);
    }
}
