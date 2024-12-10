package Datatypes;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        Ejercicios ejercicios = new Ejercicios();

        do {
            System.out.println("_____________Menú_____________\n" +
                    "1. Convertir tipos de datos\n" +
                    "2.\n" +
                    "0. Cerrar");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    ejercicios.Menu();
                    break;
            }

        } while (op != 0);

    }
}
