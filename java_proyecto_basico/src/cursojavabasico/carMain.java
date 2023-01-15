package cursojavabasico;

public class carMain {

    public static void main(String[] args) {
        String coche = "alfa romeo";
        Coche cocheObj = new Coche("kia grand","rojo","ford","4x4",1089.76,4.56); //instancia
        Coche cocheObj2 = new Coche();

        cocheObj.acelerar(50);

        //System.out.println(cocheObj);

        cocheObj.peso=1350.8;

        //System.out.println(cocheObj);

        electrico_coche carElectric = new electrico_coche();

        carElectric.motorElectrico="Ford Motor Electric";
        carElectric.color="Azul";
        carElectric.fabricante="ford";
        carElectric.modelo="signux 2023";

        //System.out.println(carElectric);

        electrico_coche carE2=new electrico_coche("kia grand","azul","ford","xxjv",1056.56,5.78,"xxElectricJV");
    System.out.println(carE2);

    carE2.acelerar(60);

    System.out.println(carE2);

    }
}
//la clase actua como una plantilla