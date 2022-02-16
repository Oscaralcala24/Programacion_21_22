package U5.Tarea2.Ejercicio3;

import java.util.Comparator;

public class CompararColorTriangulo implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Triangulo t1 = (Triangulo) o1;
        Triangulo t2 = (Triangulo) o2;
        return t1.getColorines().toString().compareTo(t2.getColorines().toString());
    }
}
