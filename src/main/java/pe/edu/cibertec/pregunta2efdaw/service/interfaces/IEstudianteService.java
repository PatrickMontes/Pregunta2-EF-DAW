package pe.edu.cibertec.pregunta2efdaw.service.interfaces;

import pe.edu.cibertec.pregunta2efdaw.model.Estudiante;

public interface IEstudianteService {

    Estudiante estudianteFindById(Long id);
    Estudiante registrarEstudiante(Estudiante estudiante);

}
