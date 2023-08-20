package com.vinculaciones.sistema_gad.controller;
import com.vinculaciones.sistema_gad.model.entity.Poa;
import com.vinculaciones.sistema_gad.model.entity.Rol;
import com.vinculaciones.sistema_gad.model.services.Poa_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/poa")
public class Poa_Controller {
    @Autowired
    Poa_Service Service;

    @PostMapping("/crear")
    public ResponseEntity<Poa> crear(@RequestBody Poa r) {
        try {
            r.setVisible(true);
            return new ResponseEntity<>(Service.save(r), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Poa>> obtenerLista() {
        try {
            return new ResponseEntity<>(Service.listar(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/buscar/{id}")
    public ResponseEntity<Poa> getById(@PathVariable("id") Long id) {
        try {
            return new ResponseEntity<>(Service.findById(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/findByIdAndVisibleTrue/{id}")
    public ResponseEntity<Object> getByIdVisibleTrue(@PathVariable("id") Long id) {
        try {
            Poa poa = Service.obtenerPoaId(id);
            if (poa != null && poa.isVisible()) {
                return ResponseEntity.ok(poa);
            } else if (poa != null && !poa.isVisible()) {
                String mensaje = "No existe en la base de datos.";
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(mensaje);
            } else {
                String mensaje = "Existe en la base de datos, pero no está activa.";
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(mensaje);
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id, @RequestBody Poa Poa) {
        return Service.delete(id);
    }

    @PutMapping("/eliminarlogic/{id}")
    public ResponseEntity<?> eliminarlogic(@PathVariable Long id) {
        Poa a = Service.findById(id);
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
    public ResponseEntity<Poa> actualizar(@PathVariable Long id, @RequestBody Poa p) {
        Poa a = Service.findById(id);
        if (a == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                a.setUsuario(p.getUsuario());
                a.setProyecto(p.getProyecto());
                a.setMeta_alcanzar(p.getMeta_alcanzar());
                a.setMeta_fisica(p.getMeta_fisica());
                a.setAvance_real(p.getAvance_real());
                a.setLocalizacion(p.getLocalizacion());
                a.setFecha_inicio(p.getFecha_fin());
                a.setFecha_fin(p.getFecha_fin());
                a.setCobertura(p.getCobertura());
                a.setTipo_ejecucion(p.getTipo_ejecucion());
                a.setBarrio(p.getBarrio());
                a.setComunidad(p.getComunidad());
                a.setNombre_funcionario(p.getNombre_funcionario());
                a.setCargo(p.getCargo());
                a.setRecursos_propios(p.getRecursos_propios());
                a.setTransferencias_gobierno(p.getTransferencias_gobierno());
                a.setConvenios(p.getConvenios());
                a.setVisible(p.isVisible());
                 return new ResponseEntity<>(Service.save(a), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }
}
