package interfaces;

import cursojavabasico.Coche;

public class InterfacesMain {
    public static void main(String[] args) {
        CocheService service=new CocheServiceSportImpl();
        //CocheService service2 = new CocheServiceSportImpl();

        Coche coche1= service.crearCocheDemo();
        //Coche coche2=service.destruirCoche();

        //Coche choche2 = service2.crearCocheDemo();
    }
}
