package com.example.M5A.RestController;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.example.M5A.GenericService.PersonaService;
import com.example.M5A.Models.Persona;

import java.util.List;

@RestController
@RequestMapping("/api/persona")
public class PersonaController {

    @Autowired
    PersonaService personaService;

    @GetMapping("/listar")
    public ResponseEntity<List<Persona>> listarPersona() {
        return new ResponseEntity<>(personaService.findByAll(), HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<Persona> crearPersona(@RequestBody Persona p) {
        return new ResponseEntity<>(personaService.save(p), HttpStatus.CREATED);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Persona> actualizarPersona(@PathVariable Long id, @RequestBody Persona p) {
        Persona personaEncontrada = personaService.findById(id);
        if (personaEncontrada == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                personaEncontrada.setNombre(p.getNombre());
                personaEncontrada.setApellido(p.getApellido());
                personaEncontrada.setDireccion(p.getDireccion());
                return new ResponseEntity<>(personaService.save(personaEncontrada), HttpStatus.OK);
            } catch (DataAccessException e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Persona> eliminarPersona(@PathVariable Long id) {
        personaService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
