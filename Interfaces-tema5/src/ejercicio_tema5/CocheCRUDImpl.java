package ejercicio_tema5;



public class CocheCRUDImpl implements CocheCRUD{


    @Override
    public void save() {

    }

    @Override
    public void findAll() {

    }

    @Override
    public void delete() {

    }
    String save = "guardando";
    String findAll = "Buscar Todo";
    String delete = "Borrando";

    @Override
    public String toString() {
        return "CocheCRUDImpl{" +
                "save='" + save + '\'' +
                ", findAll='" + findAll + '\'' +
                ", delete='" + delete + '\'' +
                '}';
    }
}
