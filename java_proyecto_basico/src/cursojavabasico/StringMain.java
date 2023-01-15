package cursojavabasico;

public class StringMain {
    public static void main(String[] args) {
        //la clase String

        /**
         * length()
         * startsdWith("")
         * endsWith("")
         * dubString(1,5)
         * trim()
         * equals()
         * compareTo
         */

        String mensaje = "    Hola mundo";
        System.out.println(mensaje.length());
        String mensajeMay=mensaje.toUpperCase();
        System.out.println(mensajeMay);
        System.out.println(mensajeMay.trim());
        mensajeMay=mensajeMay.trim();

        String otro = "HOLA MUNDO";
        if(mensajeMay.equals(otro)){
            System.out.println("Verdadero");
        }


    }
}
