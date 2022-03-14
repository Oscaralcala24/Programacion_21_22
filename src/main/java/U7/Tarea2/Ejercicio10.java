package U7.Tarea2;

//Actividad 10: Hacer lo mismo que en el ejercicio anterior con la intersección ,
// formada por los elementos comunes a los dos conjuntos. Su prototipo es:
//
//Set interseccion (Set conjunto1, Set conjunto2)

import java.util.Set;
import java.util.TreeSet;

public class Ejercicio10 {
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
        System.out.println(interseccion(conjunto1,conjunto2));
    }

    private static Set interseccion(Set conjunto1, Set conjunto2) {
        Set<String> conjuntoAux = new TreeSet<>(conjunto1);
        conjuntoAux.retainAll(conjunto2);
        return conjuntoAux;
    }
}
