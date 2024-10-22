package pe.edu.cibertec.pregunta2efdaw.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.pregunta2efdaw.model.Curso;

import java.util.Optional;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {

    Optional<Curso> findCursoByNombre(String nombre);
}
