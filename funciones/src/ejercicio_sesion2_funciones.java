import java.util.Scanner;

public class ejercicio_sesion2_funciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce un precio");
        int precioBruto=teclado.nextInt();
        double precioTotal = obtenerPrecio(precioBruto);
        System.out.println("Precio con IVA incluido " + " " + precioTotal);
    }
    /**En Chile el IVA equivale a un 19% agregado al precio final del producto
    los precios son numeros enteros sin decimales así que use el Int pero para recibirlo tuve que usar el double
     para poder usar el 1.19 que equivale al aumento de 19% a un precio.
    */
    static double obtenerPrecio(int precio){
        return precio * 1.19;
    };
}
