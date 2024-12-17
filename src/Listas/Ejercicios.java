package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ejercicios {
    int op;
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    List<Integer> arraylist = new ArrayList<>();

    public void menuArrayList() {
        do {
            System.out.println("__________Submenu ArraysList_________\n" +
                    "1. Rellenar ArrayList\n" +
                    "2. Actualizar elementos\n" +
                    "3. Buscar elemento\n" +
                    "4. Eliminar elemento\n" +
                    "5. \n" +
                    "6. \n" +
                    "7. \n" +
                    "0. Cerrar");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    rellenarLista(arraylist);
                    break;

                case 2:
                    actualizarElementos(arraylist);
                    break;

                case 3:
                    buscarElemento(arraylist);
                    break;
            }
        } while (op != 0);
    }

    public void rellenarLista(List<Integer> arraylist) {
        System.out.println("Rellenando lista con numeros aleatorios");

        for (int i = 0; i < 5; i++) {
            arraylist.add(random.nextInt(1, 101));
            System.out.println(arraylist.get(i));
        }
        arraylist.addFirst(10000);
    }

    public void actualizarElementos(List<Integer> arraylist) {
        if (arraylist.isEmpty()) {
            System.out.println("Cree un arraylist primero");
        } else {
            System.out.println("Multiplicar cada elemento de la lista x2");
            for (int i = 0; i < arraylist.size(); i++) {
                arraylist.set(i, arraylist.get(i) * 2);
                System.out.println(arraylist.get(i));
            }
        }
    }

    public void buscarElemento(List<Integer> arraylist) {
        System.out.println("Ingrese el elemento a buscar");
        int elem = sc.nextInt();
        if (arraylist.contains(elem)) {
            int posc = arraylist.indexOf(elem);
            System.out.println("Elemento " + elem + " encontrado en la posición: " + posc);
        } else {
            System.out.println("Elemento no encontrado");
        }
    }
}
