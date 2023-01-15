package cursojavabasico;

public class Coche { //Esta es la clase padre, super clase o base. // abstrac sirve para hacer una clase que no se pueda instanciar

    //atributos
    String color;
    String fabricante;
    String modelo;
    Double peso;
    Double largo;

    String name="nombre de coche";

    Integer velocidad=0;

    // contructores

    public Coche(){

    };
   public Coche(String name){
       this.name = name;


   }
    public Coche(String name, String color,String fabricante,String modelo,Double peso,Double largo){
        this.color=color;
        this.fabricante=fabricante;
        this.modelo=modelo;
        this.peso=peso;
        this.largo=largo;
        this.name=name;
    };
    //comportamiento

    public void acelerar(Integer cantidad){
        if(cantidad>0&&cantidad<=120){this.velocidad+=cantidad;}
    } //metodo

    @Override
    public String toString() {
        return "Coche{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", name='" + name + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }
}
