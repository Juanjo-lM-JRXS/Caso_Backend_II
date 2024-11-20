package co.edu.DannyyJuanEntidadFinanciera.domain;
// juanito ojo con el service
import java.util.List;

public interface SolicitudService {

    List<Solicitud> listar();

    Solicitud listarId(int id);

    Solicitud add(Solicitud p);

    Solicitud editar(Solicitud p);

    Solicitud deleteT(int id);
}
