package com.genspringboot.project.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

//le vamos a poner el nombre a nuestra tabla en la BD
@Entity(name = "user")
public class User {

    //le especificamos a la base que el siguiente atributo sera el id de la tabla
    @Id
    //generamos la llave primaria
    @GeneratedValue
    //definimos el atributo id
    private int id;
    private String name;
    @Column(name = "last_name")
    private String lastName;
    private String correo;

    //vamos a crear la relacion uno es a uno, one to one
    // @JsonBackReference
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private License license;

    //relacion one to many
    // @JsonBackReference
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<BuySell> buySell;

    public User() {
    }

    public User(int id, String name, String lastName, String correo, License license, List<BuySell> buySell) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.correo = correo;
        this.license = license;
        this.buySell = buySell;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public License getLicense() {
        return license;
    }

    public void setLicense(License license) {
        this.license = license;
    }

    public List<BuySell> getBuySell() {
        return buySell;
    }

    public void setBuySell(List<BuySell> buySell) {
        this.buySell = buySell;
    }
    
    
}
