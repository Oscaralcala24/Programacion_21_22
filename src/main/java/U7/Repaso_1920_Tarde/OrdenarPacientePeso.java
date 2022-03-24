package U7.Repaso_1920_Tarde;

import java.util.Comparator;

public class OrdenarPacientePeso implements Comparator<Paciente> {
    @Override
    public int compare(Paciente p1, Paciente p2) {

        if (p1.getPeso() > p2.getPeso()){
            return -1;
        }else if (p1.getPeso() < p2.getPeso()){
            return 1;
        }
        return 0;
    }
}
