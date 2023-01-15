package cursojavabasico;

public class continue_break {
    public static void main(String[] args) {

        int count = 0;
        while (count < 10) {
            count++;
            if(count == 6)
                break;//rompe el flujo de ejecución
                //continue; salta el valor 6 y continua la iteración

                System.out.println("Hola mundo" + " " + count);
        }

            System.out.println("Fin");
    }
}
