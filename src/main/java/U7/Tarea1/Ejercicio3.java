package U7.Tarea1;

//Actividad 3: Crear una colección de 20 números enteros aleatorios menores que 10, guardarlos
// por orden decreciente a medida que se vayan generando y mostrar la colección por pantalla.

import java.util.ArrayList;
import java.util.Iterator;

public class Ejercicio3 {
    public static void main(String[] args) {

        ArrayList<Integer> numerosEnteros = new ArrayList<>();
        for (int i = 0; i < 20 ; i++) {

            Integer numeroRandom = ((int) (1 + Math.random()*9));
            numerosEnteros.add(numeroRandom);
        }
        mostrarArray(numerosEnteros);
    }

    private static void mostrarArray(ArrayList<Integer> numerosEnteros) {
        for (Integer i: numerosEnteros) {
            System.out.print(i + " ");
        }
    }
}
