package com.minimarket.proyect.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "proveedor")
public class Proveedor {
    
    @Id
    @GeneratedValue
    private Integer id;
    private String nombreProveedor;
    
    public Proveedor() {
    }

    public Proveedor(Integer id, String nombreProveedor) {
        this.id = id;
        this.nombreProveedor = nombreProveedor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }
}
