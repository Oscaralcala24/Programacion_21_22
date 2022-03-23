package U7.Repaso_2021_Tarde;

import java.io.*;
import java.util.*;

public class Instituto implements Serializable {
    private String nombreInstituto;
    private ArrayList<Unidad> listaUnidad = new ArrayList<>();
    private Map<Unidad,ArrayList<Alumno>> mapaUnidad = new LinkedHashMap<>();

    public Instituto(String nombreInstituto) {
        this.nombreInstituto = nombreInstituto;
    }

    void addAlumnoUnidad(Alumno a1, Unidad u1) {
        if (mapaUnidad.containsKey(u1)){
            ArrayList<Alumno> listaAux = mapaUnidad.get(u1);
            listaAux.add(a1);
            System.out.println(listaAux.toString());
            mapaUnidad.put(u1,listaAux);
        }else  {
            ArrayList<Alumno> listaAux = new ArrayList<>();
            listaAux.add(a1);
            System.out.println(listaAux.toString());
            mapaUnidad.put(u1,listaAux);
        }
    }

    void obtenerUnidadAlumno(int id){
        Iterator<Unidad> it = mapaUnidad.keySet().iterator();
        while (it.hasNext()){
            Unidad unidadAux = it.next();
            ArrayList<Alumno> valores2 = mapaUnidad.get(unidadAux);
            Iterator<Alumno> it2 = valores2.iterator();
            while (it2.hasNext()){
                Alumno alumAux = it2.next();
                if (alumAux.getIdAlumno()==id){
                    System.out.println(unidadAux);
                }
            }
        }
    }

    void mostrarAlumnosUnidad(Unidad unidad){
        Iterator<Unidad> it = mapaUnidad.keySet().iterator();
        while (it.hasNext()){
            Unidad unidadAux = it.next();
            if (unidadAux.equals(unidad)){
                System.out.println(unidad);
            }
        }
    }

    void mostrarTodosAlumnosOrdenados(){
        List<Alumno> listaAlumnos = new ArrayList<>();
        Iterator<Unidad> it = mapaUnidad.keySet().iterator();
        while (it.hasNext()){
            Unidad unidadAux = it.next();
            ArrayList<Alumno> valores2 = mapaUnidad.get(unidadAux);
            Iterator<Alumno> it2 = valores2.iterator();
            while (it2.hasNext()){
                Alumno alumAux = it2.next();
                listaAlumnos.add(alumAux);
            }
        }
        Collections.sort(listaAlumnos, new OrdenarApellido());
    }

    public Map<Unidad, ArrayList<Alumno>> getMapaUnidad() {
        return mapaUnidad;
    }

    void cargarAlumnos(){
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/main/java/U7/Repaso_2021_Tarde/alumnos.dat"));
            List<Alumno> listaAlumnos = (List<Alumno>) in.readObject();
            Map<Unidad,ArrayList<Alumno>> mapaUnidadNuevo = new LinkedHashMap<>();
            Iterator<Alumno> it = listaAlumnos.iterator();
            while (it.hasNext()){
                Alumno alumnoAux = it.next();
                if (mapaUnidadNuevo.containsKey(alumnoAux.getUnidad())){
                    ArrayList<Alumno> listaAux = mapaUnidadNuevo.get(alumnoAux.getUnidad());
                    listaAux.add(alumnoAux);
                    mapaUnidadNuevo.put(alumnoAux.getUnidad(), listaAux);
                }else{
                    ArrayList<Alumno> listaAux = new ArrayList<>();
                    listaAux.add(alumnoAux);
                    mapaUnidad.put(alumnoAux.getUnidad(),listaAux);
                }
            }
            mapaUnidad = mapaUnidadNuevo;
            in.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    void guardarAlumnos(){
        try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/main/java/U7/Repaso_2021_Tarde/alumnos.dat"));
            List<Alumno> listaAlumnos = new ArrayList<>();
            Iterator<Unidad> it = mapaUnidad.keySet().iterator();
            while (it.hasNext()){
                Unidad unidadAux = it.next();
                ArrayList<Alumno> valores2 = mapaUnidad.get(unidadAux);
                Iterator<Alumno> it2 = valores2.iterator();
                while (it2.hasNext()){
                    Alumno alumAux = it2.next();
                    listaAlumnos.add(alumAux);
                }
            }
            out.writeObject(listaAlumnos);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
