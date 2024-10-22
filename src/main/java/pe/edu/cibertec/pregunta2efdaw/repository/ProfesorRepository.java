package pe.edu.cibertec.pregunta2efdaw.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.pregunta2efdaw.model.Profesor;

@Repository
public interface ProfesorRepository extends JpaRepository<Profesor, Long> {
}
