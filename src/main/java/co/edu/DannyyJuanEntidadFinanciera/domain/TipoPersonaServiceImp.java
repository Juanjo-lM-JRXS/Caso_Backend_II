package co.edu.DannyyJuanEntidadFinanciera.domain;

//mire los import 
//reviselos

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
    public TipoPersona delete(int id_tp) {
        TipoPersona tipopersona = tp_repositorio.findById(id_tp);
        if (tipopersona != null){
            tp_repositorio.delete(tipopersona);
        }
        return tipopersona;
    }

}