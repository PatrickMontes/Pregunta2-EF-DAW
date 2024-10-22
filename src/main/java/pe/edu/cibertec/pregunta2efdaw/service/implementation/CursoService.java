package pe.edu.cibertec.pregunta2efdaw.service.implementation;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.pregunta2efdaw.model.Curso;
import pe.edu.cibertec.pregunta2efdaw.repository.CursoRepository;
import pe.edu.cibertec.pregunta2efdaw.service.interfaces.ICursoService;

@Service
@RequiredArgsConstructor
public class CursoService implements ICursoService {

    private final CursoRepository cursoRepository;

    @Override
    public Curso findCursoById(Long id) {
        return this.cursoRepository.findById(id).orElseThrow(
                () -> new RuntimeException("No se encontró el curso"));
    }

    @Override
    public Curso findCursoByNombre(String nombre) {
        return this.cursoRepository.findCursoByNombre(nombre).orElseThrow(
                () -> new RuntimeException("No se encontró el curso"));
    }

    @Override
    public void reducirVacantes(Curso curso) {
        curso.setVacantes(curso.getVacantes() - 1);
        this.cursoRepository.save(curso);
    }

    @Override
    public Curso registrarCurso(Curso curso) {
        return this.cursoRepository.save(curso);
    }
}
