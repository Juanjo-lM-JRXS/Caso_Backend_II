package co.edu.DannyyJuanEntidadFinanciera.domain;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImp implements PersonaService {

    @Autowired
    private PersonaRepository repositorio;

    @Override
    public List<Persona> listar() {
        return repositorio.findAll();
    }

    @Override
    public Persona listarIdTp(int id) {
        return repositorio.findById(id);
    }

    @Override
    public Persona addP(Persona p) {
        return repositorio.save(p);
    }
    
    @Override
    public Persona edit(Persona p) {
        return repositorio.save(p);
    }
    
    @Override
    public Persona delete(int id) {
        Persona persona = repositorio.findById(id);
        if (persona != null) {
            repositorio.delete(persona);
        }
        return persona;
    }
}
