import java.util.Scanner;

public class Sentencia_if_else {

    public static void main(String[] args) {
        /**
         * reformat file ayuda a ordenar el codigo
         * puedo revisar el codigo con debug
         */


        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tu edad");
        int edad=teclado.nextInt();
        boolean edadEvaluada=edad>=18;


        if(edadEvaluada){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eres menor de edad");

        }


    }

}