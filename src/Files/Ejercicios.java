package Files;

import java.awt.*;
import java.io.*;
import java.nio.file.Files;
import java.util.Scanner;

public class Ejercicios {

    public static final String ruta = "C:/Archivos/";
    Scanner sc = new Scanner(System.in);

    public void crearDirectorio() {
        System.out.println("Ingrese el nombre del directorio:");
        String nom_directorio = sc.nextLine();
        File directorio = new File(ruta, nom_directorio);
        if (directorio.exists()) {
            System.out.println("Ya existe un directorio con este nombre");
        } else {
            if (directorio.mkdir()) {
                System.out.println("Directorio creado. " + directorio.getAbsolutePath());
            }
        }
    }

    public void mostrarDirectorio() {
        File raiz = new File(ruta);
        mostrarCarpetasYarchivos(raiz);
    }

    public void mostrarCarpetasYarchivos(File raiz) {
        File[] elementos = raiz.listFiles();
        if (elementos != null) {
            for (File elem : elementos) {
                if (elem.isDirectory()) {
                    System.out.println("Carpeta: " + elem.getName());

                    mostrarCarpetasYarchivos(elem);
                } else {
                    System.out.println("      " + elem.getName());
                }
            }
        }
    }

    public File elegirDirectorio() {
        mostrarDirectorio();
        System.out.println("Indique el directorio:");
        String dir = sc.nextLine();
        return new File(ruta, dir);
    }

    public void crearArchivo() {
        File directorio = elegirDirectorio();
        System.out.println(directorio.getAbsolutePath());

        if (directorio.exists() && directorio.isDirectory()) {
            String nom = nombreArchivo();
            File archivo = new File(directorio, nom);
            try {
                if (archivo.exists()) {
                    System.out.println("Ya existe un archivo con ese nombre.");
                } else {
                    archivo.createNewFile();
                    System.out.println("Archivo creado.");
                }

            } catch (IOException e) {
                System.out.println("Ha ocurrido un problema." + e.getMessage());
            }
        } else {
            System.out.println(directorio.getName() + " no existe.");
        }
    }


    public String nombreArchivo() {
        System.out.println("Indique el nombre del archivo:");
        return sc.nextLine();
    }

    public void moverArchivo() {
        mostrarDirectorio();
        File directorio;
        System.out.println("Indica el archivo a mover");
        String nombre_archivo = sc.nextLine();
        File file = new File(nombre_archivo);
        if (file.exists()) {
            System.out.println("Ingrese el directorio de destino");
            directorio = elegirDirectorio();
            File filemoved = new File(directorio, file.getName());
            if (file.renameTo(filemoved)) {
                System.out.println(file.getName() + " movido con éxito.");
            } else {
                System.out.println("No se pudo mover.");
            }
        } else {
            System.out.println(file.getName() + " no existe.");
        }
    }

    public void renombrar() {
        File directorio = elegirDirectorio();
        System.out.println(directorio.getAbsolutePath());
        System.out.println("Indica el archivo:");
        String archivo = sc.nextLine();
        File file = new File(directorio.getParent(), archivo);
        if (file.exists()) {
            System.out.println("Nuevo nombre:");
            String nuevo_nombre = sc.nextLine();
            File nuevonombre = new File(directorio, nuevo_nombre);
            if (file.renameTo(nuevonombre)) {
                System.out.println("Hecho");
            }
        } else {
            System.out.println(file.getName() + " no existe.");
        }
    }


    public void eliminarArchivo(File file) throws FileNotFoundException {
        if (file.exists()) {
            file.delete();
            System.out.println("Archivo eliminado.");
        } else {
            System.out.println("No se pudo eliminar");
        }
    }

    public void eliminarArchivo() {
        String ruta = "C:/Archivos/" + nombreArchivo();
        File archivo = new File(ruta);
        if (archivo.delete()) {
            System.out.println(archivo.getName() + " eliminado.");
        } else {
            System.out.println("No se pudo eliminar.");
        }
    }

    public void escribirArchivo() {
        File directorio = elegirDirectorio();
        File archivo = new File(directorio, nombreArchivo());
        try {
            if (archivo.canWrite() && archivo.exists()) {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(archivo, true));

                // FileWriter fileWriter = new FileWriter(archivo, true);

                System.out.println("Escriba lo que quiera en el archivo");
                String texto = sc.nextLine();

                bufferedWriter.newLine();
                bufferedWriter.write(texto);
                bufferedWriter.close();

                /*fileWriter.write("\n");
                fileWriter.write(texto);
                fileWriter.close();*/
                System.out.println("Realizado con éxito");
            } else {
                System.out.println(archivo.getName() + " no existe o no se puede esribir");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void leerArchivo() {
        File archivo = elegirArchivo();
        try {
            if (archivo.canRead() && archivo.exists()) {
                FileReader fileReader = new FileReader(archivo);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String linea;
                while ((linea= bufferedReader.readLine()) !=null){
                    System.out.println(linea);
                }
                bufferedReader.close();
            }else{
                System.out.println("El archivo no existe o no puede leerse");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public File elegirArchivo(){
        File directorio = elegirDirectorio();
        File archivo = new File(directorio, nombreArchivo());
        return archivo;
    }

    public void abrirArchivo(){
        File archivo = elegirArchivo();
        if (archivo.exists()){
            try {
                Desktop.getDesktop().open(archivo);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }





}
