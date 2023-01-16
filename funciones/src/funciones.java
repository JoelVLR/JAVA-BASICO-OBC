public class funciones {
    public static void main(String[] args) {
        //invocar una función sin parametro y sin tipo de retorno
        showMenu();

//opcion 2: funciones sin parametros y con tipo de retorno
        //tipos de datos comunes para devolver: int, long, double, boolean , String

        String menu = getMenu(); //cuando una función usa un return debo almacenarla en una variable y despues para mostrar
        //debo ponerla en un System.out.println()
        System.out.println(menu);

        //opcion 3: funciones con parametros y sin tipo de retorno

        imprimirSaludo("openbootcamp");

        //opcion4 : funciones con parametros y con tipo de retorno
        String nombre = "joel";
        String apellido="lopez";
        String saludo=obtenerSaludo(nombre, apellido);
        System.out.println(saludo);

        int resultadoSuma= suma(50,200);
        System.out.println(resultadoSuma);
    }
    //crear una función. void indica que no devuelve nada
    static void showMenu(){
        System.out.println("funciones");
        System.out.println("estoy invocando esta función");
    }
    static String getMenu(){
        return "Estoy devolviendo una cosa"; //para devolver algo y debo indicaar que tipo de dato devolvera
    }

    static void imprimirSaludo(String name){
        System.out.println("buenos tardes " + " " + name);
    };

    static String obtenerSaludo(String nombre, String apellido){
        return "buenas tardes " + nombre + " " + apellido;
    };

    static int suma(int numero1, int numero2){
        return numero1+numero2;
    };
}