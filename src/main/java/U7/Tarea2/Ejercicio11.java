package U7.Tarea2;

//Actividad 11: Diseñar un método que devuelva la diferencia de dos conjuntos
// (elementos que pertenecen al primero, pero no al segundo). Con el prototipo:
//
//Set diferencia (Set conjunto1, Set conjunto2)

import java.util.Set;
import java.util.TreeSet;

public class Ejercicio11 {
    public static void main(String[] args) {
        Set<String> conjunto1 = new TreeSet<>();
        Set<String> conjunto2 = new TreeSet<>();
        conjunto1.add("Oscar");
        conjunto1.add("Marta");
        conjunto1.add("Luis");
        conjunto1.add("Pepe");
        conjunto2.add("Luis");
        conjunto2.add("Maria");
        conjunto2.add("Oscar");
        System.out.println(diferencia(conjunto1,conjunto2));
    }

    private static Set diferencia(Set conjunto1, Set conjunto2) {
        Set<String> conjuntoAux = new TreeSet<>(conjunto1);
        Set<String> conjuntoAux2 = new TreeSet<>(conjunto2);
        conjuntoAux.removeAll(conjunto2);
        conjuntoAux2.removeAll(conjunto1);
        Set<String> conjuntoDevolver = new TreeSet<>(conjuntoAux);
        conjuntoDevolver.addAll(conjuntoAux2);
        return conjuntoDevolver;

    }
}
