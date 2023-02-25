package ejercicio_tema5;

import java.util.List;

public interface CocheCRUD {

    <Save> Save save();

     <FindAll> FindAll findAll();

    <Delete> Delete delete();
}
