package sininterfaces;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        EmpleadoCRUD empleadoCRUD = new EmpleadoCRUD();
        Empleado juanito = new Empleado("juanito",30,400.0,true);
        Empleado patricia = new Empleado("patricia",30,400.0,true);
        Empleado roberto = new Empleado("roberto",30,400.0,true);

        empleadoCRUD.guardar(juanito);
        empleadoCRUD.guardar(patricia);
        empleadoCRUD.guardar(roberto);

        List<Empleado> empleados = empleadoCRUD.findAll();

        System.out.println(empleados);
    }
}