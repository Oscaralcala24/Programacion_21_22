package U7.Repaso_1920_Manana;

import java.util.Comparator;

public class OrdenarPesoDecreciente implements Comparator<Perro> {

    @Override
    public int compare(Perro o1, Perro o2) {
        Perro p1 = (Perro) o1;
        Perro p2 = (Perro) o2;
        if (p1.getPesoPerro() > o2.getPesoPerro()){
            return -1;
        }else if (p1.getPesoPerro() < o2.getPesoPerro()){
            return 1;
        }
        return 0;
    }
}
