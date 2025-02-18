package Excepciones.Unchecked;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicios {
    int a, b;
    int[] array;
    String cadena;
    Scanner sc = new Scanner(System.in);

    public void dividirEnteros() {
        System.out.println("Ingrese el dividendo y luego el divisor:");
        try {
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println(+a + "/" + b + "=" + a / b);
        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar números enteros.");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void obtenerElemento(){
        array = new int[]{1, 2, 3, 4};
        System.out.print("Array: ");
        for (int elem : array) {
            System.out.print(elem + ", ");
        }
        System.out.println("Ingrese la posición del elemento a obtener:");
        try {
            a=sc.nextInt();
            System.out.println("Elemento en la posc "+a+": "+array[a]);
        }catch (InputMismatchException e){
            System.out.println("Error: Debe ingresar un entero.");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Valor ingresado no se encuentra en el arreglo.");
        }
    }
    public void cadenaAnumero(){
        System.out.println("Ingrese un número");
        cadena=sc.nextLine();
        try {
            System.out.println("Convirtiendo...");
            a=Integer.parseInt(cadena);
            System.out.println("Conversión exitósa");
        }catch (NumberFormatException e){
            System.out.println("Error: el valor ingresado no puede ser convetido a entero.");
        }
    }

    public void imprimirArray(int[] array){
        try {
            for (int elem: array){
                System.out.print("[");
                System.out.print(elem+" ,");
            }
            System.out.print("]");
        }catch (NullPointerException e){
            System.out.println("Error: array no ha sido inicializado. "+e.getMessage());
        }
    }

}
