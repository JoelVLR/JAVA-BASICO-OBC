package interfaces;

import cursojavabasico.Coche;
import cursojavabasico.electrico_coche;
import interfaces.CocheService;

public class CocheSErviceClassicImpl implements CocheService {
    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando coche clasico");
        return new electrico_coche();
    }

    @Override
    public void destruirCoche(Coche coche) {
        System.out.println("destruyendo coche");

    }
}
