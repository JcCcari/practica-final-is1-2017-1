package repository;

import domain.Curso;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Collection;

/**
 * Created by jhoelccari on 1/07/17.
 */
public interface CursoRepository extends CrudRepository<Curso, Long> {

    @Query("select a from Curso a")
    Collection<Curso> findAll();

    @Query("select a from Curso a where a.codigo = ?1")
    Curso findByCodigo(String codigo);

    @Query("select a from Curso a where a.nombre = ?1")
    Curso findByNombre(String nombreCurso);

    @Query("select a from Curso a where a.nombre like CONCAT('%',:nombre,'%')")
    Curso findByNombreContaining(@Param("nombre")String nombre);
}
