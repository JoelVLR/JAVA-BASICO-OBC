package claseshijas;

import clasesPrincipal.SmartDevice;

public class SmartPhone extends SmartDevice {
    String Wifi;
    String GPS;

    String Pantalla;

    String SistemaOperativo;
    String Camaras;
    String bluethooth;

    String lectorTarjeta;
    String ReconocimientoBiometrico;

    public SmartPhone(){

    };

    public SmartPhone(String color,String fabricante,String modelo,String nombre,Double peso,Double largo, Double ancho,Double alto,Double pixelesPantalla,Integer bateria,
                      String Wifi,String GPS,String pantalla,String SistemaOperativo,String camaras,String bluethooth,
                      String lectorTarjeta,String reconocimientoBiometrico){
        super(color,fabricante,modelo,nombre,peso,largo,ancho,alto,pixelesPantalla,bateria);
        this.Wifi=Wifi;
        this.GPS=GPS;
        this.Pantalla=pantalla;
        this.Camaras=camaras;
        this.bluethooth=bluethooth;
        this.lectorTarjeta=lectorTarjeta;
        this.ReconocimientoBiometrico=reconocimientoBiometrico;
        this.SistemaOperativo=SistemaOperativo;
    };

    @Override
    public String toString() {
        return "SmartPhone{" +
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
                "Wifi='" + Wifi + '\'' +
                ", GPS='" + GPS + '\'' +
                ", Pantalla='" + Pantalla + '\'' +
                ", SistemaOperativo='" + SistemaOperativo + '\'' +
                ", Camaras='" + Camaras + '\'' +
                ", bluethooth='" + bluethooth + '\'' +
                ", lectorTarjeta='" + lectorTarjeta + '\'' +
                ", ReconocimientoBiometrico='" + ReconocimientoBiometrico + '\'' +
                '}';
    }
}
