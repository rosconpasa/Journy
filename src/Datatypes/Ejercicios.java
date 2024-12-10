package Datatypes;

import java.util.Scanner;

public class Ejercicios {

    Scanner sc = new Scanner(System.in);
    int op;

    int entero;
    double decimal;
    String cadena;
    float a;
    float b;


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

    public void doubleAint() {
        System.out.println("Ingrese un double");
        decimal = sc.nextDouble();
        System.out.println("Pasando a int...se perderán los decimales");
        entero = (int) decimal; //casting explicito
        System.out.println("Hecho. \n" +
                "Número entero: " + entero);
    }

    public void stringAint() {
        System.out.println("Ingrese un número entero");
        cadena = sc.nextLine();
        System.out.println("Pasando a número...");
        entero = Integer.parseInt(cadena);
        System.out.println("Hecho.");
    }

    public String operarFloat() {

        System.out.println("Ingrese un float a y un float b");
        a = sc.nextFloat();
        b = sc.nextFloat();

        String res = "Suma: " + (a + b) + "\n" +
                "Resta: " + (a - b) + "\n" +
                "Multiplicación: " + (a * b) + "\n" +
                "División:" + (a / b);
        return res;
    }

    public double areaCirculo() {

        final double PI = 3.1416; //Creando una dato que no varía o constante
        System.out.println("Ingrese el radio del círculo");
        double radio = sc.nextDouble();
        double res = PI * Math.pow(radio, 2);
        //System.out.println("Usando la constante de java: "+Math.PI*Math.pow(radio, 2));
        return res;
    }

    public boolean sonIguales() {

        boolean yesnt;

        System.out.println("Ingrese un entero y luego otro");
        a = sc.nextInt();
        b = sc.nextInt();

        if (a == b) {
            yesnt = true;
        } else {
            yesnt = false;
        }

        return yesnt;
    }

}
