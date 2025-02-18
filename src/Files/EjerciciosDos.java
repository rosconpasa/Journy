package Files;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import Files.Ejercicios;

public class EjerciciosDos {
    Path raiz = Paths.get(Ejercicios.ruta);


    Scanner sc = new Scanner(System.in);

    public String nombreArchivo() {
        System.out.println("Ingrese el nombre del archivo:");
        return sc.nextLine();
    }

    public void crearArchivo() {
        System.out.println("Indica la carpeta:");
        Path ruta_completa = Paths.get(raiz.toString(), sc.nextLine());
        System.out.println(ruta_completa);
        try {
            Path archivo = Paths.get(ruta_completa.toString(), nombreArchivo());
            if (!Files.exists(archivo)) {
                Files.createFile(archivo);
                System.out.println("Creado con éxito.");
            } else {
                System.out.println("Este Archivo ya existe.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void crearDirectorio() {
        System.out.println("Ingrese el nombre del directorio:");
        String dir = sc.nextLine();
        Path carpeta = Paths.get(raiz.toString(), dir);
        System.out.println(carpeta.toAbsolutePath());
        try {
            if (Files.exists(carpeta)) {
                System.out.println("Ya existe una carpeta con este nombre");
            } else {
                Files.createDirectory(carpeta);
                System.out.println("Creado correctamente: " + carpeta.toAbsolutePath());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Path rutaArchivo() {
        System.out.println("Indique la ruta del archivo o carpeta:");
        String ruta = sc.nextLine();
        return Paths.get(raiz.toString(), ruta);
    }

    public void copiarArchivoOcarpeta() {
        Path ruta_completa = rutaArchivo();
        Path rutaCopias = Paths.get(raiz.toString(), "Copias");
        Path destino = Paths.get(rutaCopias.toString(), ruta_completa.getFileName().toString());
        if (Files.exists(ruta_completa)) {
            try {
                Path copia = Files.copy(ruta_completa, destino);
                System.out.println("Copiado con éxito");
                System.out.println(copia.toAbsolutePath());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("Archivo o carpeta no existe");
        }
    }

    public void escribirArchivo(){
        Path full_path = rutaArchivo();

        if (Files.isWritable(full_path)){
            try {
                System.out.println("ingrese el contenido");
                String text = sc.nextLine();
                BufferedWriter writer = Files.newBufferedWriter(full_path);
                writer.newLine();
                writer.write(text);
                writer.close();
            }catch (IOException e){
                throw new RuntimeException(e);
            }
        }else{
            System.out.println("No se puede esribir en este archivo.");
        }
    }

    public void leerArchivo() {
        Path full_path = rutaArchivo();
        if (Files.isWritable(full_path)) {
            try {
                List<String> lineas = Files.readAllLines(full_path);
                for (String linea : lineas ){
                    System.out.println(linea);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else{
            System.out.println("Este archivo no puede leerse.");
        }
    }

    //Para archivos grandes
    public void leerArchivo2(){
        Path full_path = rutaArchivo();
        if (Files.exists(full_path)){
            try {
                BufferedReader reader = Files.newBufferedReader(full_path);
                String line;
                while ((line = reader.readLine()) != null){
                    System.out.println(line);
                }
                reader.close();
            }catch (IOException e){
                throw new RuntimeException(e);
            }
        }
    }

    public void mostrarDirectorio() {
    }

    public void mostrarCarpetasYarchivos(Path raiz) {

    }

    public void elegirDirectorio() {

    }

    public void eliminarArchivo() {
        Path full_path = rutaArchivo();

        if (Files.exists(full_path)) {
            try {
                Files.delete(full_path);
                System.out.println("Eliminado con éxito");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("Archivo no existe.");
        }
    }

    public void renombrarArchivo() {

    }

    public void moverArchivo() {

    }

}
