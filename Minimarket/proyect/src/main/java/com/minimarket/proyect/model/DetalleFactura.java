package com.minimarket.proyect.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="detallefactura")
public class DetalleFactura {
    
    @Id
    @GeneratedValue
    private Integer id;
    private int cantidad;
    
    public DetalleFactura() {
    }

    public DetalleFactura(Integer id, int cantidad) {
        this.id = id;
        this.cantidad = cantidad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
