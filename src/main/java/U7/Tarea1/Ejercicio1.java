package U7.Tarea1;

//Actividad 1: Crear una colección de 20 números enteros aleatorios menores que 100,
// y guardarlos en el orden en que se vayan generando; mostrar por pantalla dicha lista una vez creada.
// Ordenarla en sentido creciente y volverla a mostrar por pantalla.

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<Integer> numerosEnteros = new ArrayList<>();
        for (int i = 0; i < 20 ; i++) {
            numerosEnteros.add((int) (1 + Math.random()*99));
        }
        mostrarArray(numerosEnteros);
        Collections.sort(numerosEnteros);
        System.out.println();
        mostrarArray(numerosEnteros);

    }

    private static void mostrarArray(ArrayList<Integer> numerosEnteros) {
        for (Integer i: numerosEnteros) {
            System.out.print(i + " ");
        }
    }
}
