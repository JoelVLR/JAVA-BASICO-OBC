package cursojavabasico;

public class IfElse {

    public static void main(String[] args) {
        int number1=5;
        int number2=10;
        int number3=20;
        int number4=1000;
        if(number1>number2  && number1<number3){
            System.out.println("Verdadero");
        }else if (number3>number4){
            System.out.println("Falso");
        }else{
            System.out.println("llegue al else");
        }
    }
}
