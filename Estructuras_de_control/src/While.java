public class While {

    /**
     * ejercicio
     * crear un bucle que permita concatenar textos e imprima el resultado final por cosola.
     * concatenar nombres
     * los textos pueden venir de un array string
     * String[] nombres = { "","",...}
     * @param args
     */
    public static void main(String[] args) {
        //Estructura de while
        int contador =0;
        while(contador <10){
            String nombre ="prueba";
            contador ++;
            if(contador==5){
                break;
                //continue;
            }
            System.out.println("Valor de contador" + contador);
        }
        //variable nombre esta fuera del ámbito del que se creo
        //System.out.println(nombre);
    }
}
