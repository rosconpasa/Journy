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



    public static List<String> reversedSorting(List<Student> list){
        return list.stream().
                map(Student::getName).
                sorted(Collections.reverseOrder()).
                collect(Collectors.toList());

    }

    public static List<Integer> sortedNumbers(List<Integer> list){
        return list.stream().
                sorted().
                collect(Collectors.toList());
    }


}
