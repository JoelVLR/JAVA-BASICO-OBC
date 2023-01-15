package cursojavabasico;

public class TryCatchMain {

    public static void main(String[] args) {

        try{
        int result=5/5; //codigo que puede dar problemas
        }
         catch(ArithmeticException e ){
            e.printStackTrace();//capturar la exception, registrar el error o una variable.
         } finally{
            System.out.println("Cierra de recursos");//para cerrar los recursos, eleiminar recursos o dejar todo como estaba
            //se ejecuta si todo va bien o mal.
        }

        System.out.println("Fin");
    }
}
