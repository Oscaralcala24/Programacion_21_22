package U5.U4U5_Entregable;

import java.util.Comparator;

public class OrdenarAnyo implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Multimedia m1 = (Multimedia) o1;
        Multimedia m2 = (Multimedia) o2;

        if (m1.getAnoPublicacion() < m2.getAnoPublicacion()){
            return -1;
        } else if (m1.getAnoPublicacion() > m2.getAnoPublicacion()) {
            return 1;
        }
        return 0;
    }

}
