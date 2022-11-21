package com.minimarket.proyect.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity(name = "factura")
public class Factura {
    
    @Id
    @GeneratedValue
    private Integer id;
    @DateTimeFormat (pattern = "yyyy-MM-dd")
    private Date fecha;
    
    public Factura() {
    }
    public Factura(Integer id, Date fecha) {
        this.id = id;
        this.fecha = fecha;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
