package cursojavabasico;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {

        Map<String, String> personas=new HashMap<>();

        personas.put("187572370","Nombre Apellido 1");
        personas.put("187572371","Nombre Apellido 2");
        personas.put("187572377","Nombre Apellido 3");

        System.out.println(personas);
//formas comunes para iterar en mapa
        for(String key:personas.keySet()){
            System.out.println(key);
        } //así saco las claves

        for(String value:personas.values()){
            System.out.println(value);
        } //así saco valores

        for(Map.Entry<String , String> pair : personas.entrySet()){

            System.out.println(pair.getKey() + " - " + pair.getValue());

        }//así consigo la clave y el valor  esta es la forma mas idonea


    }
}
