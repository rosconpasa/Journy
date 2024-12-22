package Listas;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
import java.util.List;

public class Ejercicios2 {
    int op;
    Scanner sc = new Scanner(System.in);
    List<Integer> linkedlist = new LinkedList<>();
    Random random = new Random();

    public void menuLinkedList() {
        do {
            System.out.println("__________Submenu LinkedList__________\n" +
                    "1. Rellenar lista\n" +
                    "2. Mostrar lista\n" +
                    "3. Insertar otra lista\n" +
                    "4. \n" +
                    "5. \n" +
                    "6. \n" +
                    "7. \n" +
                    "0. Cerrar");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    rellenarLista(linkedlist);
                    break;

                case 2:
                    mostrarLista(linkedlist);
                    break;


                case 3:
                    agregarLista(linkedlist);
                    break;
            }

        } while (op != 0);
    }

    public void rellenarLista(List<Integer> lista) {
        for (int i = 0; i < 5; i++) {
            lista.add(random.nextInt(1, 101));
            System.out.print(lista.get(i) + ", ");
        }
        System.out.println();
    }

    public void mostrarLista(List<Integer> lista) {
        System.out.print("Lista: ");
        for (Integer elem : lista) {
            System.out.print(elem+", ");
        }
        System.out.println();
    }

    public void agregarLista(List<Integer> lista){
        List<Integer> linkedlist2 = new LinkedList<>();
        System.out.println("Lista 1:");
        mostrarLista(lista);
        System.out.println("Lista 2:");
        rellenarLista(linkedlist2);
        System.out.println("Insertar lista 2 a lista 1:");
        lista.addAll(linkedlist2);
        mostrarLista(lista);
    }
}
