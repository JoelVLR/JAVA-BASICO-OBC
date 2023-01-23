public class ForEach {

    public static void main(String[] args) {
        String[] nombres={ "pepe","juanito","ruperta"};
        //estructura de un for Each
        for(String nombre:nombres){
            System.out.println(nombre);

        }
        int[] numeros={ 5,3,7};
        int suma=0;
        for(int numero : numeros){
           suma+= numero;
        }
        System.out.println(suma);
    }
}
