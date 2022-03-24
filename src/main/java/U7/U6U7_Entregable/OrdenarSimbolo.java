package U7.U6U7_Entregable;

import java.util.Comparator;

public class OrdenarSimbolo implements Comparator<Divisa> {
    @Override
    public int compare(Divisa o1, Divisa o2) {
        return o1.getSimbolo().compareTo(o2.getSimbolo());
    }
}
