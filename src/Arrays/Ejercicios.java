package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicios {
    Scanner sc = new Scanner(System.in);
    int op;
    int tam, tam2;
    int suma = 0;
    int[] numeros;
    int[] numeros2;
    Random random = new Random();
    int[][] matriz;

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
                    System.out.println("Array original: " + Arrays.toString(numeros));
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
        int j = array.length - 1;
        int temp;
        for (int i = 0; i <= array.length / 2; i++) {
            temp = array[j];
            array[j] = array[i];
            array[i] = temp;
            j--;
        }
        System.out.println("Array invertido:" + Arrays.toString(array));
    }

    public void ArrayBidimensional() {
        do {
            System.out.println("__________Submenú Arrays bidimensionales____________\n" +
                    "1. Crear Matriz\n" +
                    "2. Sumar todos los elementos\n" +
                    "3. Sumar filas y columnas\n" +
                    "4. Elemento mayor y menor\n" +
                    "5. \n" +
                    "6. \n" +
                    "0. Salir");

            op = sc.nextInt();

            switch (op) {
                case 1:
                    crearMatriz();
                    break;

                case 2:
                    sumaTodoMatriz(matriz);
                    break;

                case 3:
                    sumaFilayColumna(matriz);
                    sumaFilaYColumna2(matriz);
                    break;

                case 4:
                    mayorYmenorMatriz(matriz);
                    break;
            }
        } while (op != 0);
    }

    public int[][] crearMatriz() {
        System.out.println("Ingresa el número de filas");
        tam = sc.nextInt();
        System.out.println("Ingrese el número de columnas");
        tam2 = sc.nextInt();

        matriz = new int[tam][tam2];

        System.out.println("Llenando matriz con números aleatorios...");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(1, 21);
            }
        }

        System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println("");
        }
        return matriz;
    }

    public void sumaTodoMatriz(int matriz[][]) {
        if (matriz == null) {
            System.out.println("Debe crear una matriz primero");
        } else {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    suma = suma + matriz[i][j];
                }
            }
            System.out.println("Suma es: " + suma);
        }
    }

    public void sumaFilayColumna(int matriz[][]) {
        if (matriz == null) {
            System.out.println("Debe crear una matriz primero");
        } else {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j <matriz[i].length ; j++) {
                    suma=suma+matriz[i][j];
                }
                System.out.println("Suma fila: "+i+": "+suma);
                suma=0;
            }

            for (int j = 0; j < matriz.length; j++) {
                for (int i = 0; i <matriz[j].length ; i++) {
                    suma=suma+matriz[i][j];
                }
                System.out.println("Suma columna: "+j+": "+suma);
                suma=0;
            }
        }
    }

    public void sumaFilaYColumna2(int matriz[][]){
        if (matriz== null){
            System.out.println("Primero debe crear una matriz");
        }else{
            int sumF[]= new int[matriz.length];
            int sumC[] = new int[matriz[0].length];

            for (int i = 0; i <matriz.length ; i++) {
                for (int j = 0; j <matriz[i].length ; j++) {
                    sumF[i]+=matriz[i][j];
                    sumC[j]+=matriz[i][j];
                }
            }

            System.out.println("Suma todas filas: "+Arrays.toString(sumF));
            System.out.println("Suma todas columnas: "+Arrays.toString(sumC));
        }
    }

    public void mayorYmenorMatriz(int matriz[][]){
        int menor=Integer.MAX_VALUE;
        int mayor = Integer.MIN_VALUE;
        if (matriz == null){
            System.out.println("Primero debe crear una matriz");
        }else{
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                    if (matriz[i][j]>mayor){
                        mayor=matriz[i][j];
                    } else if (matriz[i][j]<menor) {
                        menor=matriz[i][j];
                    }
                }
            }

            System.out.println("Elemento mayor: "+mayor+"\n" +
                    "Elemento menor: "+menor);
        }
    }

}
