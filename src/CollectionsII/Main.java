package CollectionsII;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Lists list = new Lists();
       /*
        List<Integer> arList = new ArrayList<>();  //Para acceso rápido: ArrayList
        list.lists(arList);


        System.out.println("______________________________________________________________");


        */
        LinkedList<Integer> lnkList = new LinkedList<>(); //Para inserciones rápidas: LinkedList
        list.lists(lnkList);
        list.linkedLists(lnkList);

    }
}


class Lists {
    Random random = new Random();
    Scanner sc = new Scanner(System.in);

    public void lists(List<Integer> lista) {

        lista.add(1);
        for (int i = 2; i < 6; i++) {
            lista.add(i);
        }

        System.out.println(lista + "\n" +
                "Tamaño de la lista: " + lista.size());


        System.out.println("generando número aleatorio...");
        int rand = random.nextInt(1, 11);
        System.out.println("Número generado: " + rand + "\n" +
                "verificando si " + rand + " se encuentra en la lista...");
        if (lista.contains(rand)) {
            System.out.println("sí se encuentra. Eliminando elemento...");
            lista.remove(Integer.valueOf(rand));
            // lista.remove((Integer) rand);
            System.out.println("Eliminado");
            System.out.println(lista);
        } else {
            System.out.println("no se encuentra: " + lista);
        }

        System.out.println("Desea reemplazar un elemento?: S|N");
        if (sc.nextLine().equalsIgnoreCase("s")) {
            System.out.println("Ingrese el indice del elemento a reemplazar");
            int posc = sc.nextInt();
            System.out.println("Ingrese el nuevo elemento (entero)");
            int elem = sc.nextInt();
            System.out.println("reemplazando...");
            lista.set(posc, elem);
            System.out.println("Lista actualizada: " + lista);
        }

        System.out.println("Desea eliminar todos los elementos de la lista?: S|N");
        if (sc.nextLine().equalsIgnoreCase("s")) {
            lista.clear();
        }

        if (lista.isEmpty()) {
            System.out.println("La lista está vacía");
        } else {
            System.out.println(lista);
        }
    }

    public void linkedLists(LinkedList<Integer> linkedlist) {

        if (linkedlist.isEmpty()) {
            System.out.println("Lista vacía. Agregando un nùmero aleatorio...");
            linkedlist.addFirst(random.nextInt(1, 11));
            System.out.println(linkedlist);
        }

        System.out.println("rellenando la lista con más números aleatorios...");
        for (int i = 2; i < 6; i++) {
            linkedlist.add(random.nextInt(1, 11));
        }
        System.out.println(linkedlist);

        System.out.println("Removiendo el primer elemento...");
        linkedlist.removeFirst();
        System.out.println(linkedlist);
        System.out.println("Removiendo el úlimo elemento...");
        linkedlist.removeLast();
        System.out.println(linkedlist);

        System.out.println("Ahora el primer elemento es:" + linkedlist.getFirst() +
                " y el último es: " + linkedlist.getLast());
    }

    public void stacks (Stack<Integer> stack){
        if (stack.isEmpty()){
            System.out.println("La pila está vacía. Rellenado con números aleatorios...");
        }
    }
}
