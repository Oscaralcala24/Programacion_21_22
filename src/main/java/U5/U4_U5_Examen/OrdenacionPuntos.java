package U5.U4_U5_Examen;

import java.util.Comparator;

public class OrdenacionPuntos implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        AgrupacionOficial a1 = (AgrupacionOficial) o1;
        AgrupacionOficial a2 = (AgrupacionOficial) o2;
        if (a1.getPuntosObtenidos() < a2.getPuntosObtenidos()){
            return 1;
        }else if (a1.getPuntosObtenidos() > a2.getPuntosObtenidos()){
            return -1;
        }
        return 0;
    }
}
