package service;

import domain.Alumno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.AlumnoRepository;

import java.util.Collection;

/**
 * Created by jhoelccari on 1/07/17.
 */

@Service
public class AlumnoService {

    @Autowired
    public AlumnoRepository alumnoRepository;

    public Collection<Alumno> findByApellidoPaterno(String apellidoPaterno){
        return alumnoRepository.findByApellidoPaterno(apellidoPaterno);
    }
}
