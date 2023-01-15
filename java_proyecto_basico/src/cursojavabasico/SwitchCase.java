package cursojavabasico;

public class SwitchCase {

    public static void main(String[] args) {

        String weather = "rainny";

        switch(weather){
            case "sunny":
                System.out.println("El tiempo es soleado");
                break;
            case "cloudy":
                System.out.println("El tiempo es nublado");
                break;
            case "rainny":
                System.out.println("El tiempo es lluvioso");
                break;
            default:
                System.out.println("No se ha encontrado el clima");

        }
    }
}
