package co.edu.DannyyJuanEntidadFinanciera.domain;

import co.edu.DannyyJuanEntidadFinanciera.domain.TipoPersona;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface TipoPersonaRepository extends Repository<TipoPersona, Integer>{ 
    
    List<TipoPersona> findAll();
    
    TipoPersona findById(int id_tp);

    TipoPersona save(TipoPersona tp);

    void delete(TipoPersona tp);
    
}