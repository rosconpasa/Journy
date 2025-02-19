package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class Main {

    public static void main(String[] args) {

        List<String> words = List.of("Avionetas", "Moto", "Inmortales", "Inmortales");

        List<Integer> numbers = new ArrayList<>(List.of(-1, 2, -3, -4, 5, 2, 3, 8, 9, 10));


        Student student1 = new Student("Alan", 14, 2.5);
        Student student2 = new Student("Barry", 14, 3.0);
        Student student3 = new Student("Fatima", 15, 4.5);

         List<Student> students = List.of(student1, student2, student3);
        //Stream<Student> streamStudents = Stream.of(student1, student2, student3);

        System.out.println(Filter.specificCharacter(words));
        System.out.println(Filter.evenNumbers(numbers));
        System.out.println(Filter.negativeNumbers(numbers));
        System.out.println(Filter.longWords(words));
        System.out.println(Filter.pass(students));


        System.out.println(Distinct.uniqueNumbers(numbers));
        System.out.println(Distinct.uniqueStrings(words));


    }
}
