package U7.Repaso_2021_Tarde;

import java.util.Comparator;

public class OrdenarApellido implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Alumno a1 = (Alumno) o1;
        Alumno a2 = (Alumno) o2;
        return a1.getApellidosAlumno().compareTo(a2.getApellidosAlumno());
    }
}
