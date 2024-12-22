package Listas;

import java.util.*;

public class Ejercicios {
    int op;
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    List<Integer> arraylist = new ArrayList<>();
    List<Integer> arraylist2 = new ArrayList<>();
    int posc;

    public void menuArrayList() {
        do {
            System.out.println("__________Submenu ArraysList_________\n" +
                    "1. Rellenar lista\n" +
                    "2. Mostrar lista\n" +
                    "3. Actualizar elementos\n" +
                    "4. Buscar elemento\n" +
                    "5. Eliminar elemento\n" +
                    "6. Insertar en posc específica\n" +
                    "7. Agregar lista\n" +
                    "8. Limpiar lista\n" +
                    "9. Eliminar coincidencias\n" +
                    "10. Ordenar lista\n" +
                    "0. Cerrar");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    rellenarLista(arraylist);
                    break;
                case 2:
                    mostrarLista(arraylist);
                    break;
                case 3:
                    actualizarElementos(arraylist);
                    break;

                case 4:
                    buscarElemento(arraylist);
                    break;

                case 5:
                    eliminarElemento(arraylist);
                    break;

                case 6:
                    insertarEspecific(arraylist);
                    break;

                case 7:
                    agregarLista(arraylist);
                    break;

                case 8:
                    limpiarLista(arraylist);
                    break;

                case 9:
                    borrarCoindidencias();
                    break;

                case 10:
ordenarLista(arraylist);
                    break;
            }
        } while (op != 0);
    }

    public void rellenarLista(List<Integer> arraylist) {
        System.out.println("Rellenando lista con numeros aleatorios");

        for (int i = 0; i < 5; i++) {
            arraylist.add(random.nextInt(1, 101));
            System.out.print(arraylist.get(i) + ", ");
        }
        System.out.println();
    }

    public void mostrarLista(List<Integer> arraylist) {
        if (arraylist.isEmpty()) {
            System.out.println("Cree una lista primero");
        } else {

            for (Integer elem : arraylist) {
                System.out.print(elem + ", ");
            }
            System.out.println();
        }
    }

    public void actualizarElementos(List<Integer> arraylist) {
        if (arraylist.isEmpty()) {
            System.out.println("Cree un arraylist primero");
        } else {
            System.out.println("Multiplicar cada elemento de la lista x2");
            for (int i = 0; i < arraylist.size(); i++) {
                arraylist.set(i, arraylist.get(i) * 2);
                System.out.println(arraylist.get(i));
            }
        }
    }

    public void buscarElemento(List<Integer> arraylist) {
        if (arraylist.isEmpty()) {
            System.out.println("Cree una lista primero");
        } else {
            System.out.println("Ingrese el elemento a buscar");
            int elem = sc.nextInt();
            if (arraylist.contains(elem)) {
                posc = arraylist.indexOf(elem);
                System.out.println("Elemento " + elem + " encontrado en la posición: " + posc);
            } else {
                System.out.println("Elemento no encontrado");
            }
        }
    }

    public void eliminarElemento(List<Integer> arraylist) {
        if (arraylist.isEmpty()) {
            System.out.println("Cree un arrayList primero");
        } else {
            System.out.println("Ingrese la posición del elemento a eliminar");
            posc = sc.nextInt();
            System.out.println("Eliminando");
            arraylist.remove(posc);
            System.out.println("Elemento eliminado");
            mostrarLista(arraylist);
        }
    }

    public void insertarEspecific(List<Integer> arraylist){
        System.out.println("Ingrese la posición para insertar");
        posc = sc.nextInt();
        arraylist.add(posc, random.nextInt(1, 101));
    }

    public void agregarLista(List<Integer> arraylist){
        System.out.println("Lista 1:");
        mostrarLista(arraylist);
        rellenarLista(arraylist2);
        System.out.println("Lista 2:");
        mostrarLista(arraylist2);
        System.out.println("Agregar lista2 a lista1");
        arraylist.addAll(arraylist2);
        System.out.println("Nueva lista:");
        mostrarLista(arraylist);
    }

    public void limpiarLista(List<Integer> arraylist){
        System.out.println("Borrando elementos...");
        arraylist.clear();
    }

    public void borrarCoindidencias(){
        arraylist.clear();
        arraylist2.clear();
        System.out.println("lista 1");
        rellenarLista(arraylist);
        System.out.println("Lista 2");
        rellenarLista(arraylist2);
        System.out.println("Borrar elementos de la lista 1 que se encuentran en la lista 2");
        arraylist.removeAll(arraylist2);

        if (arraylist.size()<arraylist2.size()){
            System.out.println("Elemento(s) eliminado(s)");
        }
        mostrarLista(arraylist);

    }

    public void ordenarLista(List<Integer> arraylist){
        System.out.println("Lista original");
        mostrarLista(arraylist);
        System.out.println("Lista ordenada");
        Collections.sort(arraylist);
        mostrarLista(arraylist);
    }
}
