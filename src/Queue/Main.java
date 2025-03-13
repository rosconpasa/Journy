package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main (String[] args){
        Queue<String> names = new LinkedList<>();

        //Añadir un elemento
        names.add("Juan");
        names.add("Pedro");
        names.add("Ana");

        //Devuelve el primer elemento
        System.out.println(names.peek());

        //Obtiene y eliminar el primer elemento
        names.poll();

        //Obtiene y elimina el primer elemento
        names.remove();

        System.out.println(names);
    }
}
