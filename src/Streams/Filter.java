package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Filter {


    public static List<Integer> evenNumbers(List<Integer> list) {
        return list.stream().
                filter(x -> x % 2 == 0).
                collect(Collectors.toList());
    }


    public static List<String> longWords(List<String> list) {
        return list.stream().
                filter(x -> x.length() > 5).
                collect(Collectors.toList());
    }



    public static List<Student> pass(List<Student> list) {

        return list.stream().
                filter(x -> x.getGrade() >= 3).
                collect(Collectors.toList());
    }


    public static List<Integer> negativeNumbers(List<Integer> list) {
        return list.stream().
                filter(x ->x<0).
                collect(Collectors.toList());
    }

    public static List<String> specificCharacter (List<String> list){
        return list.stream().
                filter(x->x.toLowerCase().contains("a")).
                collect(Collectors.toList());
    }
}
