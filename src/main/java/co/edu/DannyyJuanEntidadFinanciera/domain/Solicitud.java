package co.edu.DannyyJuanEntidadFinanciera.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "solicitud")
public class Solicitud {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int solicitud_id;
    @Column
    private String solicitud_nombre;
    @Column
    private Date solicitud_fecha;
    @Column
    private String solicitud_tipo;
    @Column
    private String solicitud_estado;

    public int getSolicitud_id() {
        return solicitud_id;
    }

    public void setSolicitud_id(int solicitud_id) {
        this.solicitud_id = solicitud_id;
    }

    public String getSolicitud_nombre() {
        return solicitud_nombre;
    }

    public void setSolicitud_nombre(String solicitud_nombre) {
        this.solicitud_nombre = solicitud_nombre;
    }

    public Date getSolicitud_fecha() {
        return solicitud_fecha;
    }

    public void setSolicitud_fecha(Date solicitud_fecha) {
        this.solicitud_fecha = solicitud_fecha;
    }

    public String getSolicitud_tipo() {
        return solicitud_tipo;
    }

    public void setSolicitud_tipo(String solicitud_tipo) {
        this.solicitud_tipo = solicitud_tipo;
    }

    public String getSolicitud_estado() {
        return solicitud_estado;
    }

    public void setSolicitud_estado(String solicitud_estado) {
        this.solicitud_estado = solicitud_estado;
    }
}
