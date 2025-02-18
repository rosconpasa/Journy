package Lambdas;

interface Operacion {
    int opera(int a, int b);
}

interface EsPar {
    boolean verificar(int a);
}

interface Cadena {
    int hallarLongitud(String cadena);
}


public class Main {
    public static void main(String[] args) {
        //Hacieno uso de lambdas
        Operacion suma = (a, b) -> a + b;
        //int resu = suma.opera(1,2);
        System.out.println("Suma: " + suma.opera(1, 2));

/*
        //Haciendo uso de clases anónimas

        System.out.println(new Operacion() {
            @Override
            public int opera(int a, int b) {
                return a + b;
            }
        }.opera(1, 2));


        int resultado = new Operacion() {
            @Override
            public int opera(int a, int b) {
                return a + b;
            }
        }.opera(1, 2);
        System.out.println(resultado);
*/
        EsPar esPar = (a) -> a%2==0;

        if (esPar.verificar(2)){
            System.out.println("Es par");
        }else {
            System.out.println("No es par");
        }

        Cadena cadena = (a) -> a.length();
        System.out.println("Longitud: "+cadena.hallarLongitud("Hola"));
    }


}
