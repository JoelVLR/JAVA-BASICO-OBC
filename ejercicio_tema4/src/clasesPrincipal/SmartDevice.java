package clasesPrincipal;

import claseshijas.SmartPhone;

public class SmartDevice {
    //atributos
   protected String color;
    protected String fabricante;
    protected String modelo;
    protected String nombre;
    protected Double peso;
    protected Double largo;
    protected Double ancho;
    protected Double alto;
    protected Double pixelesPantalla;
    protected Integer bateria;

    //conctructores

    public SmartDevice(){

    };

    public SmartDevice(String color,String fabricante,String modelo,String nombre,Double peso,Double largo, Double ancho,Double alto,Double pixelesPantalla,Integer bateria){
        this.color=color;
        this.fabricante=fabricante;
        this.modelo=modelo;
        this.nombre=nombre;
        this.peso=peso;
        this.largo=largo;
        this.ancho=ancho;
        this.alto=alto;
        this.pixelesPantalla=pixelesPantalla;
        this.bateria=bateria;

    };


    @Override
    public String toString() {
        return "SmartDevice{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", ancho=" + ancho +
                ", alto=" + alto +
                ", pixelesPantalla=" + pixelesPantalla +
                ", bateria=" + bateria +
                '}';
    }

    ;
}
