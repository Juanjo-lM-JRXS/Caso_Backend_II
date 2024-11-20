package co.edu.DannyyJuanEntidadFinanciera.domain;

import co.edu.DannyyJuanEntidadFinanciera.domain.TipoPersonaService;
import co.edu.DannyyJuanEntidadFinanciera.domain.TipoPersonaRepository;
import co.edu.DannyyJuanEntidadFinanciera.domain.TipoPersona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoPersonaServiceImp implements TipoPersonaService {

    @Autowired

    private TipoPersonaRepository tp_repositorio;

    @Override

    public List<TipoPersona> listar() {
        return tp_repositorio.findAll();
    }
     @Override

    public TipoPersona listarIdTp(int id) {
        return tp_repositorio.findById(id);
    }

    @Override

    public TipoPersona add(TipoPersona tp) {
        return tp_repositorio.save(tp);
    }

    @Override
    public TipoPersona edit(TipoPersona tp) {
        return tp_repositorio.save(tp);
    }

    @Override

    public TipoPersona delete(int id) {

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

}