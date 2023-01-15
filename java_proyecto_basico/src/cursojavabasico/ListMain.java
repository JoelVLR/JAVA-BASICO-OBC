package cursojavabasico;

import javax.swing.plaf.basic.BasicDesktopIconUI;
import java.util.ArrayList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        //creación de una lista
        List<String> nombres = new ArrayList<>(); //importar de class de util

        nombres.add("Nombre 1");
        nombres.add("Nombre 2");
        nombres.add("Nombre 3");
        nombres.add("Nombre 4");

        System.out.println(nombres);

        for(String nombre:nombres){
            System.out.println(nombre);
        }

        List<Coche> coches = new ArrayList<>();

        coches.add(new Coche("kia grand","white", "kia","kia-5654",2334.43,12.5));
        coches.add(new Coche());
        coches.add(new Coche("ford terreneitor"));

        System.out.println(coches);
    }
}
