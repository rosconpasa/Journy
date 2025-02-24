package Comparator;

import java.util.Comparator;

public class ComparadorPersonas implements Comparator<Personas> {

    @Override
    public int compare(Personas p1, Personas p2){
        return Integer.compare(p1.getBirthday().getYear(), p2.getBirthday().getYear());
    }
}
