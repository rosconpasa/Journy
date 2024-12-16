package DataStructures;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ejercicios ejercicios = new Ejercicios();

        int op;

        do {

            System.out.println("------------Menú principal-----------\n" +
                    "1. Arrays\n" +
                    "2. Arrays bidimensionales\n" +
                    "3. \n" +
                    "0. Salir");

            op=sc.nextInt();

            switch (op){
                case 1:
                    ejercicios.arrays();
                    break;

                case 2:
                    ejercicios.ArrayBidimensional();
                    break;
            }
        } while (op != 0);
    }
}
