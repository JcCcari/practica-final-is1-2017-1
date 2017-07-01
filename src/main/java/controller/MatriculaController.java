package controller;

import domain.Alumno;
import domain.Curso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import repository.CursoRepository;
import service.AlumnoService;
import service.CursoService;
import service.MatriculaService;

/**
 * Created by jhoelccari on 1/07/17.
 */
@Controller
public class MatriculaController {
    @Autowired
    MatriculaService matriculaService;
    @Autowired
    CursoRepository cursoRepository;
    @Autowired
    AlumnoService alumnoService;

    @RequestMapping("/matricular")
    @ResponseBody
    boolean matricular(String cursoNombre, String dniAlumno, String semestre){
        Curso curso = cursoRepository.findByNombreContaining(cursoNombre);
        Alumno alumno = alumnoService.findByDni(dniAlumno);

        if(matriculaService.matricular(alumno,curso,semestre))
            return true;
        return false;
    }
}
