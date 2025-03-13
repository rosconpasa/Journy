package Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args){
        Stack<String> names = new Stack<>();

        names.push("Juan");
        names.push("Pedro");
        names.push("Ana");
        System.out.println(names);

        // peek() obtiene el elemento del tope
        System.out.println(names.peek());

        //Comprueba si está vacía
        System.out.println(names.empty());

        //Elimina el elemento del tope
        names.pop();

        //retorna la posiion de un elemento
        System.out.println(names.search("Juan"));

    }
}
