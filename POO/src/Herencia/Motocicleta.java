package Herencia;

import clases.Motor;
import clases.Vehiculo;

public class Motocicleta extends Vehiculo {
    boolean baul;

    public Motocicleta() {
    };

    public Motocicleta(String fabricante, String modelo, int year, Double peso, int speed, Motor motor, boolean baul) {
        super(fabricante, modelo, year, peso, speed, motor);
        this.baul = baul;
    };
}
