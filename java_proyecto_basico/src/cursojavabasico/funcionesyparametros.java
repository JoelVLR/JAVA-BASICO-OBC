package cursojavabasico;

public class funcionesyparametros {

    public static void main(String[] args) {
        holaMundo();
        holaMundo("alan");
        holaMundo("Nicole","Olivares");
        System.out.println(devolverHola());
        holaMundo(1);
        System.out.println(sum(1,2));


    }

    private static void holaMundo() {
        System.out.println("Hola mundo desde un método");

    }

    private static void holaMundo(String name) {
        System.out.println("hola " + name);
    }

    private static String devolverHola() {
        return "Aloja";
    }

    private static void holaMundo(String name, String surname) {
        System.out.println("Hola " + name +" "+ surname);
    }
    private static void holaMundo(Integer number) {
        System.out.println(number);
    }
    private static int sum(int num1, int num2) {
        return (num1 + num2) ;
    }


}

/**ambito y retorno de una función
pongo el nombre de la clase.nombre de la función
 tiene que estar con public
 si esta privada o protegida no te deja moverla ni llamarla (private or protected

 void sifnifica que no devuelve nada, pero si requiero que devuelva algun tipo de dato
 debo poner el tipo de dato: String, char , int, double, float, etc.

 no puedo combinar la palabra void con la palabra return en una función.

 las funciones pueden tener el mismo nombre pero mientras tengas diferentes parametros (argumentos) no corresponde a una duplicacion
 sería una sobrecarga y esta permitico en el lenguaje

 funcion constructor que permite crear funciones de una clase.
 */
