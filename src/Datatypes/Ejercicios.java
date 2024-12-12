package Datatypes;

import javax.print.attribute.SetOfIntegerSyntax;
import java.util.Scanner;

public class Ejercicios {

    Scanner sc = new Scanner(System.in);
    int op;

    int entero;
    double decimal;
    String cadena, cadena2;
    float a;
    float b;
    StringBuilder texto;
    String cadena3 = "Hola";


    public void SubMenuConvertir() {

        do {
            System.out.println("____________Submenu convertir_____________\n" +
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

    public void SubMenuCadenas() {

        do {
            System.out.println("____________Submenu cadenas_____________\n" +
                    "1. Longitud\n" +
                    "2. Comparar cadenas\n" +
                    "3. Concatenar\n" +
                    "4. Subcadenas\n" +
                    "5. Invertir cadena\n" +
                    "6. Contar vocales\n" +
                    "7. Palíndromo\n" +
                    "8. Contiene palabra\n" +
                    "9. Dividir cadena\n" +
                    "0. Cerrar");

            op = sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:
                    longCadena();
                    break;

                case 2:
                    compararCadena();
                    break;

                case 3:
                    System.out.println(concatenar());
                    break;

                case 4:
                    subcadena();
                    break;

                case 5:
                    invertirCadena();
                    break;

                case 6:
                    contarVocales();
                    break;

                case 7:
                    palindromo();
                    break;

                case 8:
                    contieneCadena();
                    break;

                case 9:
                    dividirCadena();
                    break;
            }
        } while (op != 0);

    }

    public void longCadena() {
        System.out.println("Ingrese su nombre completo");
        cadena = sc.nextLine().replace(" ", ""); // replace para quitar todos los espaios
        // cadena=cadena.trim(); para borrar espacios al principio y final
        System.out.println("Longitud:" + cadena.length()); //.lenght para obtener el tamaño
    }

    public void compararCadena() {
        String passw;
        System.out.println("Contraseña nueva:");
        passw = sc.nextLine();
        System.out.println("Confirmar contraseña:");

        if (sc.nextLine().equals(passw)) { //.equals para comparar cadenas. .equalsIgnoreCase para obviar mayuscula o minuscula
            System.out.println("Contraseña cambiada");
        } else {
            System.out.println("Confirmación no coincide");
        }
    }

    public String concatenar() {
        System.out.println("Ingrese una cadena");
        cadena = sc.nextLine();
        System.out.println("Ingrese la cadena que desea concatenar");
        cadena2 = sc.nextLine();

        return "Concatenación: " + cadena + " ".concat(cadena2);
    }

    public void subcadena() {
        String str = new String();
        str = "Hola mundo";

        System.out.println("Extraiga una de las palabras de la frase: " + str);

        int beg, end;

        System.out.println("Ingrese el número de la posición donde empieza la palabra (empieza en 0)");
        beg = sc.nextInt();
        System.out.println("Ingrese el número de la posición donde termina la palabra (+1 unidad)");
        end = sc.nextInt();

        System.out.println("Subcadena extraída: " + str.substring(beg, end));

    }

    public void invertirCadena() {
        System.out.println("Ingrese una cadena");
        cadena = sc.nextLine();
        cadena2 = "";

        System.out.println("Invirtiendo...");

        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadena2 = cadena2 + cadena.charAt(i);
        }

        System.out.println("Cadena invertida: " + cadena2);

        /*Usar StringBuilder para invertir

        StringBuilder cadena3 = new StringBuilder(cadena);
        System.out.println("Cadena invertida: "+cadena3.reverse());*/
    }

    public void contarVocales() {
        System.out.println("Ingrese una cadena");
        cadena = sc.nextLine().toLowerCase();
        System.out.println("Contando vocales...");
        int contador = 0;
        char a;
        for (int i = 0; i < cadena.length(); i++) {
            a = cadena.charAt(i);
            if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
                contador++;
            }
        }
        if (contador > 0) {
            System.out.println("La cadena contiene: " + contador + " vocales");
        } else {
            System.out.println("La cadena no contiene vocales");
        }
    }

    public void palindromo() {
        System.out.println("Ingrese un palíndromo");
        cadena = sc.nextLine();

        System.out.println("Procesando...");

        cadena2 = "";

        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadena2 = cadena2 + cadena.charAt(i);
        }

        if (cadena.equals(cadena2)) {
            System.out.println("Es un palíndromo");
        } else {
            System.out.println("No es un palíndromo");
        }
    }

    public void contieneCadena() {

        String cadena = "Hola, mundo...";
        System.out.println("Frase: " + cadena);
        cadena = cadena.toLowerCase();

        System.out.println("Ingrese la palabra a buscar");
        cadena2 = sc.nextLine().toLowerCase();


        if (cadena.contains(cadena2)) {
            System.out.println("Palabra encontrada");
        } else {
            System.out.println("Palabara no encontrada");
        }

    }

    public void dividirCadena() {
        System.out.println("Escriba varias palabras separadas por comas");
        cadena = sc.nextLine();

        String[] palabras = cadena.split(",");
        System.out.println("Palabras:");
        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i]);
        }
    }

    public void submenuSB() {
        do {

            System.out.println("___________Submenu Stringbuilder____________\n" +
                    "1. Insertar texto\n" +
                    "2. Agregar texto al final\n" +
                    "3. Invertir texto\n" +
                    "4. Reemplazar texto\n" +
                    "5. Eliminar palabra\n" +
                    "0. Cerrar");

            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    insertarTexto();
                    break;

                case 2:
                    agregarTexto();
                    break;

                case 3:
                    invertirTexto();
                    break;

                case 4:
                    reemplazarTexto();
                    break;

                case 5:
                    eliminarPalabra();
                    break;
            }
        } while (op != 0);


    }

    public void insertarTexto() {
        texto = new StringBuilder("Aprender es divertido");

        System.out.println(texto+"\n Ingresa 'Java' depúes de 'aprender' ");
        texto.insert(9, sc.nextLine()+" ");
        System.out.println("Nuevo texto: " + texto);

    }

    public void agregarTexto(){
        texto= new StringBuilder(cadena3);
        System.out.println("Frase: "+texto);

        System.out.println("¿Qué palabra desea agregar?");
        texto.append(sc.nextLine());

        System.out.println("Nueva frase: "+texto);
    }

    public void invertirTexto(){
        System.out.println("Ingresa un texto");
        texto = new StringBuilder(sc.nextLine());
        System.out.println("Texto invertido: "+texto.reverse());
    }

    public void  reemplazarTexto(){
        texto = new StringBuilder(cadena3);

        System.out.println("Texto: "+texto);
        System.out.println("¿Con qué palabra desea reemplazarlo?");
        texto.replace(0, texto.length(), sc.nextLine());

        System.out.println("Nuevo texto:" +texto);
    }

    public void eliminarPalabra(){
        texto=new StringBuilder("Aprender Java es divertido.");
        System.out.println("Frase: "+texto+"\n" +
                "¿Qué palabra desea eliminar? ");

        cadena = sc.nextLine().toLowerCase();
        cadena2 = texto.toString().toLowerCase();

        if (cadena2.contains(cadena)){
            int a = cadena2.indexOf(cadena);
            int b = a + cadena.length();
            texto.delete(a,b);

            System.out.println("Nueva frase: "+texto);
        }else{
            System.out.println("Palabra no encontrada");
        }
    }



}

