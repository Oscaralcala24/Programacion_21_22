package U7.Tarea2;

//Actividad 13: Implementar una función a la que se le pasen dos listas ordenadas y
// nos devuelva una única lista, fusión de las dos anteriores. Desarrollar el algoritmo de forma no destructiva,
// es decir, que las listas utilizadas como parámetros de entrada se mantengan intactas.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio13 {
    public static void main(String[] args) {
        ArrayList<Integer> lista1 = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();
        lista1.add(1);
        lista1.add(6);
        lista1.add(3);
        lista1.add(17);
        lista1.add(5);
        lista2.add(5);
        lista2.add(3);
        lista2.add(7);
        lista2.add(23);
        lista2.add(2);
        Collections.sort(lista1, new Ordenar13());
        Collections.sort(lista2, new Ordenar13());
        System.out.println(unirListaOrdenada(lista1,lista2));
    }

    private static ArrayList unirListaOrdenada(ArrayList<Integer> lista1, ArrayList<Integer> lista2) {
        ArrayList<Integer> arrayAux = new ArrayList<>(lista1);
        arrayAux.addAll(lista2);
        return arrayAux;
    }
}
