package pe.edu.cibertec.pregunta2efdaw.service.implementation;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.cibertec.pregunta2efdaw.model.Curso;
import pe.edu.cibertec.pregunta2efdaw.model.Estudiante;
import pe.edu.cibertec.pregunta2efdaw.model.Matricula;
import pe.edu.cibertec.pregunta2efdaw.model.Profesor;
import pe.edu.cibertec.pregunta2efdaw.repository.MatriculaRepository;
import pe.edu.cibertec.pregunta2efdaw.service.interfaces.IMatriculaService;

@Service
@RequiredArgsConstructor
public class MatriculaService implements IMatriculaService {

    private final CursoService cursoService;
    private final ProfesorService profesorService;
    private final EstudianteService estudianteService;
    private final MatriculaRepository matriculaRepository;

    @Override
    @Transactional
    public String matricularEstudiante(Matricula matricula) {
        Curso curso = this.cursoService.findCursoById(matricula.getCurso().getId());
        Estudiante estudiante = this.estudianteService.estudianteFindById(matricula.getEstudiante().getId());
        Profesor profesor = this.profesorService.findProfesorById(curso.getProfesor().getId());

        if (estudiante.getCiclo() >= curso.getCicloRequerido()){
            if (curso.getVacantes() > 0){
                matricula.setEstudiante(estudiante);
                matricula.setCurso(curso);

                this.matriculaRepository.save(matricula);
                this.cursoService.reducirVacantes(curso);

                return "Matricula exitosa en el curso: " + curso.getNombre() + ", con el profesor: " + profesor.getNombre();
            }
            else {
                return "No hay vacantes para el curso " + curso.getNombre();
            }
        }
        else {
            return "El estudiante no cumple con el ciclo requerido para poder matricularse al curso";
        }
    }
}
