package U7.Tarea5;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.*;

public class Aprobados implements Serializable {

    private static Map<Integer, ArrayList<Double>> mapaNotas = new LinkedHashMap<>();
    private static Map<Integer,IntroducirAspirantes> aspirantesMap = new LinkedHashMap<>();
    TreeSet<Aspirante> aprobados = new TreeSet<>();

    static void cargarID(){
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/main/java/U7/Tarea5/calificaciones.dat"));
            ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("src/main/java/U7/Tarea5/aspirantes.dat"));
            mapaNotas = (Map<Integer, ArrayList<Double>>) in.readObject();
            aspirantesMap = (Map<Integer, IntroducirAspirantes>) in.readObject();
            in.close();
            in2.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    static void guardarDatosMedia(){
        for (Integer i: mapaNotas.keySet()) {
            aspirantesMap.get(i).setMedia(calcularMedia(i));
        }
    }

    public static Double calcularMedia(Integer id){
        ArrayList<Double> notas = mapaNotas.get(id);
        double suma = 0;
        for (Double nota : notas){
            suma += nota;
        }
        Double media = suma / notas.size();
        return media;
    }
}
