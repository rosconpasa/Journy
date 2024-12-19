package Listas;


import java.util.ArrayList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ejercicios ejercicios = new Ejercicios();
        int op;

        do {
            System.out.println("------------Menú------------\n" +
                    "1. ArrayList\n" +
                    "2. LinkedList\n" +
                    "3. \n" +
                    "4. \n" +
                    "5. \n" +
                    "0. Cerrar");

            op = sc.nextInt();

            switch (op) {
                case 1:
                    ejercicios.menuArrayList();
                    break;
            }
        } while (op != 0);

    }
}
