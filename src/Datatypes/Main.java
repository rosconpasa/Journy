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
                    "2. Operaciones (con float)\n" +
                    "3. Uso de constante: área de un círculo\n" +
                    "4. Comparar datos (int)\n" +
                    "5. \n" +
                    "0. Cerrar");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    ejercicios.Menu();
                    break;

                case 2:
                    System.out.println(ejercicios.operarFloat());
                    break;

                case 3:
                    System.out.println("Área: "+ejercicios.areaCirculo());
                    break;

                case 4:
                    if (ejercicios.sonIguales()){
                        System.out.println("Son iguales");
                    }else{
                        System.out.println("No son iguales");
                    }
                    break;
            }

        } while (op != 0);

    }
}
