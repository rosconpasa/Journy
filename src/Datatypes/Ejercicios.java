package Datatypes;

import java.util.Scanner;

public class Ejercicios {

    Scanner sc = new Scanner(System.in);
    int op;

    int entero;
    double decimal;
    String cadena;


    public void Menu() {

        do {
            System.out.println("Ingrese una opción\n" +
                    "1. Int  a Double\n" +
                    "2. double a int\n" +
                    "3. String a int");

            op = sc.nextInt();

            switch (op) {
                case 1:
                    intADouble();
                    break;

                case 2:
                    doubleAint();
                    break;

                case 3:

                    break;
            }
        } while (op != 0);


    }

    public void intADouble() {
        System.out.println("Ingrese un entero");
        entero = sc.nextInt();
        System.out.println("Pasando a double...");
        decimal = entero; //casting implicito
        System.out.println("Hecho. \n" +
                "Número decimal: " + decimal);

    }

    public void doubleAint(){
        System.out.println("Ingrese un double");
        decimal=sc.nextDouble();
        System.out.println("Pasando a int...se perderán los decimales");
        entero=(int)decimal; //casting explicito
        System.out.println("Hecho. \n" +
                "Número entero: "+entero);
    }

    public void stringAint() {
        System.out.println("Ingrese un número entero");
        cadena = sc.nextLine();
        System.out.println("Pasando a número...");
        entero=Integer.parseInt(cadena);
        System.out.println("Hecho.");
    }


}
