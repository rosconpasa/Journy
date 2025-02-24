package Comparator;

import java.util.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1, 50);
        }

        //System.out.println(Arrays.toString(numbers));
        // Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        Personas p1 = new Personas("Juan", "Gutuierrez", LocalDate.of(2022, 1, 14));
        Personas p2 = new Personas("Pedro", "Diaz", LocalDate.of(2000, 2, 3));
        Personas p3 = new Personas("Laura", "Almanza", LocalDate.of(1999, 5, 25));

        List<Personas> personas = new ArrayList<>(List.of(p1, p2, p3));

        personas.sort(new ComparadorPersonas());

        System.out.println("Ordenadas de cacuerdo al año de nacimiento:");
        for (Personas p: personas){
            System.out.println(p);
        }

        //Usando una clase anónima
         personas.sort(new Comparator<Personas>(){
            @Override
             public int compare(Personas p1, Personas p2){
                return Integer.compare(p1.getBirthday().getYear(), p2.getBirthday().getYear());
            }
         });

        //Usando un lambda
        personas.sort((puno, pdos) -> Integer.compare(puno.getBirthday().getYear(), pdos.getBirthday().getYear()));





    }
}
