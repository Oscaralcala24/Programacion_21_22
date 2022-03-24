package U7.Repaso_1920_Tarde;

import java.util.Comparator;

public class OrdenarPacienteEdad implements Comparator<Paciente> {
    @Override
    public int compare(Paciente p1, Paciente p2) {
        if (p1.getEdad() > p2.getEdad()){
            return -1;
        }else if (p1.getEdad() < p2.getEdad()){
            return 1;
        }
        return 0;
    }
}
