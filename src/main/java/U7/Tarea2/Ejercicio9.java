package U7.Tarea2;

//Actividad 9: Implementar el método unión de dos conjuntos, que devuelva un nuevo conjunto
// con todos los elementos que pertenezcan, al menos, a uno de los dos conjuntos. Su prototipo es:
//
//Set union (Set conjunto1, Set conjunto2)

import java.util.*;

public class Ejercicio9 {
    public static void main(String[] args) {
        Set<String> conjunto1 = new TreeSet<>();
        Set<String> conjunto2 = new TreeSet<>();
        conjunto1.add("Oscar");
        conjunto1.add("Marta");
        conjunto1.add("Luis");
        conjunto1.add("Pedro");
        conjunto2.add("Eva");
        conjunto2.add("Maria");
        conjunto2.add("Antonio");
        System.out.println(union(conjunto1,conjunto2));
    }

    private static Set union(Set conjunto1, Set conjunto2) {
        List<String> arrayJunto = new ArrayList<>();
        arrayJunto.addAll(conjunto1);
        arrayJunto.addAll(conjunto2);
        Set<String> arrayDevuelto = new HashSet<>(arrayJunto);
        return arrayDevuelto;
    }
}
