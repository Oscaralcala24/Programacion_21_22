package U5.Tarea2.Ejercicio2;

import java.util.Comparator;

public class CompararEdad implements Comparator {

    @Override
    public int compare(Object o1, Object o2){
        Cliente cliente1 = (Cliente) o1;
        Cliente cliente2 = (Cliente) o2;
        if (cliente1.getEdad() < cliente2.getEdad()){
            return -1;
        }else if (cliente1.getEdad() > cliente2.getEdad()){
            return 1;
        }
        return 0;
    }
}
