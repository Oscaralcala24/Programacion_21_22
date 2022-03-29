package U7.Repaso_2021_Manana;

import java.io.*;
import java.util.*;

public class Maraton implements Serializable{

    private static Map<Atleta.CategoriaAtleta, Set<Atleta>> mapaAtletas = new HashMap<>();

    void inscribirAtleta(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del atleta:");
        String nombre = sc.nextLine();
        System.out.println("Introduce el pais del atleta:");
        String pais = sc.nextLine();
        System.out.println("Introduce la categoria del atleta:");
        System.out.println("1.Senior");
        System.out.println("2.Junior");
        System.out.println("3.Veterano");
        int respuesta = sc.nextInt();
        Atleta.CategoriaAtleta categoria;
        switch (respuesta){
            case 1: categoria = Atleta.CategoriaAtleta.SENIOR; break;
            case 2: categoria = Atleta.CategoriaAtleta.JUNIOR; break;
            case 3: categoria = Atleta.CategoriaAtleta.VETERANO; break;
            default:
                throw new IllegalStateException("Unexpected value: " + respuesta);
        }
        Atleta at1 = new Atleta(nombre,pais,categoria);

        if (mapaAtletas.containsKey(at1.getCategoria())){
             mapaAtletas.get(at1.getCategoria()).add(at1);
        }else{
            Set<Atleta> listaAux = new HashSet<>();
            listaAux.add(at1);
            mapaAtletas.put(at1.getCategoria(),listaAux);
        }
    }

    void borrarAtleta(int dorsal){
        Iterator<Atleta.CategoriaAtleta> it0 = mapaAtletas.keySet().iterator();
        while (it0.hasNext()){
            Atleta.CategoriaAtleta categoria = it0.next();
            Set<Atleta> listaAtletas = mapaAtletas.get(categoria);
            Iterator<Atleta> it1 = listaAtletas.iterator();
            while (it1.hasNext()){
                Atleta atletaAux = it1.next();
                if (atletaAux.getDorsal() == dorsal){
                    it1.remove();
                }
            }
        }
    }

    void guardarTiempo(int dorsal, double tiempo){
        Iterator<Atleta.CategoriaAtleta> it0 = mapaAtletas.keySet().iterator();
        while (it0.hasNext()){
            Atleta.CategoriaAtleta categoria = it0.next();
            Set<Atleta> listaAtletas = mapaAtletas.get(categoria);
            Iterator<Atleta> it1 = listaAtletas.iterator();
            while (it1.hasNext()){
                Atleta atletaAux = it1.next();
                if (atletaAux.getDorsal() == dorsal){
                    atletaAux.setMarcaRealizada(tiempo);
                    atletaAux.setFinisher(true);
                }
            }
        }
    }

    void MostrarListaFinishers(){
        Iterator<Atleta.CategoriaAtleta> it0 = mapaAtletas.keySet().iterator();
        Set<Atleta> atletasMostrar = new TreeSet<>();
        while (it0.hasNext()){
            Atleta.CategoriaAtleta categoria = it0.next();
            Set<Atleta> listaAtletas = mapaAtletas.get(categoria);
            Iterator<Atleta> it1 = listaAtletas.iterator();
            while (it1.hasNext()){
                Atleta atletaAux = it1.next();
                if (atletaAux.isFinisher()){
                    atletasMostrar.add(atletaAux);
                }
            }
        }
        Iterator<Atleta> mostrarLista = atletasMostrar.iterator();
        while (mostrarLista.hasNext()){
            System.out.println(mostrarLista.next());
        }
    }

    void MostrarListaCategoria(Atleta.CategoriaAtleta categoria) {
        Set<Atleta> atletasMostrar = mapaAtletas.get(categoria);
        TreeSet<Atleta> tree_set = new TreeSet<>(atletasMostrar);

        Iterator<Atleta> mostrarLista = atletasMostrar.iterator();
        while (mostrarLista.hasNext()){
            System.out.println(mostrarLista.next());
        }
    }

    void ParticipantesPorPaís(String pais){
        Iterator<Atleta.CategoriaAtleta> it0 = mapaAtletas.keySet().iterator();
        int numeroParticipantesPais = 0;
        while (it0.hasNext()) {
            Atleta.CategoriaAtleta categoria = it0.next();
            Set<Atleta> listaAtletas = mapaAtletas.get(categoria);
            Iterator<Atleta> it1 = listaAtletas.iterator();
            while (it1.hasNext()) {
                Atleta atletaAux = it1.next();
                if (pais.equalsIgnoreCase(atletaAux.getPais())){
                     numeroParticipantesPais++;
                }
            }
        }
        System.out.println("Hay " + numeroParticipantesPais + " de este pais.");
    }

    void guardarAtletas(){
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/main/java/U7/Repaso_2021_Manana/maraton.dat"))) {
            out.writeObject(mapaAtletas);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void cargarAtletas(){
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/main/java/U7/Repaso_2021_Manana/maraton.dat"))) {
            mapaAtletas.clear();
            mapaAtletas = (Map<Atleta.CategoriaAtleta, Set<Atleta>>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
