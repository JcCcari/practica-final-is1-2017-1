package repository;

import domain.Alumno;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

/**
 * Created by jhoelccari on 1/07/17.
 */
public interface AlumnoRepository extends CrudRepository<Alumno, Long> {
    @Query("select a from Alumno a")
    Collection<Alumno> findAll();

    @Query("select a from Alumno a where a.dni = ?1")
    Alumno findByDni();

    @Query("select a from Alumno a where a.apellidoPaterno = ?1")
    Collection<Alumno> findByApellidoPaterno(String apellido);

}
