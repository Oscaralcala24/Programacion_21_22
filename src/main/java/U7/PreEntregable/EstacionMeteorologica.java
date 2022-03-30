package U7.PreEntregable;


import java.io.*;
import java.util.*;

public class EstacionMeteorologica {
    private List<Medicion> listaMedicion = new ArrayList<>();
    private Coordenadas coordenadas;

    public EstacionMeteorologica(String ruta, Coordenadas coordenadas) {
        this.listaMedicion = leerMedicion(ruta);
        this.coordenadas = coordenadas;
    }

    public EstacionMeteorologica(Coordenadas coordenadas) {
        this.coordenadas = coordenadas;
    }

    private List<Medicion> leerMedicion(String ruta){
        List<Medicion> listaDevolver = new ArrayList<>();
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(ruta))) {
            return listaDevolver = (List<Medicion>) in.readObject();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return listaDevolver;
    }

    void addMedicion(Medicion m1){
        listaMedicion.add(m1);
    }

    Set<Medicion> ordenaTemperaturasAsc(){
        Set<Medicion> medicionesOrdenadas = new TreeSet<>(listaMedicion);
        return medicionesOrdenadas;
    }

    Set<Medicion> ordenaHumedadesDesc(){
        Set<Medicion> medicionesOrdenadas = new TreeSet<>( new Comparator<Medicion>() {
            @Override
            public int compare(Medicion o1, Medicion o2) {
                if (o1.getHumedad() > o2.getHumedad()){
                    return -1;
                }else if (o1.getHumedad() < o2.getHumedad()){
                    return 1;
                }
                return 0;
            }
        });
        medicionesOrdenadas.addAll(listaMedicion);
        return medicionesOrdenadas;
    }

    Medicion presionMaxima(){
        int mayorPresion = 0;
        Medicion medicionDevolver = null;
        Iterator<Medicion> it0 = listaMedicion.iterator();
        while (it0.hasNext()){
            Medicion medicionAux = it0.next();
            if (mayorPresion < medicionAux.getPresion()){
                mayorPresion = medicionAux.getPresion();
                medicionDevolver = medicionAux;
            }
        }
        return medicionDevolver;
    }

    boolean buscaMedicion(Medicion medicion) {
        boolean esta = false;
        Iterator<Medicion> it0 = listaMedicion.iterator();
        while (it0.hasNext()) {
            Medicion medicionAux = it0.next();
            if (medicionAux.equals(medicion)) {
                esta = true;
            }
        }
        return esta;
    }

    void guardarFichero(String ruta){
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ruta))){
            out.writeObject(listaMedicion);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "EstacionMeteorologica{" +
                "listaMedicion=" + listaMedicion +
                ", coordenadas=" + coordenadas +
                '}';
    }
}
