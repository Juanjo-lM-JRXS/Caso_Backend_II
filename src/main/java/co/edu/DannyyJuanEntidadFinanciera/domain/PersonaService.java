package co.edu.DannyyJuanEntidadFinanciera.domain;

import java.util.List;

public interface PersonaService {

    List<Persona> listar();

    Persona listarIdTp(int id);

    Persona addP(Persona p);

    Persona edit(Persona p);

    Persona delete(int id);
}
