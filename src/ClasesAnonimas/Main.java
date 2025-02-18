package ClasesAnonimas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface Mensaje {
    void escribir();
}

abstract class Animal {
    abstract void hacerSonido();
}

interface Operacion {
    int calcular(int a, int b);
}

interface Saludo {
    String saludoPersonalizado();
}

interface Verificador{
    void esPar(int a);
}



public class Main {
    public static void main(String[] args) {

        new Mensaje() {
            @Override
            public void escribir() {
                System.out.println("Hola mundo");
            }
        }.escribir();

        Animal perro = new Animal() {
            @Override
            public void hacerSonido() {
                System.out.println("Woof");
            }
        };
        perro.hacerSonido();

        new Animal() {
            @Override
            void hacerSonido() {
                System.out.println("Miau");
            }
        }.hacerSonido();

        Operacion suma = new Operacion() {
            @Override
            public int calcular(int a, int b) {
                return a + b;
            }
        };

        System.out.println(suma.calcular(1, 2));

        System.out.println(
                new Operacion() {
                    @Override
                    public int calcular(int a, int b) {
                        return a - b;
                    }
                }.calcular(1, 2)
        );
        System.out.println(new Saludo() {
            @Override
            public String saludoPersonalizado() {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Ingrese su nombre:");
                String nombre = scanner.nextLine();
                return "Hola, "+nombre;
            }
        }.saludoPersonalizado());

        new Verificador(){
            @Override
            public void esPar(int a){
                System.out.print(a);
                if (a%2==0){
                    System.out.println(": Es par");
                }else{
                    System.out.println(": No es par");
                }
            }
        }.esPar(3);


        //Pasar cadenas a mayúsculas
        List<String> cadenas = new ArrayList<>();
        cadenas.add("hola,");
        cadenas.add(" mundo");

        cadenas.forEach(cadena -> System.out.print(cadena.toUpperCase()));



    }

}
