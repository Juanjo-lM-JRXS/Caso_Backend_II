package co.edu.DannyyJuanEntidadFinanciera.domain;

import java.util.List;
import org.springframework.data.repository.Repository;

public interface SolicitudRepository extends Repository<Solicitud, Integer>{

    List<Solicitud> findAll();

    Solicitud findById(int id);

    Solicitud save(Solicitud p);

    void delete(Solicitud p);
}
