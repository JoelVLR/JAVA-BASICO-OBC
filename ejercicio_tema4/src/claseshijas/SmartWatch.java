package claseshijas;

import clasesPrincipal.SmartDevice;

public class SmartWatch extends SmartDevice {
    String reloj;
    String podometro;
    String temporizador;
    String monitorizacionSueno;
    String controlPeso;
    String monitorizaciobMedica;

    public SmartWatch(){};

    public SmartWatch(String color,String fabricante,String modelo,String nombre,Double peso,Double largo, Double ancho,Double alto,Double pixelesPantalla,Integer bateria,
                      String reloj, String podometro,String temporizador,String monitorizacionSueno, String controlPeso,String monitorizaciobMedica){
        super(color,fabricante,modelo,nombre,peso,largo,ancho,alto,pixelesPantalla,bateria);
        this.reloj=reloj;
        this.podometro=podometro;
        this.temporizador=temporizador;
        this.monitorizacionSueno=monitorizacionSueno;
        this.controlPeso=controlPeso;
        this.monitorizaciobMedica=monitorizaciobMedica;

    };

    @Override
    public String toString() {
        return "SmartWatch{" +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", ancho=" + ancho +
                ", alto=" + alto +
                ", pixelesPantalla=" + pixelesPantalla +
                ", bateria=" + bateria +
                "reloj='" + reloj + '\'' +
                ", podometro='" + podometro + '\'' +
                ", temporizador='" + temporizador + '\'' +
                ", monitorizacionSueno='" + monitorizacionSueno + '\'' +
                ", controlPeso='" + controlPeso + '\'' +
                ", monitorizaciobMedica='" + monitorizaciobMedica + '\'' +
                '}';
    }
}
