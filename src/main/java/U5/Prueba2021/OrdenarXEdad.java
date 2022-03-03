package U5.Prueba2021;

import java.util.Comparator;

public class OrdenarXEdad implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Participante p1 = (Participante) o1;
        Participante p2 = (Participante) o2;
        if (p1.getEdadAtleta() < p2.getEdadAtleta()){
            return -1;
        }else if (p1.getEdadAtleta() > p2.getEdadAtleta()){
            return 1;
        }
        return 0;
    }
}
