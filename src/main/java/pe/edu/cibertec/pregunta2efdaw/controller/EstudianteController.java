package pe.edu.cibertec.pregunta2efdaw.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.pregunta2efdaw.model.Estudiante;
import pe.edu.cibertec.pregunta2efdaw.service.implementation.EstudianteService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/estudiante")
public class EstudianteController {

    private final EstudianteService estudianteService;


    @GetMapping("/getEstudiante/{id}")
    public ResponseEntity<Estudiante> estudiantePorId(@PathVariable Long id) {
        return ResponseEntity.ok(this.estudianteService.estudianteFindById(id));
    }


    @PostMapping("/registrar")
    public ResponseEntity<Estudiante> registrarEstudiante(@RequestBody Estudiante estudiante) {
        return ResponseEntity.ok(this.estudianteService.registrarEstudiante(estudiante));
    }
}
