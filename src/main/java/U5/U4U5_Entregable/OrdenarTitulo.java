package U5.U4U5_Entregable;

import java.util.Comparator;

public class OrdenarTitulo implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Multimedia m1 = (Multimedia) o1;
        Multimedia m2 = (Multimedia) o2;

        return m1.getTitulo().compareTo(m2.getTitulo());
    }
}
