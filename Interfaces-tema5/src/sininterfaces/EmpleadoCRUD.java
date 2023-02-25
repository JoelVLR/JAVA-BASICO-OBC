package sininterfaces;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoCRUD {
    //guardar un empleado
    /**
     * Create
     * Read
     * Update
     * Delete
     * */

   private List<Empleado> empleados = new ArrayList<>();//array normal pero dinamico donde puedo agregar muchos empleados

    //Create - guardar un empleado
    public void guardar(Empleado empleado){
        empleados.add(empleado);
    }

    public List<Empleado> findAll(){
      return empleados;
    };
}
