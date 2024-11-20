package co.edu.DannyyJuanEntidadFinanciera.domain;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "persona")
public class Persona {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int persona_id;
    @Column
    private String persona_nombre;
    @Column
    private String persona_apellido;
    @Column
    private Date persona_date;
    @Column
    private int persona_documento;

    public int getPersona_id() {
        return persona_id;
    }

    public void setPersona_id(int persona_id) {
        this.persona_id = persona_id;
    }

    public String getPersona_nombre() {
        return persona_nombre;
    }

    public void setPersona_nombre(String persona_nombre) {
        this.persona_nombre = persona_nombre;
    }

    public String getPersona_apellido() {
        return persona_apellido;
    }

    public void setPersona_apellido(String persona_apellido) {
        this.persona_apellido = persona_apellido;
    }
    
    public Date getPersona_date() {
        return persona_date;
    }

    public void setPersona_date(Date persona_date) {
        this.persona_date = persona_date;
    }
    
    public int getPersona_documento() {
        return persona_documento;
    }

    public void setPersona_documento(int persona_documento) {
        this.persona_documento = persona_documento;
    }
}
