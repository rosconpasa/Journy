package Streams;

import java.util.List;

public class Skip {

    public static List<Integer> skipFirstTwoElements(List<Integer> list){
        return list.stream().
                skip(2).
                toList();
    }

    public static List<String> skipFirstAndLastTwoElements(List<String> list){
        return list.stream().
                skip(2).limit(list.size()-2).
                toList();
    }
}
