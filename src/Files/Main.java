package Files;

import Listas.Ejercicios2;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Ejercicios ejercicios = new Ejercicios();

        //ejercicios.crearArchivo();
        //ejercicios.escribirArchivo();
        //ejercicios.leerArchivo();
        // ejercicios.abrirArchivo();

        EjerciciosDos ejerciciosDos = new EjerciciosDos();
        //ejerciciosDos.crearArchivo();
        // ejerciciosDos.crearDirectorio();
        //ejerciciosDos.copiarArchivoOcarpeta();
        //ejerciciosDos.eliminarArchivo();
        ejerciciosDos.escribirArchivo();
        ejerciciosDos.leerArchivo();
    }
}
