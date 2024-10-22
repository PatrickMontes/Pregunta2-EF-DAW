package pe.edu.cibertec.pregunta2efdaw.service.interfaces;

import pe.edu.cibertec.pregunta2efdaw.model.Profesor;

public interface IProfesorService {

    Profesor findProfesorById(Long id);
    Profesor registrarProfesor(Profesor profesor);

}
