package U7.U6U7_Entregable;

import java.io.*;
import java.util.*;

public class Exchange implements Serializable{
    private Map<Divisa,List<ParCotizacion>> mapaCotizaciones = new HashMap<>();
    private static List<ParCotizacion> listaCotizaciones = new ArrayList<>();


    public void addCotizacion(ParCotizacion cotizacion){
        Divisa divisaAux = cotizacion.getDivisaBase();
        if (!mapaCotizaciones.containsKey(divisaAux)){
            List<ParCotizacion> listaCotizacionAux = new ArrayList<>();
            listaCotizacionAux.add(cotizacion);
            mapaCotizaciones.put(divisaAux,listaCotizacionAux);
        }else {
            mapaCotizaciones.get(divisaAux).add(cotizacion);
        }
    }

    public List<ParCotizacion> obtenerCotizaciones(String simbolo){
        Iterator<Divisa> it0 = mapaCotizaciones.keySet().iterator();
        List<ParCotizacion> listaDevolver = new ArrayList<>();
        while (it0.hasNext()){
            Divisa divisaAux = it0.next();
            if (divisaAux.getSimbolo().equalsIgnoreCase(simbolo)){
                List<ParCotizacion> listaAux= mapaCotizaciones.get(divisaAux);
                Iterator<ParCotizacion> it1 = listaAux.iterator();
                while (it1.hasNext()){
                    ParCotizacion parAux = it1.next();
                    listaDevolver.add(parAux);
                }
            }
        }
        return listaDevolver;
    }

    public void mostrarCotizacionesAlAlzaUnaHora(){
        Iterator<Divisa> it0 = mapaCotizaciones.keySet().iterator();
        while (it0.hasNext()){
            Divisa divisaAux = it0.next();
            List<ParCotizacion> listaAux= mapaCotizaciones.get(divisaAux);
            Iterator<ParCotizacion> it1 = listaAux.iterator();
            while (it1.hasNext()){
                ParCotizacion parAux = it1.next();
                if (parAux.getVariacionPorcentual() > 0){
                    System.out.println(parAux);
                }
            }
        }
    }

    public void mostrarDivisasOrdenadas(){
        List<Divisa> listaDivisas = new ArrayList<>();
        listaDivisas.addAll(mapaCotizaciones.keySet());
        Collections.sort(listaDivisas,new OrdenarSimbolo());
        Iterator<Divisa> it0 = listaDivisas.iterator();
        while (it0.hasNext()){
            Divisa divisaAux = it0.next();
            System.out.println(divisaAux);
        }
    }


    public static List<ParCotizacion> getListaCotizaciones() {
        return listaCotizaciones;
    }

    public static void setListaCotizaciones(List<ParCotizacion> listaCotizaciones) {
        Exchange.listaCotizaciones = listaCotizaciones;
    }

    public void guardarCotizaciones(){
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/main/java/U7/U6U7_Entregable/cotizaciones.dat",true))){
            out.writeObject(mapaCotizaciones);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void recuperarCotizaciones(){
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/main/java/U7/U6U7_Entregable/cotizaciones.dat"))){
            mapaCotizaciones.clear();
            mostrarDivisasOrdenadas();
            mapaCotizaciones = (Map<Divisa, List<ParCotizacion>>) in.readObject();
            mostrarDivisasOrdenadas();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
