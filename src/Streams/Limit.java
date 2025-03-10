package Streams;

import java.util.List;

public class Limit {

    public static List<Integer> firstTwoElements(List<Integer> list){
        return list.stream().
                limit(2).
                toList();
    }

    public static List<String> firstTwoWords(List<String> list){ //sorted words
        return list.stream().
                sorted().
                limit(2).
                toList();
    }
}
