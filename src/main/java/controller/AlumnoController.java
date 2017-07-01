package controller;

import domain.Alumno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.AlumnoService;

import java.util.Collection;

/**
 * Created by jhoelccari on 1/07/17.
 */

@Controller
public class AlumnoController {
    @Autowired
    AlumnoService alumnoService;

    @RequestMapping(value="/findByApellidoPaterno")
    @ResponseBody
    Collection<Alumno> findByApellidoPaterno(String apellidoPaterno){
        return alumnoService.findByApellidoPaterno(apellidoPaterno);
    }
}
