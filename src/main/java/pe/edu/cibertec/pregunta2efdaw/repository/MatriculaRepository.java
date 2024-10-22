package pe.edu.cibertec.pregunta2efdaw.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.pregunta2efdaw.model.Matricula;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long> {
}
