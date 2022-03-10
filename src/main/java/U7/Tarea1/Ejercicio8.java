package U7.Tarea1;

//Actividad 8: Implementar una función a la que se le pase una lista de nombres
// y devuelva una copia sin elementos repetidos (sin modificar la original), con el prototipo:

import java.util.*;

public class Ejercicio8 {
    public static void main(String[] args) {
        List<String> listaArray = new ArrayList<>();
        listaArray.add("Oscar");
        listaArray.add("Juanlu");
        listaArray.add("Juanlu");
        listaArray.add("David");
        listaArray.add("Rafa");
        listaArray.add("David");
        listaArray.add("Julian");
        listaArray.add("Oscar");
        List<String> listaSinRepetidos = new ArrayList<>(quitarRepetidos(listaArray));
        mostrarLista(listaArray);
        System.out.println();
        System.out.println();
        mostrarLista(listaSinRepetidos);
    }

    private static void mostrarLista(List<String> listaNombres) {
        for (String i: listaNombres) {
            System.out.println(i + " ");
        }
    }

    private static List quitarRepetidos(List listaArray) {
        TreeSet<String> treeLista = new TreeSet<>(listaArray);
        return new ArrayList<>(treeLista);
    }
}
