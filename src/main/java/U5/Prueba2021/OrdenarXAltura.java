package U5.Prueba2021;

import java.util.Comparator;

public class OrdenarXAltura implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Baloncestista p1 = (Baloncestista) o1;
        Baloncestista p2 = (Baloncestista) o2;
        if (p1.getAltura() < p2.getAltura()){
            return -1;
        }else if (p1.getAltura() > p2.getAltura()){
            return 1;
        }
        return 0;
    }
}
