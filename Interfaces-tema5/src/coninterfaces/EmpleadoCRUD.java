package coninterfaces;

import sininterfaces.Empleado;

import java.util.List;

/**
 *se declaran los metodos, no se implementan
 * Actua como un contrato, dice lo que hay que hacer pero no lo hace.
 *
 * Son abstracciones
 * */

public interface EmpleadoCRUD {

    void guardar(Empleado empleado);

    List<Empleado> findAll();
    void delete(Empleado empleado);
}
