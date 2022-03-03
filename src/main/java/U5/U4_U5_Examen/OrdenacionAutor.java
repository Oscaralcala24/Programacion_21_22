package U5.U4_U5_Examen;

import java.util.Comparator;

public class OrdenacionAutor implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        AgrupacionOficial a1 = (AgrupacionOficial) o1;
        AgrupacionOficial a2 = (AgrupacionOficial) o2;
        return a1.getAutor().compareTo(a2.getAutor());
    }
}
