package U5.Tarea2.Ejercicio2;

import java.util.Comparator;

public class CompararNombre implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Cliente cliente1 = (Cliente) o1;
        Cliente cliente2 = (Cliente) o2;
        cliente1.compareTo(cliente2);

    }
}
