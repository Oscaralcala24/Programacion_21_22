package U7.Repaso_1920_Manana;

import java.util.*;

public class Concurso {
    private String nombreConcurso;
    private String localidad;
    private List<Perro> listaPerros = new ArrayList<>();
    private Map<Perro.Raza,List<Perro>> mapaPerros = new HashMap<>();

    public Concurso(String nombreConcurso, String localidad) {
        setNombreConcurso(nombreConcurso);
        setLocalidad(localidad);
    }

    public void disqualifyDog(Perro perro){
        if (mapaPerros.containsValue(perro)){
            Set<Map.Entry<Perro.Raza,List<Perro>>> entradas = mapaPerros.entrySet();
            Iterator<Map.Entry<Perro.Raza,List<Perro>>> it0 = entradas.iterator();
            while (it0.hasNext()){
                Map.Entry<Perro.Raza,List<Perro>> aux = it0.next();
                if (aux.getValue().equals(perro)){
                    it0.remove();
                }
            }
        }else {
            System.out.println("Perro no inscrito");
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
