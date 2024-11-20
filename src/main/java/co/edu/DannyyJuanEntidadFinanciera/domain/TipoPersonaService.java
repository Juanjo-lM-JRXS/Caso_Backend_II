package co.edu.DannyyJuanEntidadFinanciera.domain;

import co.edu.DannyyJuanEntidadFinanciera.domain.TipoPersona;
import java.util.List;

public interface TipoPersonaService {

    List<TipoPersona> listar();
    
    TipoPersona listarIdTp(int id_tp);

    TipoPersona add(TipoPersona tp);

    TipoPersona edit(TipoPersona tp);

    TipoPersona delete(int id);
    
}
