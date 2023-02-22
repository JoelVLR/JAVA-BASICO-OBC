package clases;

import Herencia.Camion;
import Herencia.Coche;
import Herencia.Motocicleta;

public class crear_un_objeto {
    public static void main(String[] args) {
        // clase identificador = new clase();

        //crear un objeto utilizando el contructor vacio
        Vehiculo toyotaPrius=new Vehiculo();

        // crear un objeto utilizando el constructor con parametros
        Motor motorGTI = new Motor("GTI",190,459.0,6);

        Vehiculo forMondeo = new Vehiculo("ford","ford-3423",2019,10.5,0,motorGTI);
        System.out.println(forMondeo.fabricante);
        System.out.println(forMondeo.modelo);
        System.out.println(forMondeo.year);
        forMondeo.acelerar(50);
        System.out.println(forMondeo.speed);
//HERENCIA
        Motocicleta kawasakiNinja = new Motocicleta();
        kawasakiNinja.fabricante = "kawasaki";
//POLIMORFISMO
        Vehiculo vehiculo;
        vehiculo = new Motocicleta();
        vehiculo.acelerar(50);

        vehiculo = new Coche();
        vehiculo.acelerar(50);

        vehiculo=new Camion();
        vehiculo.acelerar(50);
        //diferentes formas de usar las clases.
//CLASES ABSTRACTAS: NO SE OUEDEN INSTANCIAR (CREAR UN OBJETO), SOLO INSTANCIAS LAS CLASES HIJAS - abstract

        //static indica que el metodo pertenece a la clase y no a los metodos, indica que un atributo o metodo que pertenece a una clase.
//programación generica 
    };
}