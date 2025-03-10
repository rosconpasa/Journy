package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {

    public static void main(String[] args) {

        /*
        Intermediate Operations :

        Map(), filter(), distinct(), sorted(), limit(), skip()

        Terminal Operations :

        forEach(), toArray(), reduce(), collect(), min(), max(), count(), anyMatch(),
         allMatch(), noneMatch(), findFirst(), findAny()
        */
        List<String> words = List.of("Avionetas", "Moto", "Inmortales", "Inmortales");

        List<Integer> numbers = new ArrayList<>(List.of(-1, 2, -3, -4, 5, 2, 3, 8, 9, 10));



        Student student1 = new Student("Alan", 14, 2.5);
        Student student2 = new Student("Carol", 15, 3);
        Student student3 = new Student("Barry", 14, 3.0);
        Student student4 = new Student("Fatima", 15, 4.5);
        Student student5 = new Student("Fatima", 15, 4.5);

        List<Student> students = List.of(student1, student2, student3, student4, student5);
        //Stream<Student> streamStudents = Stream.of(student1, student2, student3);

        System.out.println("________________________________________________");
        System.out.println(students);
        System.out.println(numbers);
        System.out.println(words);
        System.out.println("\n\n");
        System.out.println("\n\n");
        System.out.println("________________________________________________");


        System.out.println("Palabras que contengan una letra específica (a): " + Filter.specificCharacter(words));
        System.out.println("Números pares: " + Filter.evenNumbers(numbers));
        System.out.println("Números negativos: " + Filter.negativeNumbers(numbers));
        System.out.println("Palabras de más de una longitud específica (5): " + Filter.longWords(words));
        System.out.println("Estudiantes que aprobaron: " + Filter.pass(students));


        System.out.println("________________________________________________");
        System.out.println(students);
        System.out.println(numbers);
        System.out.println(words);
        System.out.println("\n\n");
        System.out.println("\n\n");
        System.out.println("________________________________________________");


        System.out.println("Sin repeticiones: " + Distinct.uniqueNumbers(numbers));
        System.out.println("Sin repeticiones: " + Distinct.uniqueStrings(words));
        System.out.println("Sin repeticiones\n: " + Distinct.uniqueStudent(students));
        System.out.println("Nombres distintos: " + Distinct.getNames(students));

        System.out.println("________________________________________________");
        System.out.println(students);
        System.out.println(numbers);
        System.out.println(words);
        System.out.println("\n\n");
        System.out.println("\n\n");
        System.out.println("________________________________________________");

        System.out.println("A mayúsculas: " + Map.toUpperCase(words));
        System.out.println("Primeros tres caracteres: " + Map.getFirstThreeCharacters(words));
        System.out.println("Obtener solo los nombres: " + Map.getNames(students));
        System.out.println("Obtener la inical: " + Map.getFirstCharacter(students));
        System.out.println("Elevar al cuadrado: " + Map.toPower(numbers));
        System.out.println("Longitud de las palabras: " + Map.getLength(words));

        System.out.println("________________________________________________");
        System.out.println(students);
        System.out.println(numbers);
        System.out.println(words);
        System.out.println("\n\n");
        System.out.println("\n\n");
        System.out.println("________________________________________________");

        System.out.println("Nombres ordenados: " + Sorted.sortedNames(students));
        System.out.println("Nombres ordenados al revés: " + Sorted.reversedSorting(students));
        System.out.println("Array ordenado: " + Sorted.sortedNumbers(numbers));



    }
}
