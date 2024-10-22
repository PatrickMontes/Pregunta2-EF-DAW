package pe.edu.cibertec.pregunta2efdaw.service.implementation;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.pregunta2efdaw.model.Estudiante;
import pe.edu.cibertec.pregunta2efdaw.repository.EstudianteRepository;
import pe.edu.cibertec.pregunta2efdaw.service.interfaces.IEstudianteService;

@Service
@RequiredArgsConstructor
public class EstudianteService implements IEstudianteService {

    private final EstudianteRepository estudianteRepository;

    @Override
    public Estudiante estudianteFindById(Long id) {
        return this.estudianteRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Estudiante no encontrado"));
    }

    @Override
    public Estudiante registrarEstudiante(Estudiante estudiante) {
        return this.estudianteRepository.save(estudiante);
    }
}
