package ejercicio_tema5;

public class Main {

    public static void main(String[] args) {

        CocheCRUD cocheCRUD = new CocheCRUDImpl();

        cocheCRUD.save();

        cocheCRUD.findAll();

        cocheCRUD.delete();


        System.out.println(cocheCRUD);
    }
}
