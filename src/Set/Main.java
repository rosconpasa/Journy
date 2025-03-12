package Set;

import Set.HashSet.HashSetEjercicios;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> nombres = new HashSet<>();

        for (int i=0; i<5; i++){
            HashSetEjercicios.addItem(nombres);
        }

        HashSetEjercicios.removeItem(nombres);
        HashSetEjercicios.removeAllItems(nombres);
    }
}
