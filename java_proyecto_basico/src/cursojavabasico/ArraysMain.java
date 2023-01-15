package cursojavabasico;

public class ArraysMain {
    public static void main(String[] args) {

        String nombre1 = "nombre 1";
        String nombre2 = "nombre 2";
        String nombre3 = "nombre 3";
        String nombre4 = "nombre 4";

        String[] nombres = new String[4]; //el valor entre [] es el numero real de datos que habra y no es el indice.
        String[] nombres2 = new String[]{nombre1,nombre2,nombre3,nombre4}; // esta linea de comando es la mas conveniente.
        int[] numeros = new int[5];

        Coche[] coches = new Coche[2];

        nombres[0]=nombre1;
        nombres[1]=nombre2;
        nombres[2]=nombre3;
        nombres[3]=nombre4;

        for (int i = 0; i<nombres.length;i++){
            System.out.println(nombres[i]);
        }
    }
}
