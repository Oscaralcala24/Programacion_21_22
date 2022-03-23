package U7.Repaso_2021_Tarde;

import java.io.Serializable;
import java.util.ArrayList;

public class Unidad implements Serializable {
    private String nombreUnidad;
    private ArrayList<Alumno> listaAlumno = new ArrayList<>();

    public Unidad(String nombreUnidad) {
        this.nombreUnidad = nombreUnidad;
    }

    @Override
    public String toString() {
        return "Unidad{" +
                "nombreUnidad='" + nombreUnidad + '\'' +
                ", listaAlumno=" + listaAlumno +
                '}';
    }
}
