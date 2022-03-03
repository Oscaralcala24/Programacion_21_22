package U5.Prueba2021;

import java.util.Comparator;

public class OrdenarXParticipantes implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Pais pais1 = (Pais) o1;
        Pais pais2 = (Pais) o2;
        if (pais1.getNumeroParticipantes() < pais2.getNumeroParticipantes()){
            return 1;
        }else if (pais1.getNumeroParticipantes() > pais2.getNumeroParticipantes()){
            return -1;
        }
        return 0;
    }
}
