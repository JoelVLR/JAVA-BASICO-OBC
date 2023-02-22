package clases;

import clases.Motor;

public class Vehiculo {
    protected String fabricante;
    protected String modelo;
    protected int year;
    protected Double peso;
    protected int speed;

Motor motor;

    public Vehiculo(){

    };

    public Vehiculo(String fabricante, String modelo, int year, Double peso, int speed, Motor motor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.year = year;
        this.peso = peso;
        this.speed = speed;
        this.motor = motor;
    }

    public Vehiculo(String fabricante, String modelo, int year, Double peso, int speed){
       this.fabricante = fabricante;
       this.modelo=modelo;
       this.year=year;
       this.peso=peso;
       this.speed=0;
   };

    public void acelerar(int quantity){
        this.speed += quantity;
    }
}
