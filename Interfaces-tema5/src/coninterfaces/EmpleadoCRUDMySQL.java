package coninterfaces;

import sininterfaces.Empleado;

import java.util.List;
//son implementaciones
public class EmpleadoCRUDMySQL implements EmpleadoCRUD, EmpleadoReader {

    @Override
    public void guardar(Empleado empleado) {

    }

    @Override
    public List<Empleado> findAll() {
        return null;
    }

    @Override
    public void delete(Empleado empleado) {

    }
}
