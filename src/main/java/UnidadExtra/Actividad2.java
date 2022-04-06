package UnidadExtra;

//A partir de una lista con los enteros del 1 al 100, crea un Stream con los múltiplos de 7. Muéstralos por pantalla.

import java.util.ArrayList;
import java.util.List;

public class Actividad2 {
    public static void main(String[] args) {
        List<Integer> listaAleatorios = generarNumAleatorios();
        listaAleatorios.stream().filter(x -> x%7 == 0).forEach(System.out::println);

    }
    private static List<Integer> generarNumAleatorios() {
        List<Integer> listaDevolver = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            listaDevolver.add((int) (1+(Math.random()*100)));
        }
        return listaDevolver;
    }
}
