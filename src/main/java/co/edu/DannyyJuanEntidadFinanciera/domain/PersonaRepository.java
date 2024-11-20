package co.edu.DannyyJuanEntidadFinanciera.domain;

import java.util.List;
import org.springframework.data.repository.Repository;

public interface PersonaRepository extends Repository<Persona, Integer> {

    List<Persona> findAll();

    Persona findById(int id);

    Persona save(Persona p);

    void delete(Persona p);
}
