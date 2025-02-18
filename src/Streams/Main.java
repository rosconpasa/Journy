package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<String> words = List.of("Avionetas", "Moto", "Inmortales");

        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        /**
         *  Intermediate Operations :
         *
         * map(), filter(), distinct(), sorted(), limit(), skip()
         *
         * Terminal Operations :
         *
         * forEach(), toArray(), reduce(), collect(), min(), max(), count(), anyMatch(), allMatch(),
         * noneMatch(), findFirst(), findAny()
         */

        // Filtrar números pares de una lista
        Stream<Integer> stream = numbers.stream();
        List<Integer> numerosPares = numbers.stream().filter(x -> x % 2 == 0).toList();
        System.out.println(numerosPares);





        // Filtrar palabras largas de una lista
        Stream<String> longWords = words.stream();
        List<String> palabrasLargas = longWords.filter(x -> x.length() > 4).collect(Collectors.toList());
        System.out.println(palabrasLargas);





        // Filtrar estudiantes aprobados
        Student student1 = new Student("Alan", 14, 2.5);
        Student student2 = new Student("Barry", 14, 3.0);
        Student student3 = new Student("Fatima", 15, 4.5);

        // List<Student> students = List.of(student1, student2, student3);
        Stream<Student> streamStudents = Stream.of(student1, student2, student3);

        List<Student> aprobados = streamStudents.filter(x -> x.getGrade() >= 3).toList();
        System.out.println("Aprobados: " + aprobados);




        //Filtrar números negativos de un array de enteros
        int[] numbersArray = {-1, 2, -3, 4, 5};
        System.out.println(Arrays.toString(numbersArray));
        IntStream streamNumbers = Arrays.stream(numbersArray);
        List<Integer> negativeNumbers = streamNumbers.filter(x -> x < 0).boxed().collect(Collectors.toList());
        System.out.println("números negativos del array: "+negativeNumbers);

        // Filtrar cadenas que contienen una letra específica
        Stream<String> specificCharacter = words.stream();
        System.out.println("Palabras que continen la 'a': "+specificCharacter.filter(x -> x.toLowerCase().contains("a")).collect(Collectors.toList()));
    }
}
