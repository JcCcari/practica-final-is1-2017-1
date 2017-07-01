package repository;

import domain.Alumno;
import domain.Curso;
import domain.Matricula;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

/**
 * Created by jhoelccari on 1/07/17.
 */
public interface MatriculaRepository extends CrudRepository<Matricula, Long>{

    @Query("select a from Alumno a join Matricula m where a.id = m.alumno.id and a.curso = ?1 and a.semestre = ?2")
    Collection<Alumno> findAlumnosByCursoAndSemestre(Curso curso, String semestre);

    @Query("select a from Alumno a where a.id = ?1")
    Integer findCreditosByAlumno(Long id);
}
