package U7.Tarea2;

//Actividad 12: Escribir el método incluido(), que devuelve true si todos los elementos del primer
// conjunto pertenecen al segundo y false si hay algún elemento del primero que no pertenezca al segundo.
// Su prototipo es:
//
//boolean incluido(Set conjunto1, Set conjunto2)

import java.util.Set;
import java.util.TreeSet;

public class Ejercicio12 {
    public static void main(String[] args) {
        Set<String> conjunto1 = new TreeSet<>();
        Set<String> conjunto2 = new TreeSet<>();
        conjunto1.add("Oscar");
        conjunto1.add("Marta");
        conjunto1.add("Luis");
        conjunto1.add("Pepe");
        conjunto2.add("Oscar");
        conjunto2.add("Marta");
        conjunto2.add("Luis");
        conjunto2.add("Pepe");
        /*conjunto2.add("Luis");
        conjunto2.add("Maria");
        conjunto2.add("Oscar");*/
        System.out.println(incluido(conjunto1,conjunto2));
    }

    private static boolean incluido(Set conjunto1, Set<String> conjunto2) {
        return conjunto1.containsAll(conjunto2);
    }
}
