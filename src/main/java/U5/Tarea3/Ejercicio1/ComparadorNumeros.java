package U5.Tarea3.Ejercicio1;

import java.util.Comparator;

public class ComparadorNumeros implements Comparator {


    @Override
    public int compare(Object o1, Object o2) {
        Integer t1 = (Integer) o1;
        Integer t2 = (Integer) o2;
        return t2.compareTo(t1);
    }

}
