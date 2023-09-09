package pe.edu.cibertec.appwebtrasanctionsimple.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.appwebtrasanctionsimple.model.bd.Direccion;
import pe.edu.cibertec.appwebtrasanctionsimple.repository.DireccionRepository;

@Service
public class DireccionService {

    @Autowired
    private DireccionRepository direccionRepository;


    public Direccion guardarDireccion(Direccion direccion){
        return direccionRepository.save(direccion);
    }

}
