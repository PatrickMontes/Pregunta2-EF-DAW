package pe.edu.cibertec.pregunta2efdaw.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.pregunta2efdaw.model.Profesor;
import pe.edu.cibertec.pregunta2efdaw.service.implementation.ProfesorService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/profesor")
public class ProfesorController {

    private final ProfesorService profesorService;

    @GetMapping("/getProfesor/{id}")
    public ResponseEntity<Profesor> getProfesor(@PathVariable Long id) {
        return ResponseEntity.ok(this.profesorService.findProfesorById(id));
    }


    @PostMapping("/registrar")
    public ResponseEntity<Profesor> registrarProfesor(@RequestBody Profesor profesor) {
        return ResponseEntity.ok(this.profesorService.registrarProfesor(profesor));
    }

}
