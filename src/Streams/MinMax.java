package Streams;

import java.util.List;

public class MinMax {

    public static int minValue(List<Integer> list){

        return list.stream().
                min(Integer::compare).
                orElse(-1111);

    }

    public static int maxValue(List<Integer> list){

        return list.stream().
                max(Integer::compare).
                orElse(-1111);

    }
}
