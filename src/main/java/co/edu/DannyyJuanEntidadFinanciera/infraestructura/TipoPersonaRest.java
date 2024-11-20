package co.edu.DannyyJuanEntidadFinanciera.infraestructura;

import co.edu.DannyyJuanEntidadFinanciera.domain.Persona;
import co.edu.DannyyJuanEntidadFinanciera.domain.TipoPersona;
import co.edu.DannyyJuanEntidadFinanciera.domain.TipoPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping({"/tipopersonasrest"})
public class TipoPersonaRest {
    
    @Autowired
    TipoPersonaService tpservice;
    
    @GetMapping("/submit/tp")
    public List<TipoPersona> listarTp() {
        return tpservice.listar();
    }
    @PostMapping("/submit")
    public TipoPersona agregar(@RequestBody TipoPersona tp) {
        return tpservice.add(tp);
    }

    @GetMapping("/submit/{id_tp}")
    public TipoPersona listarIdTp(@PathVariable("id_tp") int id_tp) {
        return tpservice.listarIdTp(id_tp);
    }

    @PutMapping("/submit/{id}")
    public TipoPersona editar(@RequestBody TipoPersona tp, @PathVariable("id") int id_tp) {
        tp.setId_tp(id_tp);
        return tpservice.edit(tp);
    }
    @DeleteMapping("/delete/{id}")
    public TipoPersona deleteTp(@PathVariable("id") int id) {
        return tpservice.delete(id);
    }
}