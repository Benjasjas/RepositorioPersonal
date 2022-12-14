package com.genspringboot.project.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="CarSell")
public class CarSell {
    @Id
    @GeneratedValue
    private Integer id;
    private int cantidad;

    //la relacion many to many implica que son dos relaciones
    //one to many

    //many to one a auto
    //al ser una relacion de tabla relacion ya no se llama a Json
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="car_id")
    private Car car;

    //many to one a buysell
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name="buySell_id")
    private BuySell buysell;

    public CarSell() {
    }

    public CarSell(Integer id, int cantidad, Car car, BuySell buysell) {
        this.id = id;
        this.cantidad = cantidad;
        this.car = car;
        this.buysell = buysell;
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

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public BuySell getBuysell() {
        return buysell;
    }

    public void setBuysell(BuySell buysell) {
        this.buysell = buysell;
    }

    

    
    
}
