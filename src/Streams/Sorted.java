package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {

    public static List<String> sortedNames(List<Student> list){
        return list.stream().
                map(Student::getName).
                sorted().
                collect(Collectors.toList());
    }

    public static List<Student> sortedStudents (List<Student> list){
        return list.stream().
                sorted().
                collect(Collectors.toList());
    }

    public static List<String> reversedSorting(List<String> list){
        return list.stream().
                sorted(Collections.reverseOrder()).
                collect(Collectors.toList());

    }

    public static int[] sortedNumbers(int[] array){
        return Arrays.stream(array).
                sorted().
                toArray();
    }


}
