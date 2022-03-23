package U7.Tarea5;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CalificacionPruebas implements Serializable {

    private static ArrayList<Integer> listaParticipantes =  new ArrayList<>();
    private static Map<Integer, ArrayList<Double>> mapaNotas = new LinkedHashMap<>();

    static void cargarID(){
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/main/java/U7/Tarea5/ids_aspirantes.dat"));
            listaParticipantes = (ArrayList<Integer>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    static void calificarPrueba(){
        Scanner sc = new Scanner(System.in);
        for (Integer i: listaParticipantes) {
            ArrayList<Double> notas =  new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                System.out.println("Introduce la nota del alumno " + i + " numero " + j);
                Double nota = sc.nextDouble();
                notas.add(nota);

            }
            mapaNotas.put(i,notas);
        }
    }

    static void guardarFicheros(){
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/main/java/U7/Tarea5/calificaciones.dat",true));
            out.writeObject(mapaNotas);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
