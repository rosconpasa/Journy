package Set.HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetEjercicios {
    static Scanner sc = new Scanner(System.in);

    public static void showItems(HashSet<String> hs){
        System.out.print("Items:");
        for (String item: hs){
            System.out.print(item+", ");
        }
        System.out.println();
    }

    public static void addItem(HashSet<String> hs){
        System.out.println("Ingrese un elemento:");
        String item = sc.nextLine().toLowerCase();
        if (hs.contains(item)){
            System.out.println("Este elemento ya exitse.");
        }else{
            hs.add(item);
            System.out.println("Agregado.");
            showItems(hs);
        }

    }

    public static void removeItem (HashSet<String> hs){
        System.out.println("Ingresa el elemento a eliminar:");
        String item = sc.nextLine().toLowerCase();
        if (hs.contains(item)){
            hs.remove(item);
            System.out.println("Removido");
            showItems(hs);
        }else{
            System.out.println("Este elemento no existe.");
        }
    }

    public static void removeAllItems (HashSet<String> hs){
        System.out.println("Seguro que quiere borrar todo?: Sí|No");
        if (sc.nextLine().equalsIgnoreCase("si")){
            hs.clear();
            System.out.println("Items eliminados.");
        }else{
            System.out.println("Abortano...");
        }
    }
}
