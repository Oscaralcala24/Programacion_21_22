package U5.Tarea1.Parte4;

import java.util.Comparator;

public class compararPrecioFinal implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Lavadora lv1 = (Lavadora) o1;
        Lavadora lv2 = (Lavadora) o2;
        if (lv1.getPrecioFinal() < lv2.getPrecioFinal()){
            return -1;
        }else if (lv1.getPrecioFinal() > lv2.getPrecioFinal()){
            return 1;
        }
        return 0;
    }
}
