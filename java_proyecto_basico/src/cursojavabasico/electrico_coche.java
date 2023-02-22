package cursojavabasico;

public class electrico_coche extends Coche{

    String motorElectrico;

    public electrico_coche(){};

    public electrico_coche(String motorElectrico){
        this.motorElectrico=motorElectrico;
    };
    public electrico_coche(String name, String color,String fabricante,String modelo,Double peso,Double largo,String motorElectrico){
        super(name,color,fabricante,modelo,peso,largo);
        this.motorElectrico=motorElectrico;
    };

    @Override //si me manda un error es porque no existe el metodo en la clase superior.
    public void acelerar(Integer cantidad) {
        Integer cantidadAjustada = cantidad * 2;
        super.acelerar(cantidadAjustada);
    };

    @Override
    public String toString() {
        return "electrico_coche{" +
                "motorElectrico='" + motorElectrico + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
