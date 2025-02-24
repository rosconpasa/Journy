package Streams;

import java.util.List;
import java.util.stream.Collectors;

public class Map {

    public static List<Integer> toPower(List<Integer> list) {
        return list.stream().
                map(x -> (int) Math.pow(x, 2)).
                collect(Collectors.toList());
    }

    public static List<String> toUpperCase(List<String> list) {
        return list.stream().
                map(String::toUpperCase).
                collect(Collectors.toList());
    }

    public static List<Integer> getLength(List<String> list) {
        return list.stream().
                map(String::length).
                collect(Collectors.toList());
    }

    public static List<String> getNames(List<Student> list){
        return list.stream().
                map(Student::getName).
                collect(Collectors.toList());
    }

    public static List<Character> getFirstCharacter(List<Student> list){
        return list.stream().
                map(x -> x.getName().charAt(0)).
                collect(Collectors.toList());
    }

    public static List<String> getFirstThreeCharacters (List<String> list){
        return list.stream().
                map(word -> word.substring(0, 3)).
                collect(Collectors.toList());
    }


}
