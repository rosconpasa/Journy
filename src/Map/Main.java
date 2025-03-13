package Map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main (String[] args){
        //Crear un HashMap
        HashMap<Integer, String> names = new HashMap<>();

        //agregar elementos
        names.put(18, "Amadeo");
        names.put(20, "Cris");
        names.put(10, "Rita");
        names.put(10, "Rita"); //No se agrega porque las claves deben ser unicas
        names.put(19, "Amadeo");

        //obtener valor asociado a clave
        names.get(18); //Amadeo



        names.forEach((k, v) -> System.out.println("edad:" + k + "- nombre: " + v));

        for (Map.Entry<Integer, String> entry : names.entrySet()){
            System.out.println("edad: " + entry.getKey() + "- nombre: " +entry.getValue());
        }

        //borrar un elemento
        names.remove(18);
        names.remove(20, "Cris");

        //obtener un set con todas las claves
        System.out.println(names.keySet());


    }
}
