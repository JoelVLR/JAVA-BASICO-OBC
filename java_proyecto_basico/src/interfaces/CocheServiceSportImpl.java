package interfaces;

import cursojavabasico.Coche;
import cursojavabasico.electrico_coche;
import interfaces.CocheService;

public class CocheServiceSportImpl implements CocheService {

    @Override
    public Coche crearCocheDemo() {
        System.out.println("creando coche deportivo");
        return new electrico_coche();
    }

    @Override
    public void destruirCoche(Coche coche) {
        System.out.println("destruyendo coche");
    }
}
