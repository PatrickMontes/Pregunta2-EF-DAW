package pe.edu.cibertec.pregunta2efdaw.controller;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.pregunta2efdaw.model.Matricula;
import pe.edu.cibertec.pregunta2efdaw.service.implementation.MatriculaService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/matricula")
public class MatriculaController {

    private final MatriculaService matriculaService;


    @PostMapping("/registrar")
    @CircuitBreaker(name = "myService", fallbackMethod = "errorRegistrarMatricula")
    public ResponseEntity<String> registrarMatricula(@RequestBody Matricula matricula) {
        return ResponseEntity.ok(this.matriculaService.matricularEstudiante(matricula));
    }

    public ResponseEntity<String> errorRegistrarMatricula(@RequestBody Matricula matricula, Throwable throwable) {
        return ResponseEntity.status(503).body("El servicio esta temporalmente fuera de servicio. Inténtelo de nuevo más tarde.");
    }

}
