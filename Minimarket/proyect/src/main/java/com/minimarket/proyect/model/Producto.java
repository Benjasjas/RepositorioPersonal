package com.minimarket.proyect.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.validator.constraints.Range;

@Entity(name = "producto")
public class Producto {
    @Id
    @GeneratedValue
    private Integer id;
    private String nombreProducto;
    @Range(min = 0)
    private int precioCompra;
    @Range(min = 0)
    private int precioVenta;
    @Range(min = 0)
    private int stock;
    
    

    public Producto() {
    }

    public Producto(Integer id, String nombre, int precioCompra, int precioVenta, int stock) {
        this.id = id;
        this.nombreProducto = nombre;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.stock = stock;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombreProducto;
    }

    public void setNombre(String nombre) {
        this.nombreProducto = nombre;
    }

    public int getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(int precioCompra) {
        this.precioCompra = precioCompra;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
