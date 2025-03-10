package Streams;

import java.util.List;

public class Count {

    public static long countWordsSpecificLength(List<String> list){
        return list.stream().
                filter(x -> x.length() >5).
                count();
    }

    public static long countHigherNumbers(List<Integer> list){
        return list.stream().
                filter(x -> x>6).
                count();
    }

    public static long countWordsStartSpecificCharacter(List<String> list){
        return list.stream().
                filter(x -> x.startsWith("A")).
                count();
    }

    public static long countOddNumbers(List<Integer> list){
        return list.stream().
                filter(x -> x%2!=0).
                count();
    }

    public static long countDistinctElement(List<Student> list){
        return list.stream().
                distinct().
                count();
    }

    public static long countWordsContainsSpecificCharacter(List<String> list){
        return list.stream().
                filter(x -> x.contains("O")).
                count();
    }
}
