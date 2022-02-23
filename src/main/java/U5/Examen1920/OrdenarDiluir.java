package U5.Examen1920;

import java.util.Comparator;

public class OrdenarDiluir implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Material m1 = (Material) o1;
        Material m2 = (Material) o2;
        if (m1.getCapDiluir() > m2.getCapDiluir()){
            return -1;
        } else if (m1.getCapDiluir() < m2.getCapDiluir()) {
            return 1;
        }
        return 0;
    }
}
