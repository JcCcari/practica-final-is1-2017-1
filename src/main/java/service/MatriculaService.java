package service;

import domain.Alumno;
import domain.Curso;
import domain.Matricula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import repository.AlumnoRepository;
import repository.MatriculaRepository;

/**
 * Created by jhoelccari on 1/07/17.
 */

@Service
public class MatriculaService {
    @Autowired
    MatriculaRepository matriculaRepository;

    @Autowired
    AlumnoRepository alumnoRepository;

    public Boolean matricular(Alumno alumno, Curso curso, String semestre){
        if (matriculaRepository.findCreditosByAlumno(alumno.getId() + curso.getCreditos()) > 20)
            return false; // no se puede matricular, exedió el numero de creditos
        Matricula matricula = new Matricula(alumno, curso, semestre);
        return true;
    }

    Boolean subirNotaCurso(Curso curso, Alumno alumno ,Double nota){
        Matricula matricula = matriculaRepository.estaMatriculadoEnCurso(curso.getNombre(), alumno.getDni());
        if(matricula == null)
            return false; // no esta matriculado

        matricula.setNota(nota);
        return true;
    }

}
