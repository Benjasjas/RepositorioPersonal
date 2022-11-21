package com.minimarket.proyect.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.validator.constraints.Range;

@Entity(name = "detalleboleta")
public class DetalleBoleta {

    @Id
    @GeneratedValue
    private Integer id;
    @Range(min = 0)
    private int cantidadProducto;
    
    public DetalleBoleta() {
    }

    public DetalleBoleta(Integer id, int cantidadProducto) {
        this.id = id;
        this.cantidadProducto = cantidadProducto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }
}
