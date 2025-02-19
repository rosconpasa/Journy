package Streams;

import java.util.List;
import java.util.stream.Collectors;

public class Distinct {
    public static List<Integer> uniqueNumbers(List<Integer> list) {
        return list.stream().
                distinct().
                collect(Collectors.toList());
    }

    public static List<String> uniqueStrings(List<String> list){
        return list.stream().
                distinct().
                collect(Collectors.toList());
    }



}
