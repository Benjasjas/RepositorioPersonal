package com.minimarket.proyect.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity(name = "TipoProducto")
public class TipoProducto {

    @Id
    @GeneratedValue
    private Integer id;
    private String categoriaProducto;

    @JsonBackReference
    //terminar de hacer relacion entre producto y tipo producto, producto debe recibir la id de TipoProducto
    
    public TipoProducto() {
    }

    public TipoProducto(Integer id, String nombre) {
        this.id = id;
        this.categoriaProducto = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return categoriaProducto;
    }

    public void setNombre(String nombre) {
        this.categoriaProducto = nombre;
    }

    
}
