package U7.Alcala_Espigares_U6U7_Examen;

import java.io.*;
import java.util.*;

public class Filmaffinity {

    private List<Pelicula> listaPeliculas = new ArrayList<>();
    private List<Actor> listaActor = new ArrayList<>();
    private Map<Pelicula,Set<Actor>> repartoActores = new HashMap<>();
    private Map<Actor,Set<Pelicula>> participacionPeliculas = new HashMap<>();


    public void addPeliculaActor(Pelicula p, Actor a){
        if (!listaPeliculas.contains(p)){
            listaPeliculas.add(p);
        }
        if (!listaActor.contains(a)){
            listaActor.add(a);
        }
        if (!repartoActores.containsKey(p)){
            Set<Actor> listaAuxActor = new LinkedHashSet<>();
            listaAuxActor.add(a);
            repartoActores.put(p,listaAuxActor);
        }else {
            repartoActores.get(p).add(a);
        }
        if (!participacionPeliculas.containsKey(a)){
            Set<Pelicula> listaAuxPelicula = new LinkedHashSet<>();
            listaAuxPelicula.add(p);
            participacionPeliculas.put(a,listaAuxPelicula);
        }else {
            participacionPeliculas.get(a).add(p);
        }
    }

    public List<Actor> getActores(Pelicula p){
        if (!repartoActores.containsKey(p)){
            return null;
        }
        Set<Actor> listaOrdenada = new TreeSet<>(repartoActores.get(p));
        List<Actor> listaDevolver = new ArrayList<>();
        listaDevolver.addAll(listaOrdenada);
        return listaDevolver;
    }

    public List<Pelicula> getPeliculas(Actor a){
        Set<Pelicula> listaOrdenada = new TreeSet<>(participacionPeliculas.get(a));
        List<Pelicula> listaDevolver = new ArrayList<>();
        listaDevolver.addAll(listaOrdenada);
        return listaDevolver;


    }

    public Pelicula getPelicula(String titulo){
        Pelicula peliculaAux = new Pelicula(titulo,"","","","");
        Iterator<Pelicula> it0 = listaPeliculas.iterator();
        while (it0.hasNext()){
            Pelicula pelicula = it0.next();
            if (pelicula.equals(peliculaAux)){
                return pelicula;
            }
        }
        return null;
    }

    public void removePelicula(String titulo){
        Iterator<Pelicula> it0 = listaPeliculas.iterator();
        while (it0.hasNext()){
            Pelicula peliculaAux = it0.next();
            if (peliculaAux.getTitulo().equals(titulo)){
                it0.remove();
            }
        }
        Iterator<Pelicula> it1 = repartoActores.keySet().iterator();
        while (it1.hasNext()){
            Pelicula peliculaAux = it1.next();
            if (peliculaAux.getTitulo().equals(titulo)){
                it1.remove();
            }
        }
        Iterator<Actor> it2 = participacionPeliculas.keySet().iterator();
        while (it2.hasNext()){
            Actor actorAux = it2.next();
            Iterator<Pelicula> iteradorPelicula = participacionPeliculas.get(actorAux).iterator();
            while (iteradorPelicula.hasNext()){
                Pelicula peliculaABorrar = iteradorPelicula.next();
                if (peliculaABorrar.getTitulo().equals(titulo)){
                    iteradorPelicula.remove();
                }
            }
        }
    }

    public Actor getActor(String nombre, String apellido){
        Actor actorAux = new Actor(nombre,apellido,"");
        Iterator<Actor> it0 = listaActor.iterator();
        while (it0.hasNext()){
            Actor actor = it0.next();
            if (actor.equals(actorAux)){
                return actor;
            }
        }
        return null;
    }


    public void guardarDatos(){
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/main/java/U7/Alcala_Espigares_U6U7_Examen/filmaffinity.dat"))){
            out.writeObject(listaPeliculas);
            out.writeObject(listaActor);
            out.writeObject(repartoActores);
            out.writeObject(participacionPeliculas);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void cargarDatos(){
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/main/java/U7/Alcala_Espigares_U6U7_Examen/filmaffinity.dat"))){
            listaPeliculas.clear();
            listaPeliculas = (List<Pelicula>) in.readObject();
            listaActor.clear();
            listaActor = (List<Actor>) in.readObject();
            repartoActores.clear();
            repartoActores = (Map<Pelicula, Set<Actor>>) in.readObject();
            participacionPeliculas.clear();
            participacionPeliculas = (Map<Actor, Set<Pelicula>>) in.readObject();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
