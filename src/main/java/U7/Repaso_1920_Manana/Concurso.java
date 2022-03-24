package U7.Repaso_1920_Manana;

import java.io.*;
import java.util.*;

public class Concurso implements Serializable {
    private String nombreConcurso;
    private String localidad;
    private List<Perro> listaPerros = new ArrayList<>();
    private Map<Perro.Raza,List<Perro>> mapaPerros = new HashMap<>();

    public Concurso(String nombreConcurso, String localidad) {
        setNombreConcurso(nombreConcurso);
        setLocalidad(localidad);
    }

    public void ownerDogs(int numeroSocio){
        boolean tiene = false;
        Iterator<Perro.Raza> it0 = mapaPerros.keySet().iterator();
        while (it0.hasNext()){
            Perro.Raza razaAux = it0.next();
            List<Perro> aux = mapaPerros.get(razaAux);
            Iterator<Perro> it1 = aux.iterator();
            while (it1.hasNext()){
                Perro perroAux = it1.next();
                if (perroAux.getPropietario().getNumeroSocio() == numeroSocio){
                    System.out.println(perroAux);
                }
            }
        }
    }

    public void perrosporPeso(Perro.Raza raza){
        Iterator<Perro.Raza> it0 = mapaPerros.keySet().iterator();
        while (it0.hasNext()){
            Perro.Raza razaAux = it0.next();
            if (razaAux.equals(raza)){
                List<Perro> listaPerros = mapaPerros.get(raza);
                Collections.sort(listaPerros, new OrdenarPesoDecreciente());
                System.out.println(listaPerros);
            }
        }
    }

    public void perrosporEdad(Perro.Raza raza){
        Iterator<Perro.Raza> it0 = mapaPerros.keySet().iterator();
        while (it0.hasNext()){
            Perro.Raza razaAux = it0.next();
            if (razaAux.equals(raza)){
                List<Perro> listaPerros = mapaPerros.get(raza);
                Collections.sort(listaPerros, new OrdenarEdadDecreciente());
                System.out.println(listaPerros);
            }
        }
    }

    public void cargarPerros(){
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/main/java/U7/Repaso_1920_Manana/Perros.dat"))){
             List<Perro> listaAux = (List<Perro>) in.readObject();
             mapaPerros.clear();
             Iterator<Perro> it0 = listaAux.iterator();
             while (it0.hasNext()){
                 Perro perroAux = it0.next();
                 addDog(perroAux.getRaza(),perroAux);
             }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void disqualifyDog(Perro perro){
        boolean esta = false;
        Iterator<Perro.Raza> it0 = mapaPerros.keySet().iterator();
        while (it0.hasNext()){
            Perro.Raza razaAux = it0.next();
            List<Perro> aux = mapaPerros.get(razaAux);
            Iterator<Perro> it1 = aux.iterator();
            while (it1.hasNext()){
                Perro perroAux = it1.next();
                if (perroAux.equals(perro)){
                    it1.remove();
                    esta= true;
                }
            }
        }
        if(!esta) {
            System.out.println("Perro no inscrito");
        }
    }

    public void guardarPerros(){
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/main/java/U7/Repaso_1920_Manana/Perros.dat",true))) {
            List<Perro> listaPerrosGuardar = new ArrayList<>();
            Iterator<Perro.Raza> it0 = mapaPerros.keySet().iterator();
            while (it0.hasNext()){
                Perro.Raza razaAux = it0.next();
                List<Perro> listaPerrosPorRaza = mapaPerros.get(razaAux);
                listaPerrosPorRaza.addAll(listaPerrosPorRaza);
            }
            out.reset();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addDog(Perro.Raza raza,Perro perro){
        if (!mapaPerros.containsKey(raza)){
            List<Perro> aux = new ArrayList<>();
            aux.add(perro);
            mapaPerros.put(raza,aux);
        }else {
            mapaPerros.get(raza).add(perro);
        }
        listaPerros.add(perro);
    }

    public String getNombreConcurso() {
        return nombreConcurso;
    }

    public void setNombreConcurso(String nombreConcurso) {
        this.nombreConcurso = nombreConcurso;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

}
