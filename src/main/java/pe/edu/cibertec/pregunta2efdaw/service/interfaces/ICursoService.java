package pe.edu.cibertec.pregunta2efdaw.service.interfaces;

import pe.edu.cibertec.pregunta2efdaw.model.Curso;

public interface ICursoService {

    Curso findCursoById(Long id);
    Curso findCursoByNombre(String nombre);
    void reducirVacantes(Curso curso);
    Curso registrarCurso(Curso curso);

}
