package U7.Tarea1;

//Actividad 2: Repetir el ejercicio anterior, pero ordenar la lista en sentido decreciente.

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Integer> numerosEnteros = new ArrayList<>();
        for (int i = 0; i < 20 ; i++) {
            numerosEnteros.add((int) (1 + Math.random()*99));
        }
        mostrarArray(numerosEnteros);
        Collections.sort(numerosEnteros);
        Collections.reverse(numerosEnteros);
        System.out.println();
        mostrarArray(numerosEnteros);

    }

    private static void mostrarArray(ArrayList<Integer> numerosEnteros) {
        for (Integer i: numerosEnteros) {
            System.out.print(i + " ");
        }
    }
}
