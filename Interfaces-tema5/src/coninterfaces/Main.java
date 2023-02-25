package coninterfaces;

import sininterfaces.Empleado;

public class Main {
static EmpleadoCRUD empleadoCRUD;
    public static void main(String[] args) {
        empleadoCRUD.findAll();

        empleadoCRUD.guardar(new Empleado());
    }
}
