package pe.edu.cibertec.pregunta2efdaw.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.pregunta2efdaw.model.Curso;
import pe.edu.cibertec.pregunta2efdaw.service.implementation.CursoService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/curso")
public class CursoController {

    private final CursoService cursoService;

    @GetMapping("/getCurso/{nombre}")
    public ResponseEntity<Curso> CursoPorNombre(@PathVariable String nombre) {
        return ResponseEntity.ok(this.cursoService.findCursoByNombre(nombre));
    }


    @PostMapping("/registrar")
    public ResponseEntity<Curso> registrarCurso(@RequestBody Curso curso) {
        return ResponseEntity.ok(this.cursoService.registrarCurso(curso));
    }

}
