package co.edu.DannyyJuanEntidadFinanciera.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int producto_id;
    @Column
    private String producto_nombre;
    @Column
    private String producto_estado;
    @Column
    private String producto_requisitos;

    public int getProducto_id() {
        return producto_id;
    }

    public void setProducto_id(int producto_id) {
        this.producto_id = producto_id;
    }

    public String getProducto_nombre() {
        return producto_nombre;
    }

    public void setProducto_nombre(String producto_nombre) {
        this.producto_nombre = producto_nombre;
    }

    public String getProducto_estado() {
        return producto_estado;
    }

    public void setProducto_estado(String producto_estado) {
        this.producto_estado = producto_estado;
    }

    public String getProdcuto_requisitos() {
        return producto_requisitos;
    }

    public void setProdcuto_requisitos(String prodcuto_requisitos) {
        this.producto_requisitos = prodcuto_requisitos;
    }
}
