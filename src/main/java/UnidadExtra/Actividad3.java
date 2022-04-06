package UnidadExtra;

//Fusiona dos listas, cada una con 20 enteros aleatorios entre 1 y 100,
// en un Stream ordenado sin repeticiones. Muestra los elementos del Stream.

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Actividad3 {
    public static void main(String[] args) {

        List<Integer> listaAleatorios1 = generarNumAleatorios();
        List<Integer> listaAleatorios2 = generarNumAleatorios();
        Stream.concat(listaAleatorios1.stream(),listaAleatorios2.stream())
                .distinct()
                .sorted((x,y) -> x.compareTo(y)).forEach(System.out::println);


    }

    private static List<Integer> generarNumAleatorios() {
        List<Integer> listaDevolver = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            listaDevolver.add((int) (1+(Math.random()*100)));
        }
        return listaDevolver;
    }

}
