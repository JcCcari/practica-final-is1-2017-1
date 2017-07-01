package service;

import domain.Alumno;
import domain.Curso;
import domain.Matricula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import repository.MatriculaRepository;

/**
 * Created by jhoelccari on 1/07/17.
 */

@Service
public class MatriculaService {
    @Autowired
    MatriculaRepository matriculaRepository;

    Boolean matricular(Alumno alumno, Curso curso, String semestre){

        Matricula matricula = new Matricula(alumno, curso, semestre);
        return true;
    }

}
