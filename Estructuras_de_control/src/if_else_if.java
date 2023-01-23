import java.util.Scanner;

public class if_else_if {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce un día de la semana");
        String dia = teclado.nextLine();
        boolean  resultado =dia.equals("lunes");

        //if else if
        if (dia.equals("lunes")) {
            System.out.println("comienza la semana");

        } else if (dia.equals("martes")){
            System.out.println("falta menos");
        } else if (dia.equals("miercoles")){
            System.out.println("vamos a la mitad");

        } else if (dia.equals("jueves")){
            System.out.println("viernes chico");

        } else if (dia.equals("viernes")){
            System.out.println("happy hour");

        } else if (dia.equals("sabado")){
            System.out.println("descanso");

        } else if (dia.equals("domingo")){
            System.out.println("descanso por 2");

        }else{
            System.out.println("No es un día de la semana");

        }

    }
}
