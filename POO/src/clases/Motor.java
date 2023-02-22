package clases;

public class Motor {
    protected  String modelo;
    protected int caballos;
    protected Double parNm;
    protected int numClindros;

    // constructores
    public Motor(){
    };

    public Motor(String modelo, int caballos, Double parNm, int numClindros) {
        this.modelo = modelo;
        this.caballos = caballos;
        this.parNm = parNm;
        this.numClindros = numClindros;
    }

    // metodos
}
