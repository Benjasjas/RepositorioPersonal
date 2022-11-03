package com.generation.demo.models;

public class Parlante {

    String marca; 
    String modelo;
    String color;
    String entradaAudio;
    String saludaAudio;
    Float entradaCorriente; //cantidad de voltaje que recibe
    Integer bocina; //cantidad de bocinas
    String botonEncendido;
    String botonApagado;
    String botonReproducir;
    String botonPausar;
    String botonVolMas;
    String botonVolMenos;
    

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getEntradaAudio() {
        return entradaAudio;
    }
    public void setEntradaAudio(String entradaAudio) {
        this.entradaAudio = entradaAudio;
    }
    public String getSaludaAudio() {
        return saludaAudio;
    }
    public void setSaludaAudio(String saludaAudio) {
        this.saludaAudio = saludaAudio;
    }
    public Float getEntradaCorriente() {
        return entradaCorriente;
    }
    public void setEntradaCorriente(Float entradaCorriente) {
        this.entradaCorriente = entradaCorriente;
    }
    public Integer getBocina() {
        return bocina;
    }
    public void setBocina(Integer bocina) {
        this.bocina = bocina;
    }
    public String getBotonEncendido() {
        return botonEncendido;
    }
    public void setBotonEncendido(String botonEncendido) {
        this.botonEncendido = botonEncendido;
    }
    public String getBotonApagado() {
        return botonApagado;
    }
    public void setBotonApagado(String botonApagado) {
        this.botonApagado = botonApagado;
    }
    public String getBotonReproducir() {
        return botonReproducir;
    }
    public void setBotonReproducir(String botonReproducir) {
        this.botonReproducir = botonReproducir;
    }
    public String getBotonPausar() {
        return botonPausar;
    }
    public void setBotonPausar(String botonPausar) {
        this.botonPausar = botonPausar;
    }
    public String getBotonVolMas() {
        return botonVolMas;
    }
    public void setBotonVolMas(String botonVolMas) {
        this.botonVolMas = botonVolMas;
    }
    public String getBotonVolMenos() {
        return botonVolMenos;
    }
    public void setBotonVolMenos(String botonVolMenos) {
        this.botonVolMenos = botonVolMenos;
    }


    public Parlante() {
    }
    
    public Parlante(String marca, String modelo, String color, String entradaAudio, String saludaAudio,
            Float entradaCorriente, Integer bocina, String botonEncendido, String botonApagado, String botonReproducir,
            String botonPausar, String botonVolMas, String botonVolMenos) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.entradaAudio = entradaAudio;
        this.saludaAudio = saludaAudio;
        this.entradaCorriente = entradaCorriente;
        this.bocina = bocina;
        this.botonEncendido = botonEncendido;
        this.botonApagado = botonApagado;
        this.botonReproducir = botonReproducir;
        this.botonPausar = botonPausar;
        this.botonVolMas = botonVolMas;
        this.botonVolMenos = botonVolMenos;
    }


    void encender(){
        System.out.println("Encender");
    }
    void apagar(){
        System.out.println("Apagado");
    }

    String controlarVolumen(String vol){
        if (vol == "subir"){
            return "sube el volumen";
        }
        else if (vol == "bajar"){
            return "baja el volumen";
        }
        else{
            return "no hace nada";
        }
    }

    String reproducir(String botonReproducir){
        if (botonReproducir == "apretar"){
            return "reproducir";
        }
        else{
            return "no hace nada";
        }

    }
    String pausa(String botonPausar){
        if (botonPausar == "apretar"){
            return "pausar";
        }
        else{
            return "no hace nada";
        }

    }
}
