package com.minimarket.proyect.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity(name= "boleta")
public class Boleta {

    @Id
    @GeneratedValue
    private Integer id;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fecha;
    
    public Boleta() {
    }
    public Boleta(Integer id, Date fecha) {
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
