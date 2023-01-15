package cursojavabasico;

import java.util.Scanner;

public class ScannerMain {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in); //system.in se lee y con Scanner lo uso para poder ingresar datos de la consola.
        System.out.println("introduce un nombre");//system.out se escribe
        String nombre = teclado.nextLine(); //lee la linea de String(cadena de texto) y la almacena en la variable nombre

        System.out.println("Introduce un numero");
        int numero = teclado.nextInt();  //lee la linea de int (numero entero) y la almacena en la variable numero

        System.out.println("El nombre introducido es " + nombre);
        System.out.println("El numero introducido es " + numero);

        System.out.println("hola mundo");

    }
}
