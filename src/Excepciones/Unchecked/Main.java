package Excepciones.Unchecked;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ejercicios ejercicios = new Ejercicios();
        int op;
        int[] array =  {1,2,3,4};
        int[] array2 = null;


        do {
            System.out.println("---------------MENU--------------\n" +
                    "1. Dividir enteros\n" +
                    "2. Obetener elemento array\n" +
                    "3. Cadena a número\n" +
                    "4. Imprimir array\n" +
                    "5. \n" +
                    "6. \n" +
                    "0. Salir");

            try {
                op = sc.nextInt();
                switch (op) {
                    case 1:
                        ejercicios.dividirEnteros();
                        break;

                    case 2:
                        ejercicios.obtenerElemento();
                        break;

                    case 3:
                        ejercicios.cadenaAnumero();
                        break;

                    case 4:
                        ejercicios.imprimirArray(array2);
                        break;

                }
            } catch (InputMismatchException e) {
                System.out.println("Tipo de dato equivocado.");
                break;
            }


        } while (op != 0);
    }


}
