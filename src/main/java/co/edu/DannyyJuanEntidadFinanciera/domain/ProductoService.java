package co.edu.DannyyJuanEntidadFinanciera.domain;

import java.util.List;

public interface ProductoService {

    List<Producto> listar();

    Producto listaId(int id);

    Producto addP(Producto p);

    Producto edit(Producto p);

    Producto delete(int id);
}
