package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CursoRepository;

/**
 * Created by jhoelccari on 1/07/17.
 */

@Service
public class CursoService {
    @Autowired
    CursoRepository cursoRepository;


}
