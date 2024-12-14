package DataStructures;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicios {
    Scanner sc = new Scanner(System.in);
    int op;
    int tam;
    int suma = 0;
    int[] numeros;
    int[] numeros2;
    Random random = new Random();

    public void arrays() {
        do {
            System.out.println("_________Submenu arrays______________\n" +
                    "1. Crear array\n" +
                    "2. Sumar todos los elementos\n" +
                    "3. Sumar dos arreglos\n" +
                    "4. Encontrar mayor y menor elemento\n" +
                    "5. Invertir array\n" +
                    "0. Salir");

            op = sc.nextInt();

            switch (op) {
                case 1:
                    numeros = crearArray();
                    break;

                case 2:
                    sumarTodo(numeros);
                    break;

                case 3:

                    numeros = crearArray();
                    numeros2 = crearArray();
                    sumarDosArrays(numeros, numeros2);

                    break;

                case 4:
                    System.out.println(Arrays.toString(numeros));
                    mayorYmenor(numeros);
                    break;

                case 5:
                    System.out.println("Array original: "+Arrays.toString(numeros));
                    invertirArray(numeros);
                    break;
            }

        } while (op != 0);
    }

    public int[] crearArray() {
        System.out.println("Ingrese el tamaño del array");
        tam = sc.nextInt();
        int[] array = new int[tam];
        System.out.println("Llenando arrays con números aleatorios...");

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 11);
        }

        System.out.println(Arrays.toString(array));
        return array;
    }

    public void sumarTodo(int[] array) {
        for (int i = 0; i < array.length; i++) {
            suma = suma + array[i];
        }

        System.out.println("Suma: " + suma);
    }

    public void sumarDosArrays(int[] array1, int[] array2) {
        suma = 0;

        if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
                suma = suma + (array1[i] + array2[i]);
            }
        } else {
            System.out.println("Los arrays deben ser del mismo tamaño.");
        }
        System.out.println("Suma: " + suma);
    }

    public void mayorYmenor(int[] array) {
        int may = Integer.MIN_VALUE;
        int men = Integer.MAX_VALUE;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > may) {
                may = array[i];
            } else if (array[i] < men) {
                men = array[i];
            }
        }

        System.out.println("Menor: " + men + ". Mayor: " + may);
    }

    public void invertirArray(int[] array) {
        int j = array.length-1;
        int temp;
        for (int i = 0 ; i <= array.length/2; i++) {
            temp =array[j];
            array[j]=array[i];
            array[i] = temp;
            j--;
        }
        System.out.println("Array invertido:" + Arrays.toString(array));
    }

}
