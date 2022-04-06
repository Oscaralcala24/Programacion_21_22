package UnidadExtra;

//- Actividad 1: A partir de una lista de 100 enteros aleatorios menores que 1000:
//Calcula cuántos son primos.
//Determina cuál es el mayor, el menor, la suma de todos ellos y el valor promedio.

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Actividad1 {
    public static void main(String[] args) {
        List<Integer> listaAleatorios = generarNumAleatorios();

        listaAleatorios.stream().forEach(System.out::println);
        System.out.println();

        int numeroPrimos = (int) listaAleatorios.stream().filter(x -> comprobarPrimo(x)).count();

        int mayorNumero =  listaAleatorios.stream().max(Integer::compareTo).get();
        System.out.println(mayorNumero);
        int menorNumero =  listaAleatorios.stream().min(Integer::compareTo).get();
        System.out.println(menorNumero);
        int sumaNumeros = listaAleatorios.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sumaNumeros);
        Double mediaNumeros = listaAleatorios.stream().mapToDouble(Integer::doubleValue).average().getAsDouble();
        System.out.println(mediaNumeros);
    }

    private static boolean comprobarPrimo(Integer x) {
        int contador = 0;
        for (int i = 1; i <= x; i++) {
            if (x%i == 0){
                contador++;
            }
        }
        if (contador == 2){
            return true;
        }
        return false;
    }

    private static List<Integer> generarNumAleatorios() {
        List<Integer> listaDevolver = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            listaDevolver.add((int) (1+(Math.random()*1000)));
        }
        return listaDevolver;
    }
}
