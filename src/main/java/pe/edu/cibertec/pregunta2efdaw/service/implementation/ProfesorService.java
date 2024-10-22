package pe.edu.cibertec.pregunta2efdaw.service.implementation;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.pregunta2efdaw.model.Profesor;
import pe.edu.cibertec.pregunta2efdaw.repository.ProfesorRepository;
import pe.edu.cibertec.pregunta2efdaw.service.interfaces.IProfesorService;

@Service
@RequiredArgsConstructor
public class ProfesorService implements IProfesorService {

    private final ProfesorRepository profesorRepository;

    @Override
    public Profesor findProfesorById(Long id) {
        return this.profesorRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Profesor no encontrado"));
    }

    @Override
    public Profesor registrarProfesor(Profesor profesor) {
        return this.profesorRepository.save(profesor);
    }
}
