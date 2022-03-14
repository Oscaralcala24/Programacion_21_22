package U7.Tarea2;

import java.util.Comparator;

public class Ordenar13 implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Integer entero1 = (Integer) o1;
        Integer entero2 = (Integer) o2;
        if (entero1 > entero2){
            return -1;
        }else if (entero1 < entero2){
            return 1;
        }
        return 0;
    }
}
